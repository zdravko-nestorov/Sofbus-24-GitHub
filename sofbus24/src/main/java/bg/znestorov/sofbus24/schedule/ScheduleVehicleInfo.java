package bg.znestorov.sofbus24.schedule;

import android.app.Activity;
import android.app.ProgressDialog;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.text.Html;

import java.util.ArrayList;

import bg.znestorov.sofbus24.databases.StationsDataSource;
import bg.znestorov.sofbus24.entity.DirectionsEntity;
import bg.znestorov.sofbus24.entity.PublicTransportStationEntity;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.main.History;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.publictransport.ChooseDirectionDialog;
import bg.znestorov.sofbus24.publictransport.RetrievePublicTransportDirection;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.TranslatorCyrillicToLatin;

/**
 * Class used to retrieve info for a SKGT vehicle (used in Schedule tab (home
 * screen) and History activity)
 *
 * @author Zdravko Nestorov
 * @version 1.0
 *
 */
public class ScheduleVehicleInfo {

    private final Activity context;
    private final Object callerInstance;

    private final StationsDataSource stationsDatasource;
    private final String language;

    public ScheduleVehicleInfo(Activity context, Object callerInstance) {

        this.context = context;
        this.callerInstance = callerInstance;

        this.stationsDatasource = new StationsDataSource(context);
        this.language = LanguageChange.getUserLocale(context);
    }

    /**
     * Retrieve an information about the selected vehicle
     *
     * @param vehicle
     *            the selected vehicle
     * @param vehicleTitle
     *            the vehicle title in format: "xxxxx №xxx"
     */
    public void onListItemClick(VehicleEntity vehicle, String vehicleTitle) {

        String vehicleNumber = vehicle.getNumber();
        if ("1-ТБ".equals(vehicleNumber)) {
            proceedSpecialCase(createDirectionEntity1TB(vehicle));
        } else if ("6-А".equals(vehicleNumber)) {
            proceedSpecialCase(createDirectionEntity6A(vehicle));
        } else if ("10-ТМ".equals(vehicleNumber)) {
            proceedSpecialCase(createDirectionEntity10TM(vehicle));
        } else if ("11-А".equals(vehicleNumber)) {
            proceedSpecialCase(createDirectionEntity11A(vehicle));
        } else if ("11-ТМ".equals(vehicleNumber)) {
            proceedSpecialCase(createDirectionEntity11TM(vehicle));
        } else if ("12-А".equals(vehicleNumber)) {
            proceedSpecialCase(createDirectionEntity12A(vehicle));
        } else if ("44-Б".equals(vehicleNumber)) {
            proceedSpecialCase(createDirectionEntity44B(vehicle));
        } else {
            proceedStandardCase(vehicle, vehicleTitle);
        }
    }

    /**
     * Retrieve an information about the selected vehicle
     *
     * @param scheduleStationAdapter
     *            the ScheduleVehicleAdapter
     * @param position
     *            the position of the selected vehicle
     */
    public void onListItemClick(ScheduleVehicleAdapter scheduleStationAdapter,
                                int position) {

        VehicleEntity vehicle = (VehicleEntity) scheduleStationAdapter
                .getItem(position);
        String rowCaption = scheduleStationAdapter.getVehicleCaption(context,
                vehicle);

        onListItemClick(vehicle, rowCaption);
    }

    /**
     * Create a direction entity in case the vehicle is a bus with number 1-TB
     *
     * @param vehicle
     *            the selected vehicle with number 1-TB
     * @return a direction entity for this tram
     */
    private DirectionsEntity createDirectionEntity1TB(VehicleEntity vehicle) {
        ArrayList<String> vt = new ArrayList<String>();
        ArrayList<String> lid = new ArrayList<String>();
        ArrayList<String> rid = new ArrayList<String>();

        ArrayList<String> directionsNames = new ArrayList<String>();
        ArrayList<StationEntity> stationsList;
        ArrayList<ArrayList<StationEntity>> directionsList = new ArrayList<ArrayList<StationEntity>>();

        // Direction 1
        vt.add("1");
        lid.add("190");
        rid.add("2238");
        directionsNames
                .add(translateString("Пета градска болница - Бул. Прага"));
        stationsList = new ArrayList<StationEntity>();
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1256", translateString("Пета градска болница"), "28584"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0324", translateString("Бул. Княгиня Мария Луиза"), "3531"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2105", translateString("Ул. Охрид"), "3536"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2171", translateString("Ул.Св.Св.Кирил и Методий"), "11885"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2111", translateString("Ул. Пиротска"), "11895"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0283", translateString("Бул. Ал. Стамболийски"), "14666"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1295", translateString("Пл.Руски паметник"), "14648"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1296", translateString("Пл.Руски паметник"), "22636"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0366", translateString("Бул. Прага"), "22656"));
        directionsList.add(stationsList);

        // Direction 2
        vt.add("1");
        lid.add("190");
        rid.add("2237");
        directionsNames
                .add(translateString("Бул. Прага - Пета градска болница"));
        stationsList = new ArrayList<StationEntity>();
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0366", translateString("Бул. Прага"), "22656"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0355", translateString("Бул. Пенчо Славейков"), "22668"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "6300", translateString("УМБАЛСМ Пирогов"), "22680"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1300", translateString("Пл. Руски паметник"), "14649"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0284", translateString("Бул. Ал. Стамболийски"), "14667"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2114", translateString("Ул. Пиротска"), "11892"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2170", translateString("Ул.Св.Св. Кирил и Методий"), "11882"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2102", translateString("Ул. Охрид"), "28563"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0339", translateString("Бул. Ген. Н.Столетов"), "28580"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2596", translateString("Пета градска болница"), "28583"));
        directionsList.add(stationsList);

        return new DirectionsEntity(vehicle, 0, 0, vt, lid, rid,
                directionsNames, directionsList);
    }

    /**
     * Create a direction entity in case the vehicle is a tram with number 6-A
     *
     * @param vehicle
     *            the selected vehicle with number 6-A
     * @return a direction entity for this tram
     */
    private DirectionsEntity createDirectionEntity6A(VehicleEntity vehicle) {
        ArrayList<String> vt = new ArrayList<String>();
        ArrayList<String> lid = new ArrayList<String>();
        ArrayList<String> rid = new ArrayList<String>();

        ArrayList<String> directionsNames = new ArrayList<String>();
        ArrayList<StationEntity> stationsList;
        ArrayList<ArrayList<StationEntity>> directionsList = new ArrayList<ArrayList<StationEntity>>();

        // Direction 1
        vt.add("0");
        lid.add("49");
        rid.add("1316");
        directionsNames
                .add(translateString("ж. к. Обеля-2 - Гара София север"));
        stationsList = new ArrayList<StationEntity>();
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0679", translateString("ж. к. Обеля-2"), "4405"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0013", translateString("140 СОУ"), "4479"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0872", translateString("кв. Обеля"), "4467"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0059", translateString("Автостанция Обеля"), "4902"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "1710", translateString("Търговски к-с Обеля"), "4447"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0593", translateString("ж. к. Връбница-1"), "4356"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "1838", translateString("ул. Бели Дунав"), "4346"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0334", translateString("Бул. Ломско шосе"), "5379"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0222", translateString("Бул. 458 ж.к. Надежда 4"), "5397"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0019", translateString("24-ти ДКЦ"), "5385"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0002", translateString("102-ро ОУ"), "5398"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "1901", translateString("Ул. Ген. Никола Жеков"), "5391"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "2575", translateString("бул. Рожен"), "5400"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0540", translateString("Модна къща Агресия"), "3996"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0374", translateString("Модна къща Агресия"), "3993"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0477", translateString("Гара София север"), "3982"));
        directionsList.add(stationsList);

        // Direction 2
        vt.add("0");
        lid.add("49");
        rid.add("1317");
        directionsNames.add(translateString("Гара София север - Ж.к.Обеля 2"));
        stationsList = new ArrayList<StationEntity>();
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0476", translateString("Гара София север"), "3986"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0375", translateString("Модна къща Агресия"), "4088"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0547", translateString("Бул.Рожен"), "4005"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "2574", translateString("Бул.ген.Никола Жеков"), "5358"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "2578", translateString("102-ро ОУ"), "5399"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0018", translateString("24-ти ДКЦ"), "5364"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0221", translateString("Бл. 458 ж.к. Надежда 4"), "5396"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "2576", translateString("Бул.Ломско шосе"), "5371"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "2577", translateString("Ул.Бели Дунав"), "4349"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0592", translateString("ж.к. Връбница"), "4416"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "1709", translateString("Търговски комплекс Обеля"), "4448"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0060", translateString("Автостанция Обеля"), "4458"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0873", translateString("Кв.Обеля"), "4468"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0012", translateString("140 СОУ"), "4478"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0680", translateString("Ж.к.Обеля 2"), "4403"));
        directionsList.add(stationsList);

        return new DirectionsEntity(vehicle, 0, 0, vt, lid, rid,
                directionsNames, directionsList);
    }

    /**
     * Create a direction entity in case the vehicle is a bus with number 10-TM
     *
     * @param vehicle
     *            the selected vehicle with number 10-TM
     * @return a direction entity for this bus
     */
    private DirectionsEntity createDirectionEntity10TM(VehicleEntity vehicle) {
        ArrayList<String> vt = new ArrayList<String>();
        ArrayList<String> lid = new ArrayList<String>();
        ArrayList<String> rid = new ArrayList<String>();

        ArrayList<String> directionsNames = new ArrayList<String>();
        ArrayList<StationEntity> stationsList;
        ArrayList<ArrayList<StationEntity>> directionsList = new ArrayList<ArrayList<StationEntity>>();

        // Direction 1
        vt.add("1");
        lid.add("145");
        rid.add("2346");
        directionsNames.add(translateString("Зоопарка - Хотел Хилтън"));
        stationsList = new ArrayList<StationEntity>();
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0749", translateString("Зоопарка"), "16359"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0977", translateString("КП Бенакс"), "16353"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2314", translateString("Хлебозавода"), "16335"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2654", translateString("Кв.Хладилника"), "17308"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0342", translateString("Бул.Никола Вапцаров"), "17294"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2039", translateString("Ул.Люботрън"), "25748"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0923", translateString("Кемпински хотел Зографски"), "26999"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2330", translateString("Хотел Хемус"), "18120"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0397", translateString("Хотел Хилтън"), "18115"));
        directionsList.add(stationsList);

        // Direction 2
        vt.add("1");
        lid.add("145");
        rid.add("2345");
        directionsNames.add(translateString("Хотел Хилтън - Зоопарка"));
        stationsList = new ArrayList<StationEntity>();
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0397", translateString("Хотел Хилтън"), "18115"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1322", translateString("Хотел Хемус"), "25739"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0922", translateString("Кемпински хотел Зографски"), "25756"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2038", translateString("Ул.Люботрън"), "25747"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0343", translateString("Бул.Никола Вапцаров"), "25751"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2655", translateString("Кв.Хладилника"), "17311"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0912", translateString("Кв.Хладилника"), "13084"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2313", translateString("Хлебозавода"), "16336"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0976", translateString("КП Бенакс"), "16352"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0749", translateString("Зоопарка"), "16359"));
        directionsList.add(stationsList);

        return new DirectionsEntity(vehicle, 0, 0, vt, lid, rid,
                directionsNames, directionsList);
    }

    /**
     * Create a direction entity in case the vehicle is a trolley with number
     * 11-A
     *
     * @param vehicle
     *            the selected vehicle with number 11-A
     * @return a direction entity for this tram
     */
    private DirectionsEntity createDirectionEntity11A(VehicleEntity vehicle) {
        ArrayList<String> vt = new ArrayList<String>();
        ArrayList<String> lid = new ArrayList<String>();
        ArrayList<String> rid = new ArrayList<String>();

        ArrayList<String> directionsNames = new ArrayList<String>();
        ArrayList<StationEntity> stationsList;
        ArrayList<ArrayList<StationEntity>> directionsList = new ArrayList<ArrayList<StationEntity>>();

        // Direction 1
        vt.add("2");
        lid.add("22");
        rid.add("638");
        directionsNames
                .add(translateString("Площад Сточна гара - ж.к. Дружба 1"));
        stationsList = new ArrayList<StationEntity>();
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1319", translateString("пл. Сточна Гара"), "1038"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1964", translateString("ул. Искър"), "1030"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1242", translateString("пл. Васил Левски"), "483"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1698", translateString("СУ Св. Климент Охридски"), "469"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1287", translateString("пл. Орлов Мост"), "1765"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1394", translateString("Полиграфически Комбинат"), "1771"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0074", translateString("бул. Пейо Яворов"), "2177"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1820", translateString("ул. Александър Жендов"), "1999"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "2326", translateString("Хотел Плиска"), "2179"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1696", translateString("ж.к. Изток"), "1992"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1257", translateString("Площад на Авиацията"), "1929"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1260", translateString("Площад на Авиацията"), "1687"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "2615", translateString("Спортна Зала Арена Армеец"), "1688"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1152", translateString("СК ЦСКА"), "2026"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0370", translateString("бул. проф. Цв.Лазаров"), "1793"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1986", translateString("ул. кап. Д.Списаревски"), "2197"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0256", translateString("бл.98 ж.к. Дружба-1"), "2207"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0578", translateString("бул. Христофор Колумб"), "1837"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0235", translateString("Метростанция Дружба"), "1841"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0142", translateString("бл.155 ж.к. Дружба-1"), "1845"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0144", translateString("бл.162 ж.к. Дружба-1"), "2291"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0146", translateString("бл.170 ж.к. Дружба-1"), "2292"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0516", translateString("Депо Искър"), "1829"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0605", translateString("ж.к. Дружба-1"), "1834"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "2424", translateString("ж.к. Дружба-1"), "2928"));
        directionsList.add(stationsList);

        // Direction 2
        vt.add("2");
        lid.add("22");
        rid.add("613");
        directionsNames
                .add(translateString("ж.к. Дружба 1 - Площад Сточна гара"));
        stationsList = new ArrayList<StationEntity>();
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0517", translateString("Депо Искър"), "1828"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0147", translateString("бл.170 ж.к. Дружба-1"), "2293"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0143", translateString("бл.162 ж.к. Дружба-1"), "2290"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0141", translateString("бл.155 ж.к. Дружба-1"), "1844"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0236", translateString("Метростанция Дружба"), "1840"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0577", translateString("бул. Христофор Колумб"), "2218"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0257", translateString("бл.98 ж.к. Дружба-1"), "2206"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0255", translateString("бл.89 ж.к. Дружба-1"), "2198"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1983", translateString("ул. кап. Д.Списаревски"), "1794"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0371", translateString("бул. проф. Цв.Лазаров"), "2180"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1151", translateString("СК ЦСКА"), "2020"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "2616", translateString("Спортна Зала Арена Армеец"), "2019"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1695", translateString("ж.к. Изток"), "1990"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "2397", translateString("Хотел Плиска"), "1995"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1819", translateString("ул. Александър Жендов"), "2178"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "0073", translateString("бул. Пейо Яворов"), "2002"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1395", translateString("Полиграфически Комбинат"), "1770"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1288", translateString("пл. Орлов Мост"), "1764"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1699", translateString("СУ Св. Климент Охридски"), "470"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1241", translateString("пл. Васил Левски"), "2166"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1965", translateString("ул. Искър"), "1031"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TROLLEY,
                "1313", translateString("пл. Сточна Гара"), "1039"));
        directionsList.add(stationsList);

        return new DirectionsEntity(vehicle, 0, 0, vt, lid, rid,
                directionsNames, directionsList);
    }

    /**
     * Create a direction entity in case the vehicle is a bus with number 11-TM
     *
     * @param vehicle
     *            the selected vehicle with number 11-TM
     * @return a direction entity for this bus
     */
    private DirectionsEntity createDirectionEntity11TM(VehicleEntity vehicle) {
        ArrayList<String> vt = new ArrayList<String>();
        ArrayList<String> lid = new ArrayList<String>();
        ArrayList<String> rid = new ArrayList<String>();

        ArrayList<String> directionsNames = new ArrayList<String>();
        ArrayList<StationEntity> stationsList;
        ArrayList<ArrayList<StationEntity>> directionsList = new ArrayList<ArrayList<StationEntity>>();

        // Direction 1
        vt.add("1");
        lid.add("208");
        rid.add("1149");
        directionsNames
                .add(translateString("Площад Централна гара - Автостанция Илиянци"));
        stationsList = new ArrayList<StationEntity>();
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1328", translateString("Площад Централна гара"), "15026"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1326", translateString("Ул.Клокотница"), "15029"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0382", translateString("Бул.Христо Ботев"), "2844"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2081", translateString("Ул. Опълченска"), "2854"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2101", translateString("Ул. Охрид"), "16896"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0323", translateString("Бул. Княгиня Мария Луиза"), "16899"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1114", translateString("Надлез Надежда"), "6463"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0539", translateString("Модна къща Агресия"), "16545"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2674", translateString("Бул.Рожен"), "16110"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0727", translateString("ЗАГ Динамик"), "16104"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0745", translateString("Софарма АД"), "16098"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0754", translateString("Стоков базар Илиянци"), "16090"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1634", translateString("Хюндай България"), "16993"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0938", translateString("Центъра кв. Илиянци"), "17011"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0058", translateString("Автостанция Илиянци"), "7868"));
        directionsList.add(stationsList);

        // Direction 2
        vt.add("1");
        lid.add("208");
        rid.add("1150");
        directionsNames
                .add(translateString("Автостанция Илиянци - Площад Централна гара"));
        stationsList = new ArrayList<StationEntity>();
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0058", translateString("Автостанция Илиянци"), "7868"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0939", translateString("Автостанция Илиянци"), "17008"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1633", translateString("Хюндай България"), "16992"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0755", translateString("Стоков базар Илиянци"), "16091"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0744", translateString("Софарма АД"), "16099"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0728", translateString("ЗАГ Динамик"), "16105"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0546", translateString("Бул.Рожен"), "28841"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0542", translateString("Модна къща Агресия"), "16542"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2079", translateString("Ул. Опълченска"), "6608"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1328", translateString("Площад Централна гара"), "15026"));
        directionsList.add(stationsList);

        return new DirectionsEntity(vehicle, 0, 0, vt, lid, rid,
                directionsNames, directionsList);
    }

    /**
     * Create a direction entity in case the vehicle is a bus with number 12-A
     *
     * @param vehicle
     *            the selected vehicle with number 12-A
     * @return a direction entity for this bus
     */
    private DirectionsEntity createDirectionEntity12A(VehicleEntity vehicle) {
        ArrayList<String> vt = new ArrayList<String>();
        ArrayList<String> lid = new ArrayList<String>();
        ArrayList<String> rid = new ArrayList<String>();

        ArrayList<String> directionsNames = new ArrayList<String>();
        ArrayList<StationEntity> stationsList;
        ArrayList<ArrayList<StationEntity>> directionsList = new ArrayList<ArrayList<StationEntity>>();

        // Direction 1
        vt.add("0");
        lid.add("52");
        rid.add("607");
        directionsNames.add(translateString("Кв.Илиянци - Гара София север"));
        stationsList = new ArrayList<StationEntity>();
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0848", translateString("Кв.Илиянци"), "4145"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "1988", translateString("Ул.Кирил Благоев"), "4135"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "1916", translateString("Ул.Грозден"), "4123"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "1635", translateString("Хюндай България"), "4101"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0755", translateString("Стоков базар Илиянци"), "4036"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0744", translateString("Софарма АД"), "4030"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0728", translateString("ЗАГ Динамик"), "4022"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0546", translateString("Бул.Рожен"), "4008"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0540", translateString("Модна къща Агресия"), "3996"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0374", translateString("Модна къща Агресия"), "3993"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0477", translateString("Гара София север"), "3982"));
        directionsList.add(stationsList);

        // Direction 2
        vt.add("0");
        lid.add("52");
        rid.add("608");
        directionsNames.add(translateString("Гара София север - Кв.Илиянци"));
        stationsList = new ArrayList<StationEntity>();
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0476", translateString("Гара София север"), "3986"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0375", translateString("Модна къща Агресия"), "4088"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0547", translateString("Бул.Рожен"), "4005"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0727", translateString("ЗАГ Динамик"), "4025"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0745", translateString("Софарма АД"), "4031"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0754", translateString("Стоков базар Илиянци"), "4039"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "1636", translateString("Хюндай България"), "4104"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "1915", translateString("Ул.Грозден"), "4124"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "1987", translateString("Ул.Кирил Благоев"), "4136"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.TRAM,
                "0847", translateString("Кв.Илиянци"), "4150"));
        directionsList.add(stationsList);

        return new DirectionsEntity(vehicle, 0, 0, vt, lid, rid,
                directionsNames, directionsList);
    }

    /**
     * Create a direction entity in case the vehicle is a bus with number 44-B
     *
     * @param vehicle
     *            the selected vehicle with number 44-B
     * @return a direction entity for this bus
     */
    private DirectionsEntity createDirectionEntity44B(VehicleEntity vehicle) {
        ArrayList<String> vt = new ArrayList<String>();
        ArrayList<String> lid = new ArrayList<String>();
        ArrayList<String> rid = new ArrayList<String>();

        ArrayList<String> directionsNames = new ArrayList<String>();
        ArrayList<StationEntity> stationsList;
        ArrayList<ArrayList<StationEntity>> directionsList = new ArrayList<ArrayList<StationEntity>>();

        // Direction 1
        vt.add("1");
        lid.add("204");
        rid.add("1698");
        directionsNames
                .add(translateString("Автостанция Банкя - Метростанция Сливница"));
        stationsList = new ArrayList<StationEntity>();
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0050", translateString("Автостанция Банкя"), "22111"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1618", translateString("Стадиона Банкя"), "21910"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0107", translateString("Гробищен парк Банкя"), "19928"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0454", translateString("Гара Иваняне"), "19942"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0996", translateString("Къмпинга"), "21945"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1024", translateString("Махала Иваняне"), "21949"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0790", translateString("Кантона"), "21957"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2307", translateString("Хиподрума Банкя"), "21928"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2307", translateString("Разклона за с. Гурмазово"), "21973"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2520", translateString("Екобулсорт"), "21981"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1685", translateString("Промишлена зона"), "21985"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0771", translateString("Институт Пушкаров"), "21993"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0895", translateString("Кв. Република"), "10864"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1751", translateString("ПП Успех"), "10583"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1140", translateString("НЕСТЛЕ София"), "10595"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1061", translateString("Метростанция Сливница"), "21873"));
        directionsList.add(stationsList);

        // Direction 2
        vt.add("1");
        lid.add("204");
        rid.add("1705");
        directionsNames
                .add(translateString("Метростанция Сливница - Автостанция Банкя"));
        stationsList = new ArrayList<StationEntity>();
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1063", translateString("Метростанция Сливница"), "10770"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1141", translateString("Нестле София"), "10590"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1752", translateString("ПП Успех"), "10580"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0896", translateString("Кв. Република"), "22002"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0772", translateString("Институт Пушкаров"), "21992"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1686", translateString("Промишлена зона"), "21984"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2521", translateString("Екобулсорт"), "21980"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1431", translateString("Разклона за с. Гурмазово"), "21972"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "2308", translateString("Хиподрума Банкя"), "21874"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0789", translateString("Кантона"), "21956"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1027", translateString("Махала Иваняне"), "21948"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0997", translateString("Къмпинга"), "21944"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0453", translateString("Гара Иваняне"), "19939"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0106", translateString("Гробищен парк Банкя"), "19925"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1617", translateString("Стадиона Банкя"), "21911"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "1403", translateString("Ул. Хисаря"), "21908"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0503", translateString("Центъра Банкя"), "21906"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0502", translateString("Центъра Банкя"), "21907"));
        stationsList.add(createPublicTransportStation(VehicleTypeEnum.BUS,
                "0051", translateString("Автостанция Банкя"), "22109"));
        directionsList.add(stationsList);

        return new DirectionsEntity(vehicle, 0, 0, vt, lid, rid,
                directionsNames, directionsList);
    }

    /**
     * Translate the string if needed
     *
     * @param input
     *            the input string
     * @return the translated string (if needed)
     */
    private String translateString(String input) {
        String output;
        if (!"bg".equals(language)) {
            output = TranslatorCyrillicToLatin.translate(context, input);
        } else {
            output = input;
        }

        return output;
    }

    /**
     * Create a PublicTransportStationEntity using the given number, name and id
     *
     * @param number
     *            the station number
     * @param name
     *            the station name
     * @param id
     *            the station id
     * @return the PublicTransportStation entity
     */
    private PublicTransportStationEntity createPublicTransportStation(
            VehicleTypeEnum type, String number, String name, String id) {
        stationsDatasource.open();

        StationEntity station = stationsDatasource.getStation(number);
        if (station == null) {
            station = new StationEntity();
        }
        station.setNumber(number);
        station.setName(name);
        station.setType(type);

        stationsDatasource.close();

        return new PublicTransportStationEntity(station, id);
    }

    /**
     * Retrieve information about the selected vehicle in the special cases
     *
     * @param ptDirectionsEntity
     *            the DirectionEntity in the special case
     */
    private void proceedSpecialCase(DirectionsEntity ptDirectionsEntity) {
        // Get the fragment manager to start the dialog fragment
        FragmentManager fragmentManager;
        if (callerInstance instanceof ScheduleVehicleFragment) {
            fragmentManager = ((ScheduleVehicleFragment) callerInstance)
                    .getChildFragmentManager();
        } else {
            fragmentManager = ((History) callerInstance)
                    .getSupportFragmentManager();
        }

        DialogFragment dialogFragment = ChooseDirectionDialog
                .newInstance(ptDirectionsEntity);
        dialogFragment.show(fragmentManager, "dialog");
    }

    /**
     * Retrieve information about the selected vehicle in the standard cases
     *
     * @param vehicle
     *            the selected vehicle
     * @param rowCaption
     *            the selected row caption
     */
    private void proceedStandardCase(VehicleEntity vehicle, String rowCaption) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(Html.fromHtml(String.format(
                context.getString(R.string.pt_item_loading_schedule),
                rowCaption)));
        RetrievePublicTransportDirection retrievePublicTransportDirection = new RetrievePublicTransportDirection(
                context, callerInstance, progressDialog, vehicle);
        retrievePublicTransportDirection.execute();
    }

}