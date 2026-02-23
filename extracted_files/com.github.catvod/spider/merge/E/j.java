package com.github.catvod.spider.merge.E;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.h0.RunnableC0328h;
import com.github.catvod.spider.merge.h0.RunnableC0336p;
import com.github.catvod.spider.merge.h0.RunnableC0337q;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f390short = {2505, 2527, 2523, 2504, 2521, 2514, 1577, 1595, 1590, 1568, 1595, 1594, 1578, 1594, 1588, 1590, 1593, 1594, 1584, 1595, 1574, 1568, 1595, 1574, 1593, 1574, 1570, 1594, 1597, 1588, 1585, 1574, 1578, 1586, 1596, 1579, 1594, 1574, 1588, 1586, 1594, 3046, 3043, 3045, 3070, 1171, 1157, 1153, 1170, 1155, 1160, 2182, 3125, 3121, 3115};
    public final /* synthetic */ int a;
    public String b;
    public String c;

    public j(int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.b = C0054.m8574(m3772(), 0, 6, 2490);
                this.c = C0020.m4199(m3772(), 6, 35, 1619);
                break;
        }
    }

    public /* synthetic */ j(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public j(C0174a c0174a, String str) {
        this.a = 3;
        C0047.m7777(c0174a);
        this.b = C0056.m8871(c0174a);
        this.c = str;
    }

    public j(C0174a c0174a, String str, Object[] objArr) {
        this.a = 3;
        C0047.m7777(c0174a);
        this.b = C0056.m8871(c0174a);
        this.c = C0002.m1327(str, objArr);
    }

    /* renamed from: ۟ۡۦۧ, reason: not valid java name and contains not printable characters */
    public static short[] m3772() {
        if (C0033.m5872() > 0) {
            return f390short;
        }
        return null;
    }

    public void a(String str) {
        try {
            if (C0007.m1815(C0045.m7548(this), C0063.m9585(m3772(), 41, 4, 2966))) {
                C0335o c0335oM6168 = C0035.m6168();
                C0047.m7777(c0335oM6168);
                C0016.m3575(new RunnableC0328h(c0335oM6168, 0));
            } else {
                boolean zM1815 = C0007.m1815(str, C0055.m8812(this));
                String strM5109 = C0028.m5109(m3772(), 45, 6, 1248);
                if (!zM1815) {
                    this.c = str;
                    this.b = strM5109;
                    C0340u c0340uM5392 = C0030.m5392();
                    C0047.m7777(c0340uM5392);
                    C0016.m3575(new RunnableC0336p(c0340uM5392, str, 0));
                } else if (C0007.m1815(C0045.m7548(this), strM5109)) {
                    C0340u c0340uM53922 = C0030.m5392();
                    C0047.m7777(c0340uM53922);
                    C0016.m3575(new RunnableC0337q(c0340uM53922, 0));
                }
            }
        } catch (Exception unused) {
            C0340u c0340uM53923 = C0030.m5392();
            C0047.m7777(c0340uM53923);
            C0016.m3575(new RunnableC0336p(c0340uM53923, str, 0));
        }
    }

    public String toString() {
        switch (C0036.m6254(this)) {
            case 3:
                StringBuilder sb = new StringBuilder(C0004.m1549(m3772(), 51, 1, 2234));
                C0018.m3933(sb, C0045.m7548(this));
                C0018.m3933(sb, C0011.m2805(m3772(), 52, 3, 3083));
                C0018.m3933(sb, C0055.m8812(this));
                return C0047.m7763(sb);
            default:
                return super.toString();
        }
    }
}