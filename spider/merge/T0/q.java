package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.U0.C;
import com.github.catvod.spider.merge.U0.K;
import com.github.catvod.spider.merge.U0.L;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.util.List;

/* loaded from: classes.dex */
public abstract class q extends r {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f511short = {1814, 1873, 1882, 1878, 1857, 1868, 1861, 1872};
    public Object d;

    /* renamed from: ۦۦۣ, reason: contains not printable characters */
    public static short[] m5326() {
        if (C0006.m1726() < 0) {
            return f511short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final String a(String str) {
        C0014.m3345(this);
        return super.a(str);
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final String c(String str) {
        return !(C0045.m7543(this) instanceof c) ? C0007.m1815(C0041.m6776(this), str) ? (String) C0045.m7543(this) : C0007.m1840() : super.c(str);
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final c d() {
        C0014.m3345(this);
        return (c) C0045.m7543(this);
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final String e() {
        r rVarM7395 = C0044.m7395(this);
        return rVarM7395 != null ? C0065.m9716(rVarM7395) : C0007.m1840();
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final int f() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final r h(r rVar) {
        q qVar = (q) super.h(rVar);
        Object objM7543 = C0045.m7543(this);
        if (objM7543 instanceof c) {
            qVar.d = C0007.m1863((c) objM7543);
        }
        return qVar;
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final r i() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final List j() {
        return C0020.m4227();
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final boolean l() {
        return C0045.m7543(this) instanceof c;
    }

    public final q x(String str, String str2) {
        if ((C0045.m7543(this) instanceof c) || !C0007.m1815(str, C0002.m1305(m5326(), 0, 8, 1845))) {
            C0014.m3345(this);
            r rVarM3163 = C0013.m3163(this);
            h hVar = rVarM3163 instanceof h ? (h) rVarM3163 : null;
            if (hVar == null || C0025.m4871(hVar) == null) {
                new L();
                new K();
                new C();
            }
            String strM9572 = C0063.m9572(C0064.m9640(str));
            c cVarM9044 = C0057.m9044(this);
            int iM8745 = C0055.m8745(cVarM9044, strM9572);
            if (iM8745 != -1) {
                C0052.m8318(cVarM9044)[iM8745] = str2;
                if (!C0007.m1815(C0022.m4450(cVarM9044)[iM8745], strM9572)) {
                    C0022.m4450(cVarM9044)[iM8745] = strM9572;
                }
            } else {
                C0040.m6676(cVarM9044, str2, strM9572);
            }
        } else {
            this.d = str2;
        }
        return this;
    }

    public final String y() {
        return C0050.m8152(this, C0041.m6776(this));
    }

    public final void z() {
        Object objM7543 = C0045.m7543(this);
        if (objM7543 instanceof c) {
            return;
        }
        c cVar = new c();
        this.d = cVar;
        if (objM7543 != null) {
            C0051.m8185(cVar, C0041.m6776(this), (String) objM7543);
        }
    }
}