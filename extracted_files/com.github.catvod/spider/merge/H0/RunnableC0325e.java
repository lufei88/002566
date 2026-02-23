package com.github.catvod.spider.merge.h0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.h0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0325e implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f813short = {691, 695, 26561, -27544, 26233, 22262, 27526, -26577, 20767, -31477, 2068, 2062, 413, 385, 385, 389, 463, 474, 474, 452, 455, 450, 475, 453, 475, 453, 475, 452, 463, 460, 460, 450, 461, 474, 404, 406, 385, 412, 410, 411, 458, 401, 410, 456, 391, 400, 403, 391, 400, 390, 413, 467, 385, 396, 389, 400, 456, 401, 404, 411, 408, 404, 414, 384, 467, 389, 404, 385, 413, 456, 413, 385, 385, 389, 463, 474, 474, 452, 455, 450, 475, 453, 475, 453, 475, 452, 463, 460, 460, 460, 450, 474, 389, 391, 410, 397, 396, 458, 401, 410, 456};
    public final /* synthetic */ int a;
    public final /* synthetic */ C0335o b;
    public final /* synthetic */ String c;

    public /* synthetic */ RunnableC0325e(C0335o c0335o, String str, int i) {
        this.a = i;
        this.b = c0335o;
        this.c = str;
    }

    /* renamed from: ۟۟ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m8665() {
        if (C0059.m9257() <= 0) {
            return f813short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0030.m5424(this)) {
            case 0:
                String strM4246 = C0020.m4246(this);
                C0335o c0335oM1516 = C0004.m1516(this);
                C0047.m7777(c0335oM1516);
                try {
                    StringBuilder sb = new StringBuilder(C0057.m8978(m8665(), 12, 89, 501));
                    C0018.m3933(sb, strM4246);
                    C0016.m3575(new RunnableC0325e(c0335oM1516, C0032.m5769(C0047.m7763(sb), null), 1));
                    break;
                } catch (Exception e) {
                    C0016.m3575(new RunnableC0327g(c0335oM1516, e, 0));
                    C0049.m7975(e);
                    return;
                }
            default:
                C0335o c0335oM15162 = C0004.m1516(this);
                C0047.m7777(c0335oM15162);
                String strM5256 = C0029.m5256(m8665(), 0, 2, 732);
                String strM42462 = C0020.m4246(this);
                if (!C0000.m1057(strM5256, strM42462)) {
                    StringBuilder sb2 = new StringBuilder(C0032.m5708(m8665(), 6, 6, 2094));
                    C0018.m3933(sb2, strM42462);
                    C0038.m6402(C0047.m7763(sb2));
                    break;
                } else {
                    C0038.m6402(C0010.m2300(m8665(), 2, 4, 1129));
                    C0040.m6667(C0030.m5411(c0335oM15162));
                    break;
                }
        }
    }
}