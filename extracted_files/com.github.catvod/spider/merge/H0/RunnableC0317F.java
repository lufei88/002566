package com.github.catvod.spider.merge.h0;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;

/* renamed from: com.github.catvod.spider.merge.h0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0317F implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f805short = {2684, 2619, 2593, 2579, 2599, 2598, 2621, 2562, 2599, 2593, 2618, 2573, 2634, 2640, 2670, 2646, 2640, 2630, 2646, 2638, 689, 758, 748, 711, 746, 766, 753, 761, 746, 2664, 2607, 2613, 2588, 2606, 2611, 2580, 2611, 998, 938, 937, 939, 931, 943, 954, 935, 957, 934, 940, 926, 937, 932, 957, 941, -32205, 30435, 27549, 23314};
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;

    public /* synthetic */ RunnableC0317F(boolean z, boolean z2, boolean z3, boolean z4, String str) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
    }

    /* renamed from: ۟ۦۣۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m8657() {
        if (C0056.m8886() <= 0) {
            return f805short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM5138 = C0028.m5138(this);
        boolean zM9791 = C0065.m9791(this);
        boolean zM4363 = C0021.m4363(this);
        boolean zM1818 = C0007.m1818(this);
        String strM4260 = C0020.m4260(this);
        try {
            C0042.m7162(C0019.m4047(zM5138), C0012.m2973(m8657(), 0, 11, 2642));
            C0042.m7162(C0019.m4047(zM9791), C0055.m8814(m8657(), 11, 9, 2595));
            C0042.m7162(C0019.m4047(zM4363), C0019.m4107(m8657(), 20, 9, 671));
            C0042.m7162(C0019.m4047(zM1818), C0000.m1077(m8657(), 29, 8, 2630));
            C0042.m7162(strM4260, C0026.m4951(m8657(), 37, 16, 968));
            C0038.m6402(C0009.m2037(m8657(), 53, 4, 2445));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}