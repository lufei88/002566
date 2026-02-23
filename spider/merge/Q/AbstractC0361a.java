package com.github.catvod.spider.merge.q;

import android.location.Location;
import android.os.Bundle;
import androidx.core.location.LocationListenerCompat;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.y0.C0064;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0361a {
    public static void a(LocationListenerCompat locationListenerCompat, int i) {
    }

    public static void b(LocationListenerCompat locationListenerCompat, List list) {
        int iM9636 = C0064.m9636(list);
        for (int i = 0; i < iM9636; i++) {
            C0024.m4755(locationListenerCompat, (Location) C0048.m7915(list, i));
        }
    }

    public static void c(LocationListenerCompat locationListenerCompat, String str) {
    }

    public static void d(LocationListenerCompat locationListenerCompat, String str) {
    }

    public static void e(LocationListenerCompat locationListenerCompat, String str, int i, Bundle bundle) {
    }
}