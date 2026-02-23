package com.github.catvod.spider.merge.W;

import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.hardware.camera2.CameraManager;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.telecom.TelecomManager;
import com.github.catvod.spider.merge.d1.C0050;

/* loaded from: classes.dex */
public abstract /* synthetic */ class m {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f654short = {1446, 1467, 1463, 1457, 1442, 1427, 1446, 1457, 1456, 1452, 1453, 1408, 1452, 1462, 1453, 1463, 1570, 1599, 1587, 1589, 1574, 1547, 1576, 1572, 1586, 1588, 1550, 1571, 715, 726, 730, 732, 719, 766, 715, 732, 733, 705, 704, 749, 705, 731, 704, 730, 1803, 1814, 1818, 1820, 1807, 1826, 1793, 1792, 1801, 1826, 1799, 1816, 1803, 1802};

    public static /* bridge */ /* synthetic */ Class A() {
        return TvInputManager.class;
    }

    public static /* bridge */ /* synthetic */ Class B() {
        return UsageStatsManager.class;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return CameraManager.class;
    }

    public static /* bridge */ /* synthetic */ Class D() {
        return JobScheduler.class;
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return LauncherApps.class;
    }

    public static /* bridge */ /* synthetic */ Class v() {
        return MediaProjectionManager.class;
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return MediaSessionManager.class;
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return RestrictionsManager.class;
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return TelecomManager.class;
    }

    /* renamed from: ۟۟ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m5940() {
        if (C0050.m8121() < 0) {
            return f654short;
        }
        return null;
    }
}