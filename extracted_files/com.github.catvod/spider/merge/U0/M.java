package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;

/* loaded from: classes.dex */
public abstract class M extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f541short = {2346, 2322, 2324, 2323, 2375, 2309, 2306, 2375, 2305, 2310, 2315, 2324, 2306};
    public String b;
    public String c;
    public String e;
    public String h;
    public com.github.catvod.spider.merge.T0.c l;
    public final StringBuilder d = new StringBuilder();
    public boolean f = false;
    public final StringBuilder g = new StringBuilder();
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;

    /* renamed from: ۣۥ۠۠, reason: not valid java name and contains not printable characters */
    public static short[] m5507() {
        if (C0039.m6529() <= 0) {
            return f541short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.U0.N
    public /* bridge */ /* synthetic */ void f() {
        C0010.m2363(this);
    }

    public final void h(char c) {
        this.i = true;
        String strM4705 = C0024.m4705(this);
        StringBuilder sbM6393 = C0038.m6393(this);
        if (strM4705 != null) {
            C0018.m3933(sbM6393, strM4705);
            this.h = null;
        }
        C0062.m9399(sbM6393, c);
    }

    public final void i(String str) {
        this.i = true;
        String strM4705 = C0024.m4705(this);
        StringBuilder sbM6393 = C0038.m6393(this);
        if (strM4705 != null) {
            C0018.m3933(sbM6393, strM4705);
            this.h = null;
        }
        if (C0006.m1693(sbM6393) == 0) {
            this.h = str;
        } else {
            C0018.m3933(sbM6393, str);
        }
    }

    public final void j(int[] iArr) {
        this.i = true;
        String strM4705 = C0024.m4705(this);
        StringBuilder sbM6393 = C0038.m6393(this);
        if (strM4705 != null) {
            C0018.m3933(sbM6393, strM4705);
            this.h = null;
        }
        for (int i : iArr) {
            C0035.m6149(sbM6393, i);
        }
    }

    public final void k(String str) {
        String strM9289 = C0060.m9289(str, (char) 0, (char) 65533);
        String strM9268 = C0060.m9268(this);
        if (strM9268 != null) {
            strM9289 = C0050.m8125(strM9268, strM9289);
        }
        this.b = strM9289;
        this.c = C0063.m9572(C0064.m9640(strM9289));
    }

    public final boolean l() {
        return C0014.m3299(this) != null;
    }

    public final String m() {
        String strM9268 = C0060.m9268(this);
        if (strM9268 == null || C0004.m1584(strM9268) == 0) {
            throw new com.github.catvod.spider.merge.R0.b(C0025.m4795(m5507(), 0, 13, 2407));
        }
        return C0060.m9268(this);
    }

    public final void n(String str) {
        this.b = str;
        this.c = C0063.m9572(C0064.m9640(str));
    }

    public final void o() {
        if (C0014.m3299(this) == null) {
            this.l = new com.github.catvod.spider.merge.T0.c();
        }
        boolean zM1167 = C0001.m1167(this);
        StringBuilder sbM6393 = C0038.m6393(this);
        StringBuilder sbM9697 = C0064.m9697(this);
        if (zM1167 && C0029.m5233(C0014.m3299(this)) < 512) {
            String strM9640 = C0064.m9640(C0006.m1693(sbM9697) > 0 ? C0047.m7763(sbM9697) : C0015.m3492(this));
            if (C0004.m1584(strM9640) > 0) {
                C0040.m6676(C0014.m3299(this), C0004.m1497(this) ? C0006.m1693(sbM6393) > 0 ? C0047.m7763(sbM6393) : C0024.m4705(this) : C0019.m4121(this) ? C0007.m1840() : null, strM9640);
            }
        }
        C0006.m1785(sbM9697);
        this.e = null;
        this.f = false;
        C0006.m1785(sbM6393);
        this.h = null;
        this.i = false;
        this.j = false;
    }

    public M p() {
        this.b = null;
        this.c = null;
        C0006.m1785(C0064.m9697(this));
        this.e = null;
        this.f = false;
        C0006.m1785(C0038.m6393(this));
        this.h = null;
        this.j = false;
        this.i = false;
        this.k = false;
        this.l = null;
        return this;
    }
}