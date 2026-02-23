package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.j.C0013;

/* loaded from: classes.dex */
public class t extends q {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f513short = {2053, 2130, 2115, 2142, 2130};

    public t(String str) {
        this.d = str;
    }

    public static boolean B(StringBuilder sb) {
        return C0006.m1693(sb) != 0 && C0057.m8984(sb, C0006.m1693(sb) - 1) == ' ';
    }

    /* renamed from: ۣ۟ۡۨۧ, reason: not valid java name and contains not printable characters */
    public static short[] m5328() {
        if (C0042.m7147() <= 0) {
            return f513short;
        }
        return null;
    }

    public t A() {
        return (t) super.g();
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public /* bridge */ /* synthetic */ Object clone() {
        return C0063.m9556(this);
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public /* bridge */ /* synthetic */ r g() {
        return C0063.m9556(this);
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public String o() {
        return C0064.m9599(m5328(), 0, 5, 2086);
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public void q(Appendable appendable, int i, g gVar) {
        boolean z;
        boolean z2;
        boolean zM7337 = C0043.m7337(gVar);
        r rVarM7395 = C0044.m7395(this);
        m mVar = rVarM7395 instanceof m ? (m) rVarM7395 : null;
        boolean z3 = zM7337 && !C0003.m1357(rVarM7395);
        if (z3) {
            boolean z4 = (C0035.m6143(this) == 0 && mVar != null && C0058.m9163(C0039.m6507(mVar))) || (C0044.m7395(this) instanceof h);
            boolean z5 = C0013.m3117(this) == null && mVar != null && C0058.m9163(C0039.m6507(mVar));
            r rVarM3117 = C0013.m3117(this);
            if ((((rVarM3117 instanceof m) && C0052.m8374((m) rVarM3117, gVar)) || ((rVarM3117 instanceof t) && C0028.m5134(C0032.m5729((t) rVarM3117)))) && C0028.m5134(C0032.m5729(this))) {
                return;
            }
            if (C0035.m6143(this) == 0 && mVar != null && C0035.m6164(C0039.m6507(mVar)) && !C0028.m5134(C0032.m5729(this))) {
                C0063.m9541(appendable, i, gVar);
            }
            z = z4;
            z2 = z5;
        } else {
            z = false;
            z2 = false;
        }
        C0004.m1489(appendable, C0032.m5729(this), gVar, false, z3, z, z2);
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public void r(Appendable appendable, int i, g gVar) {
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final String toString() {
        return C0051.m8204(this);
    }
}