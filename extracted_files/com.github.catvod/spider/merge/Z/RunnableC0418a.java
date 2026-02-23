package com.github.catvod.spider.merge.z;

import androidx.core.widget.ContentLoadingProgressBar;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;

/* renamed from: com.github.catvod.spider.merge.z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0418a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContentLoadingProgressBar b;

    public /* synthetic */ RunnableC0418a(ContentLoadingProgressBar contentLoadingProgressBar, int i) {
        this.a = i;
        this.b = contentLoadingProgressBar;
    }

    /* renamed from: ۟ۢۧۢۨ, reason: not valid java name and contains not printable characters */
    public static void m9700(Object obj) {
        if (C0057.m9017() >= 0) {
            ContentLoadingProgressBar.c((ContentLoadingProgressBar) obj);
        }
    }

    /* renamed from: ۣ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static void m9701(Object obj) {
        if (C0064.m9659() <= 0) {
            ContentLoadingProgressBar.a((ContentLoadingProgressBar) obj);
        }
    }

    /* renamed from: ۠ۦۨۤ, reason: not valid java name and contains not printable characters */
    public static void m9702(Object obj) {
        if (C0005.m1599() <= 0) {
            ContentLoadingProgressBar.b((ContentLoadingProgressBar) obj);
        }
    }

    /* renamed from: ۥۤۥۥ, reason: contains not printable characters */
    public static void m9703(Object obj) {
        if (C0011.m2755() >= 0) {
            ContentLoadingProgressBar.d((ContentLoadingProgressBar) obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0041.m6742(this)) {
            case 0:
                m9703(C0004.m1512(this));
                break;
            case 1:
                m9700(C0004.m1512(this));
                break;
            case 2:
                m9701(C0004.m1512(this));
                break;
            default:
                m9702(C0004.m1512(this));
                break;
        }
    }
}