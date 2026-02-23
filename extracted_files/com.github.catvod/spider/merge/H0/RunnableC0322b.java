package com.github.catvod.spider.merge.h0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;

/* renamed from: com.github.catvod.spider.merge.h0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0322b implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f812short = {1188, 1219, 1225, 1247, 1245, 1188, 1189, 1249, 1250, 1262, 1267, 1250, 909, 1002, 992, 1014, 1012, 909, 908, 966, 963, 972, 975, 983};
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ RunnableC0322b(String str, String str2, String str3, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    /* renamed from: ۟ۥۧۦۣ, reason: not valid java name and contains not printable characters */
    public static short[] m8664() {
        if (C0053.m8389() > 0) {
            return f812short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM1166 = C0001.m1166(this);
        String strM9113 = C0058.m9113(this);
        String strM3711 = C0017.m3711(this);
        switch (C0052.m8289(this)) {
            case 0:
                C0030.m5390(C0001.m1203(new String[]{strM3711, strM9113, strM1166}), C0023.m4536(m8664(), 12, 12, 930));
                break;
            default:
                C0030.m5390(C0001.m1203(new String[]{strM3711, strM9113, strM1166}), C0007.m1842(m8664(), 0, 12, 1163));
                break;
        }
    }
}