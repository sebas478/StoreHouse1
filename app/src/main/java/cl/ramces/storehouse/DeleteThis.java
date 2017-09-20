package cl.ramces.storehouse;

/**
 * Created by sebas on 14-09-2017.
 */

public class DeleteThis {

   /* 09-14 21:24:03.954 6549-6549/? I/art: Late-enabling -Xcheck:jni
09-14 21:24:03.991 6549-6549/cl.ramces.storehouse D/ActivityThread: ActivityThread,attachApplication
09-14 21:24:04.020 6549-6563/cl.ramces.storehouse E/HAL: load: id=gralloc != hmi->id=gralloc
09-14 21:24:04.024 6549-6549/cl.ramces.storehouse D/HwCust: Create obj success use class android.content.res.HwCustHwResourcesImpl
09-14 21:24:04.039 6549-6549/cl.ramces.storehouse W/System: ClassLoader referenced unknown path: /data/app/cl.ramces.storehouse-1/lib/arm64
09-14 21:24:04.093 6549-6579/cl.ramces.storehouse W/DynamiteModule: Local module descriptor class for com.google.firebase.auth not found.
09-14 21:24:04.107 6549-6579/cl.ramces.storehouse W/DynamiteModule: Local module descriptor class for com.google.firebase.auth not found.
09-14 21:24:04.131 6549-6579/cl.ramces.storehouse D/HwCust: Create obj success use class android.content.res.HwCustHwResourcesImpl
09-14 21:24:04.144 6549-6549/cl.ramces.storehouse E/FirebaseApp: Firebase API initialization failure.
    java.lang.reflect.InvocationTargetException
    at java.lang.reflect.Method.invoke(Native Method)
    at com.google.firebase.FirebaseApp.zza(Unknown Source)
    at com.google.firebase.FirebaseApp.initializeApp(Unknown Source)
    at com.google.firebase.FirebaseApp.initializeApp(Unknown Source)
    at com.google.firebase.FirebaseApp.initializeApp(Unknown Source)
    at com.google.firebase.provider.FirebaseInitProvider.onCreate(Unknown Source)
    at android.content.ContentProvider.attachInfo(ContentProvider.java:1748)
    at android.content.ContentProvider.attachInfo(ContentProvider.java:1723)
    at com.google.firebase.provider.FirebaseInitProvider.attachInfo(Unknown Source)
    at android.app.ActivityThread.installProvider(ActivityThread.java:5322)
    at android.app.ActivityThread.installContentProviders(ActivityThread.java:4843)
    at android.app.ActivityThread.handleBindApplication(ActivityThread.java:4774)
    at android.app.ActivityThread.access$1600(ActivityThread.java:165)
    at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1437)
    at android.os.Handler.dispatchMessage(Handler.java:102)
    at android.os.Looper.loop(Looper.java:150)
    at android.app.ActivityThread.main(ActivityThread.java:5621)
    at java.lang.reflect.Method.invoke(Native Method)
    at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:794)
    at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:684)
    Caused by: java.lang.IllegalAccessError: Method 'void android.support.v4.content.ContextCompat.<init>()' is inaccessible to class 'com.google.firebase.iid.zzg' (declaration of 'com.google.firebase.iid.zzg' appears in /data/app/cl.ramces.storehouse-1/base.apk)
    at com.google.firebase.iid.zzg.zzeC(Unknown Source)
    at com.google.firebase.iid.zzg.<init>(Unknown Source)
    at com.google.firebase.iid.zzg.<init>(Unknown Source)
    at com.google.firebase.iid.zzd.zzb(Unknown Source)
    at com.google.firebase.iid.FirebaseInstanceId.getInstance(Unknown Source)
    at java.lang.reflect.Method.invoke(Native Method) 
    at com.google.firebase.FirebaseApp.zza(Unknown Source) 
    at com.google.firebase.FirebaseApp.initializeApp(Unknown Source) 
    at com.google.firebase.FirebaseApp.initializeApp(Unknown Source) 
    at com.google.firebase.FirebaseApp.initializeApp(Unknown Source) 
    at com.google.firebase.provider.FirebaseInitProvider.onCreate(Unknown Source) 
    at android.content.ContentProvider.attachInfo(ContentProvider.java:1748) 
    at android.content.ContentProvider.attachInfo(ContentProvider.java:1723) 
    at com.google.firebase.provider.FirebaseInitProvider.attachInfo(Unknown Source) 
    at android.app.ActivityThread.installProvider(ActivityThread.java:5322) 
    at android.app.ActivityThread.installContentProviders(ActivityThread.java:4843) 
    at android.app.ActivityThread.handleBindApplication(ActivityThread.java:4774) 
    at android.app.ActivityThread.access$1600(ActivityThread.java:165) 
    at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1437) 
    at android.os.Handler.dispatchMessage(Handler.java:102) 
    at android.os.Looper.loop(Looper.java:150) 
    at android.app.ActivityThread.main(ActivityThread.java:5621) 
    at java.lang.reflect.Method.invoke(Native Method) 
    at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:794) 
    at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:684) 
            09-14 21:24:04.148 6549-6549/cl.ramces.storehouse D/FirebaseApp: com.google.firebase.crash.FirebaseCrash is not linked. Skipping initialization.
            09-14 21:24:04.153 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.UserAttributeParcel>
09-14 21:24:04.153 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.UserAttributeParcel>
09-14 21:24:04.165 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.AppMetadata>
09-14 21:24:04.165 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.AppMetadata>
09-14 21:24:04.207 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.AppMetadata>
09-14 21:24:04.208 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.EventParcel>
09-14 21:24:04.209 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.EventParcel>
09-14 21:24:04.217 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.EventParams>
09-14 21:24:04.217 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.EventParams>
09-14 21:24:04.218 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.AppMetadata>
09-14 21:24:04.218 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.EventParcel>
09-14 21:24:04.218 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.AppMetadata>
09-14 21:24:04.218 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.EventParcel>
09-14 21:24:04.219 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.EventParams>
09-14 21:24:04.219 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.EventParcel>
09-14 21:24:04.219 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.AppMetadata>
09-14 21:24:04.219 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.EventParcel>
09-14 21:24:04.219 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.AppMetadata>
09-14 21:24:04.219 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.UserAttributeParcel>
09-14 21:24:04.220 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.AppMetadata>
09-14 21:24:04.220 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.AppMetadata>
09-14 21:24:04.220 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.AppMetadata>
09-14 21:24:04.220 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.EventParcel>
09-14 21:24:04.220 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.EventParams>
09-14 21:24:04.220 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.UserAttributeParcel>
09-14 21:24:04.220 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.AppMetadata>
09-14 21:24:04.221 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.AppMetadata>
09-14 21:24:04.221 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.AppMetadata>
09-14 21:24:04.221 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.EventParcel>
09-14 21:24:04.221 6549-6549/cl.ramces.storehouse I/art: Rejecting re-init on previously-failed class java.lang.Class<com.google.android.gms.measurement.internal.EventParams>
09-14 21:24:04.222 6549-6549/cl.ramces.storehouse E/FirebaseApp: Firebase API initialization failure.
    java.lang.reflect.InvocationTargetException
    at java.lang.reflect.Method.invoke(Native Method)
    at com.google.firebase.FirebaseApp.zza(Unknown Source)
    at com.google.firebase.FirebaseApp.initializeApp(Unknown Source)
    at com.google.firebase.FirebaseApp.initializeApp(Unknown Source)
    at com.google.firebase.FirebaseApp.initializeApp(Unknown Source)
    at com.google.firebase.provider.FirebaseInitProvider.onCreate(Unknown Source)
    at android.content.ContentProvider.attachInfo(ContentProvider.java:1748)
    at android.content.ContentProvider.attachInfo(ContentProvider.java:1723)
    at com.google.firebase.provider.FirebaseInitProvider.attachInfo(Unknown Source)
    at android.app.ActivityThread.installProvider(ActivityThread.java:5322)
    at android.app.ActivityThread.installContentProviders(ActivityThread.java:4843)
    at android.app.ActivityThread.handleBindApplication(ActivityThread.java:4774)
    at android.app.ActivityThread.access$1600(ActivityThread.java:165)
    at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1437)
    at android.os.Handler.dispatchMessage(Handler.java:102)
    at android.os.Looper.loop(Looper.java:150)
    at android.app.ActivityThread.main(ActivityThread.java:5621)
    at java.lang.reflect.Method.invoke(Native Method)
    at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:794)
    at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:684)
    Caused by: java.lang.NoSuchMethodError: No static method zzz(Ljava/lang/Object;)Ljava/lang/Object; in class Lcom/google/android/gms/common/internal/zzaa; or its super classes (declaration of 'com.google.android.gms.common.internal.zzaa' appears in /data/app/cl.ramces.storehouse-1/base.apk)
    at com.google.android.gms.measurement.internal.zzx.zzbd(Unknown Source)
    at com.google.android.gms.measurement.AppMeasurement.getInstance(Unknown Source)
    at java.lang.reflect.Method.invoke(Native Method) 
    at com.google.firebase.FirebaseApp.zza(Unknown Source) 
    at com.google.firebase.FirebaseApp.initializeApp(Unknown Source) 
    at com.google.firebase.FirebaseApp.initializeApp(Unknown Source) 
    at com.google.firebase.FirebaseApp.initializeApp(Unknown Source) 
    at com.google.firebase.provider.FirebaseInitProvider.onCreate(Unknown Source) 
    at android.content.ContentProvider.attachInfo(ContentProvider.java:1748) 
    at android.content.ContentProvider.attachInfo(ContentProvider.java:1723) 
    at com.google.firebase.provider.FirebaseInitProvider.attachInfo(Unknown Source) 
    at android.app.ActivityThread.installProvider(ActivityThread.java:5322) 
    at android.app.ActivityThread.installContentProviders(ActivityThread.java:4843) 
    at android.app.ActivityThread.handleBindApplication(ActivityThread.java:4774) 
    at android.app.ActivityThread.access$1600(ActivityThread.java:165) 
    at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1437) 
    at android.os.Handler.dispatchMessage(Handler.java:102) 
    at android.os.Looper.loop(Looper.java:150) 
    at android.app.ActivityThread.main(ActivityThread.java:5621) 
    at java.lang.reflect.Method.invoke(Native Method) 
    at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:794) 
    at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:684) 
            09-14 21:24:04.224 6549-6549/cl.ramces.storehouse I/FirebaseInitProvider: FirebaseApp initialization successful
09-14 21:24:04.270 6549-6549/cl.ramces.storehouse V/HwPolicyFactory: : success to get AllImpl object and return....
            09-14 21:24:04.279 6549-6549/cl.ramces.storehouse I/HwCust: Constructor found for class android.app.HwCustHwWallpaperManagerImpl
09-14 21:24:04.279 6549-6549/cl.ramces.storehouse D/HwCust: Create obj success use class android.app.HwCustHwWallpaperManagerImpl
09-14 21:24:04.279 6549-6549/cl.ramces.storehouse V/HwWidgetFactory: : successes to get AllImpl object and return....
            09-14 21:24:04.283 6549-6549/cl.ramces.storehouse V/ActivityThread: ActivityThread,callActivityOnCreate
09-14 21:24:04.293 6549-6592/cl.ramces.storehouse I/System: core_booster, getBoosterConfig = false
            09-14 21:24:04.302 6549-6600/cl.ramces.storehouse D/HwCust: Create obj success use class android.content.res.HwCustHwResourcesImpl
09-14 21:24:04.312 6549-6549/cl.ramces.storehouse D/CubicBezierInterpolator: CubicBezierInterpolator  mControlPoint1x = 0.15, mControlPoint1y = 0.7, mControlPoint2x = 0.2, mControlPoint2y = 0.98
09-14 21:24:04.313 6549-6549/cl.ramces.storehouse D/CubicBezierInterpolator: CubicBezierInterpolator  mControlPoint1x = 0.6, mControlPoint1y = 0.9, mControlPoint2x = 0.8, mControlPoint2y = 1.0
09-14 21:24:04.313 6549-6549/cl.ramces.storehouse D/CubicBezierInterpolator: CubicBezierInterpolator  mControlPoint1x = 0.15, mControlPoint1y = 0.7, mControlPoint2x = 0.2, mControlPoint2y = 0.98
09-14 21:24:04.313 6549-6549/cl.ramces.storehouse D/CubicBezierInterpolator: CubicBezierInterpolator  mControlPoint1x = 0.6, mControlPoint1y = 0.9, mControlPoint2x = 0.8, mControlPoint2y = 1.0
09-14 21:24:04.324 6549-6549/cl.ramces.storehouse W/art: Before Android 4.1, method android.graphics.PorterDuffColorFilter android.support.graphics.drawable.VectorDrawableCompat.updateTintFilter(android.graphics.PorterDuffColorFilter, android.content.res.ColorStateList, android.graphics.PorterDuff$Mode) would have incorrectly overridden the package-private method in android.graphics.drawable.Drawable
09-14 21:24:04.326 6549-6592/cl.ramces.storehouse I/System: core_booster, getBoosterConfig = false
            09-14 21:24:04.385 6549-6549/cl.ramces.storehouse I/HwSecImmHelper: mSecurityInputMethodService is null
            09-14 21:24:04.392 6549-6603/cl.ramces.storehouse D/OpenGLRenderer: Use EGL_SWAP_BEHAVIOR_PRESERVED: false
            09-14 21:24:04.473 6549-6549/cl.ramces.storehouse D/HwCust: Create obj success use class android.app.HwCustHwWallpaperManagerImpl
09-14 21:24:04.475 6549-6549/cl.ramces.storehouse V/ActivityThread: ActivityThread,callActivityOnCreate
09-14 21:24:04.485 6549-6600/cl.ramces.storehouse I/System: core_booster, getBoosterConfig = false
            09-14 21:24:04.517 6549-6600/cl.ramces.storehouse I/System: core_booster, getBoosterConfig = false
            09-14 21:24:04.526 6549-6549/cl.ramces.storehouse D/CubicBezierInterpolator: CubicBezierInterpolator  mControlPoint1x = 0.15, mControlPoint1y = 0.7, mControlPoint2x = 0.2, mControlPoint2y = 0.98
09-14 21:24:04.526 6549-6549/cl.ramces.storehouse D/CubicBezierInterpolator: CubicBezierInterpolator  mControlPoint1x = 0.6, mControlPoint1y = 0.9, mControlPoint2x = 0.8, mControlPoint2y = 1.0
09-14 21:24:04.526 6549-6549/cl.ramces.storehouse D/CubicBezierInterpolator: CubicBezierInterpolator  mControlPoint1x = 0.15, mControlPoint1y = 0.7, mControlPoint2x = 0.2, mControlPoint2y = 0.98
09-14 21:24:04.527 6549-6549/cl.ramces.storehouse D/CubicBezierInterpolator: CubicBezierInterpolator  mControlPoint1x = 0.6, mControlPoint1y = 0.9, mControlPoint2x = 0.8, mControlPoint2y = 1.0
09-14 21:24:04.555 6549-6549/cl.ramces.storehouse I/DynamiteModule: Considering local module com.google.android.gms.firebase_database:4 and remote module com.google.android.gms.firebase_database:6
            09-14 21:24:04.556 6549-6549/cl.ramces.storehouse I/DynamiteModule: Selected remote version of com.google.android.gms.firebase_database, version >= 6

            [ 09-14 21:24:04.605  2919: 2919 E/         ]
    process stopped due to unexpected signal 13
            09-14 21:24:04.607 6549-6549/cl.ramces.storehouse W/System: ClassLoader referenced unknown path: /data/data/com.google.android.gms/app_chimera/m/00000014/n/arm64-v8a
09-14 21:24:04.615 6549-6549/cl.ramces.storehouse D/HwCust: Create obj success use class android.content.res.HwCustHwResourcesImpl
09-14 21:24:04.675 6549-6613/cl.ramces.storehouse I/System: core_booster, getBoosterConfig = false
            09-14 21:24:04.769 6549-6603/cl.ramces.storehouse E/HAL: load: id=gralloc != hmi->id=gralloc
09-14 21:24:04.769 6549-6603/cl.ramces.storehouse I/OpenGLRenderer: Initialized EGL, version 1.4
            09-14 21:24:04.780 6549-6603/cl.ramces.storehouse D/OpenGLRenderer: loaded so path=/system/lib64/libhwuibp.so handle=0x7f8dd25d98
09-14 21:24:04.786 6549-6603/cl.ramces.storehouse D/mali_winsys: new_window_surface returns 0x3000
            09-14 21:24:04.832 6549-6603/cl.ramces.storehouse D/HwuiUseBinaryProgram: Key: 68719476744 has not found in mBinaryEntries, Compile it.
            09-14 21:24:04.871 6549-6549/cl.ramces.storehouse I/HwSecImmHelper: mSecurityInputMethodService is null
            09-14 21:24:04.871 6549-6549/cl.ramces.storehouse I/HwSecImmHelper: mSecurityInputMethodService is null
*/


}
