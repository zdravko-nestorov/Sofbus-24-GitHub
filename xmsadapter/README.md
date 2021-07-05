# This document provides brief instructions for app developers.
# To learn more, visit the following link:https://developer.huawei.com/consumer/en/doc/development/Tools-Guides/90419706# Please read the sections marked with asterisks(*) to apply the xmsadapter module.

Content:
1. Overview
2. Dependency *
3. AndroidManifest *
4. How to Use the xmsadapter Module *
5. About AppGallery Connect

1. Overview
HMS Convertor is a code conversion tool that supports Java and Kotlin projects. It helps developers automatically convert GMS APIs called by apps into HMS APIs, implementing quick conversion and HMS integration.
HMS Convertor generates code in a separate module (named as xmsadapter) and provides it as a separate Android Library.
To ensure the proper use of the module, it is recommended that you do not modify the generated code.

2. Dependency
The following kits are identified in your code:
Kit Name            Dependencies
Basement            com.google.android.gms:play-services-base:17.1.0
                    com.google.android.gms:play-services-basement:17.1.0
                    com.huawei.hms:base:6.0.0.300
                    com.google.android.gms:play-services-tasks:17.0.0
Map                 com.google.android.gms:play-services-base:17.1.0
                    com.google.android.gms:play-services-maps:17.0.0
                    com.google.android.gms:play-services-basement:17.1.0
                    com.huawei.hms:maps:5.3.0.300
                    com.huawei.hms:location:5.1.0.303
                    com.google.android.gms:play-services-location:17.0.0
                    com.google.android.material:material:1.0.0-rc01
Analytics           com.google.android.gms:play-services-base:17.1.0
                    com.google.android.gms:play-services-basement:17.1.0
                    com.huawei.hms:hianalytics:6.0.0.300
                    com.google.firebase:firebase-analytics:18.0.0
                    com.google.android.gms:play-services-analytics:17.0.0
The generated code is written into PROJECT_PATH/xmsadapter/src/main/java and we have added these dependencies to the build.gradle of xmsadapter module (only for compile).

3. AndroidManifest
Add permissions to the "AndroidManifest.xml" of your own module instead of the xmsadapter module!
For example, if you are integrating "Account" Kit, add '<users-permission android:name="android.permission.MANAGE_ACCOUNTS"/>'. Otherwise, an error "Missing permissions..." will occur during compilation.
To learn more about the permissions, visit the following link: https://developer.android.com/reference/android/Manifest.permission
NOTICE: If you want to build only the xmsadapter module rather than the whole project, you may need copy permissions to the "AndroidManifest.xml" of the xmsadapter module.
Because the generated code requires these permissions when compiling separately.

4. How to Use the xmsadapter Module
Step 1: Add "implementation project (path: ':xmsadapter')" to the "dependencies" block in the build.gradle file of your module that depends on the generated code.
Step 2: Add "xmsadapter" to the settings.gradle file.
(Optional) Step 3: Remove GMS-related dependencies from your original build.gradle file, because they have been added in the "xmsadapter" module.
Notice:
If you need more kits and want to generate related code, please refer the following tips:
Choice 1: Add the dependencies of the new kit to the build.gradle file of xmsadapter, and start a new conversion;
Choice 2: Add the dependencies of the new kit to the build.gradle file of your project.
After rescanning with our plugin(start a new conversion), copy the newly generated dependencies to build.gradle of xmsadapter. Because the newly generated code will depend on the new kit dependencies.

5. About AppGallery Connect
Before accessing AppGallery Connect, make preparations to ensure that you are familiar with AppGallery Connect services.
The services provided by AGC may be different from those provided by Firebase. For details about related documents and operation processes, please refer to the following:
1. Authentication:
https://developer.huawei.com/consumer/en/doc/development/Tools-Guides/agc-conversion-auth-0000001050157270#EN-US_TOPIC_0000001050157270__section104191036162614
2. Crashlytics:
https://developer.huawei.com/consumer/en/doc/development/Tools-Guides/agc-conversion-crash-0000001050159223#EN-US_TOPIC_0000001050159223__section6170175914464
3. DynamicLinks:
https://developer.huawei.com/consumer/en/doc/development/Tools-Guides/agc-conversion-dyna-0000001050157272#EN-US_TOPIC_0000001050157272__section567611378481
4. Functions:
https://developer.huawei.com/consumer/en/doc/development/Tools-Guides/agc-conversion-func-0000001050159225#EN-US_TOPIC_0000001050159225__section974018491170
5. RemoteConfig:
https://developer.huawei.com/consumer/en/doc/development/Tools-Guides/agc-conversion-remote-0000001050157274#EN-US_TOPIC_0000001050157274__section1897102414127
6. Performance:
https://developer.huawei.com/consumer/en/doc/development/Tools-Guides/agc-conversion-perf-0000001050773636#EN-US_TOPIC_0000001050773636__section0147124193414
7. Storage:
https://developer.huawei.com/consumer/en/doc/development/AppGallery-connect-Guides/agc-cloudstorage-introduction
8. InAppMessaging:
https://developer.huawei.com/consumer/en/doc/development/Tools-Guides/agc-conversion-inapp-0000001051053689#EN-US_TOPIC_0000001051053689__section16275141675911

