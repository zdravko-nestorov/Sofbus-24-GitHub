package bg.znestorov.sofbus24.updates.check;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import bg.znestorov.sofbus24.about.RetrieveAppConfiguration;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.LanguageChange;

/**
 * Dialog informing the user about the update options
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class ChooseUpdateDialog extends DialogFragment {

    private Fragment fragment;

    public static ChooseUpdateDialog newInstance() {
        return new ChooseUpdateDialog();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final FragmentActivity context = getActivity();
        fragment = getFragment();

        // Explicitly set the default locale before initializing the the dialog content
        // Otherwise the locale is incorrectly retrieved
        LanguageChange.selectLocale(context);

        // Initialize the dialog text fields
        String title = getString(R.string.update_db_app_choice);
        String[] updateChooseItems = getResources().getStringArray(R.array.updateChooseItems);
        ArrayAdapter<String> chooseUpdateAdapter = new ArrayAdapter<>(
                context,
                R.layout.activity_choose_update_item,
                updateChooseItems);


        // Initialize the dialog items
        ProgressDialog progressDialog = new ProgressDialog(context);
        DialogInterface.OnClickListener onListItemClickListener = (dialog, item) -> {

            // Dialog items prerequisites
            String message = item == 0
                    ? getString(R.string.about_update_db)
                    : getString(R.string.about_update_app);
            boolean isUpdateApp = item != 0;

            // Dialog items actions
            progressDialog.setMessage(message);
            RetrieveAppConfiguration retrieveAppConfiguration = new RetrieveAppConfiguration(
                    context, fragment, progressDialog, isUpdateApp);
            retrieveAppConfiguration.execute();
        };

        // Create the dialog with the initialized prerequisites
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title).setAdapter(chooseUpdateAdapter, onListItemClickListener);
        return builder.create();
    }

    /**
     * Return the currently active primary navigation fragment for this FragmentManager.
     * The primary navigation fragment is set by fragment transactions using
     * {@link FragmentTransaction#setPrimaryNavigationFragment(Fragment)}.
     *
     * @return the fragment designated as the primary navigation fragment
     */
    private Fragment getFragment() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            return fragmentManager.getPrimaryNavigationFragment();
        }
        return null;
    }
}