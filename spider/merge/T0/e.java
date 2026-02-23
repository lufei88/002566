package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* loaded from: classes.dex */
public final class e extends q {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f502short = {3186, 3122, 3134, 3132, 3132, 3124, 3135, 3109, 3116, 3121, 3133, 3133, 3047, 3047, 3060};

    public e(String str) {
        this.d = str;
    }

    /* renamed from: ۟ۢۦۢۧ, reason: not valid java name and contains not printable characters */
    public static short[] m5316() {
        if (C0032.m5686() < 0) {
            return f502short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final Object clone() {
        return (e) super.g();
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final r g() {
        return (e) super.g();
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final String o() {
        return C0007.m1842(m5316(), 0, 8, 3153);
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final void q(Appendable appendable, int i, g gVar) {
        if (C0043.m7337(gVar) && C0035.m6143(this) == 0) {
            r rVarM7395 = C0044.m7395(this);
            if ((rVarM7395 instanceof m) && C0035.m6164(C0039.m6507((m) rVarM7395))) {
                C0063.m9541(appendable, i, gVar);
            }
        }
        C0024.m4699(C0024.m4699(C0024.m4699(appendable, C0037.m6307(m5316(), 8, 4, 3088)), C0032.m5729(this)), C0014.m3332(m5316(), 12, 3, 3018));
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final void r(Appendable appendable, int i, g gVar) {
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final String toString() {
        return C0051.m8204(this);
    }
}