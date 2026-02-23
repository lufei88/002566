package com.github.catvod.spider.merge.h0;

import android.app.Activity;
import android.util.DisplayMetrics;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;

/* renamed from: com.github.catvod.spider.merge.h0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315D {
    public static C0315D k;
    public com.github.catvod.spider.merge.W.A a;
    public C0314C b;
    public Activity c;
    public boolean d = false;
    public int e;
    public int f;
    public final int g;
    public final int h;
    public float i;
    public float j;

    public C0315D() {
        this.i = 0.0f;
        this.j = 0.0f;
        C0015.m3418(this);
        this.g = C0013.m3103(26);
        this.h = C0013.m3103(13);
        if (C0018.m3953(this) > 0) {
            this.j = ((r2 - r1) - C0013.m3103(240)) / C0018.m3953(this);
            this.i = C0013.m3103(0) / C0059.m9192(this);
        }
    }

    public static synchronized C0315D a() {
        try {
            if (C0042.m7112() == null) {
                k = new C0315D();
            }
        } catch (Throwable th) {
            throw th;
        }
        return C0042.m7112();
    }

    public final void b() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Activity activityM4453 = C0022.m4453();
        if (activityM4453 != null) {
            C0062.m9386(C0009.m2062(C0035.m6093(activityM4453)), displayMetrics);
            this.e = C0045.m7623(displayMetrics);
            this.f = C0046.m7678(displayMetrics);
        }
    }
}