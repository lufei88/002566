package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.List;

/* loaded from: classes.dex */
public final class v extends com.github.catvod.spider.merge.E0.p {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f681short = {2109, 2086, 2083, 2086, 2087, 2111, 2086, 2152, 2087, 2104, 2093, 2106, 2089, 2108, 2087, 2106, 2137, 2126, 2126, 2131, 2126, 2076, 2137, 2125, 2121, 2141, 2128, 2133, 2120, 2117, 2169, 2116, 2124, 2126, 2076, 2130, 2137, 2141, 2126, 2054};
    public com.github.catvod.spider.merge.E0.d e;

    public v(int i, com.github.catvod.spider.merge.E0.p pVar) {
        super(i, pVar);
    }

    /* renamed from: ۟ۤۢۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m6068() {
        if (C0027.m5017() > 0) {
            return f681short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.p, com.github.catvod.spider.merge.I0.b
    public final Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        com.github.catvod.spider.merge.Y0.b bVar;
        if (!(cVar instanceof com.github.catvod.spider.merge.Y0.c)) {
            return C0016.m3595(cVar, this);
        }
        C0047.m7777(cVar);
        List listM7111 = C0042.m7111(this, d.class);
        if (C0064.m9636(listM7111) == 1) {
            return (com.github.catvod.spider.merge.Y0.b) C0028.m5177(cVar, (com.github.catvod.spider.merge.I0.b) C0048.m7915(listM7111, 0));
        }
        if (C0064.m9636(listM7111) != 2) {
            StringBuilder sb = new StringBuilder(C0024.m4740(m6068(), 16, 24, 2108));
            C0018.m3933(sb, C0014.m3331(this));
            throw new com.github.catvod.spider.merge.Q0.a(C0047.m7763(sb));
        }
        com.github.catvod.spider.merge.Y0.b bVar2 = (com.github.catvod.spider.merge.Y0.b) C0028.m5177(cVar, (com.github.catvod.spider.merge.I0.b) C0048.m7915(listM7111, 0));
        com.github.catvod.spider.merge.Y0.b bVar3 = (com.github.catvod.spider.merge.Y0.b) C0028.m5177(cVar, (com.github.catvod.spider.merge.I0.b) C0048.m7915(listM7111, 1));
        switch (C0022.m4461(C0053.m8478(this))) {
            case 24:
                bVar = new com.github.catvod.spider.merge.Y0.b(C0028.m5186(C0024.m4695(bVar2, bVar3) < 0));
                break;
            case 25:
                bVar = new com.github.catvod.spider.merge.Y0.b(C0028.m5186(C0024.m4695(bVar2, bVar3) > 0));
                break;
            case 26:
                bVar = new com.github.catvod.spider.merge.Y0.b(C0028.m5186(C0024.m4695(bVar2, bVar3) <= 0));
                break;
            case 27:
                bVar = new com.github.catvod.spider.merge.Y0.b(C0028.m5186(C0024.m4695(bVar2, bVar3) >= 0));
                break;
            case 28:
            case 29:
            default:
                StringBuilder sb2 = new StringBuilder(C0057.m8978(m6068(), 0, 16, 2120));
                C0018.m3933(sb2, C0024.m4730(C0053.m8478(this)));
                throw new com.github.catvod.spider.merge.Q0.a(C0047.m7763(sb2));
            case 30:
                bVar = new com.github.catvod.spider.merge.Y0.b(C0028.m5186(C0043.m7277(C0047.m7744(bVar2), C0047.m7744(bVar3))));
                break;
            case 31:
                bVar = new com.github.catvod.spider.merge.Y0.b(C0028.m5186(C0060.m9349(C0047.m7744(bVar2), C0047.m7744(bVar3))));
                break;
            case 32:
                bVar = new com.github.catvod.spider.merge.Y0.b(C0028.m5186(C0058.m9127(C0047.m7744(bVar2), C0047.m7744(bVar3))));
                break;
            case 33:
                bVar = new com.github.catvod.spider.merge.Y0.b(C0028.m5186(C0064.m9686(C0047.m7744(bVar2), C0047.m7744(bVar3))));
                break;
            case 34:
                bVar = new com.github.catvod.spider.merge.Y0.b(C0028.m5186(!C0064.m9686(C0047.m7744(bVar2), C0047.m7744(bVar3))));
                break;
        }
        return bVar;
    }
}