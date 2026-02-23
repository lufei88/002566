package com.github.catvod.spider.merge.a0;

import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;

/* renamed from: com.github.catvod.spider.merge.a0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0235D implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f707short = {1186, 1209, 1213, 1203, 1208, 581, 601, 601, 605};
    public final /* synthetic */ int a;
    public final /* synthetic */ C0246g b;
    public final /* synthetic */ String c;

    public /* synthetic */ RunnableC0235D(C0246g c0246g, String str, int i) {
        this.a = i;
        this.b = c0246g;
        this.c = str;
    }

    /* renamed from: ۢۦۥۦ, reason: not valid java name and contains not printable characters */
    public static short[] m6881() {
        if (C0060.m9355() >= 0) {
            return f707short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC0234C runnableC0234C;
        switch (C0034.m5984(this)) {
            case 0:
                C0246g c0246gM3048 = C0012.m3048(this);
                C0047.m7777(c0246gM3048);
                String strM2805 = C0011.m2805(m6881(), 5, 4, 557);
                String strM1437 = C0003.m1437(this);
                if (C0043.m7277(strM1437, strM2805)) {
                    C0035.m6144(c0246gM3048, C0032.m5769(strM1437, null));
                    return;
                } else {
                    C0035.m6144(c0246gM3048, strM1437);
                    return;
                }
            default:
                String strM14372 = C0003.m1437(this);
                C0246g c0246gM30482 = C0012.m3048(this);
                C0047.m7777(c0246gM30482);
                String strM4951 = C0026.m4951(m6881(), 0, 5, 1238);
                try {
                    try {
                        C0064.m9653(c0246gM30482, strM14372);
                        runnableC0234C = new RunnableC0234C(c0246gM30482, C0020.m4251(strM4951, strM14372));
                    } catch (Exception unused) {
                        C0064.m9653(c0246gM30482, strM14372);
                        runnableC0234C = new RunnableC0234C(c0246gM30482, C0020.m4251(strM4951, strM14372));
                    }
                    C0025.m4829(runnableC0234C);
                    return;
                } catch (Throwable th) {
                    C0025.m4829(new RunnableC0234C(c0246gM30482, C0020.m4251(strM4951, strM14372)));
                    throw th;
                }
        }
    }
}