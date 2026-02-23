package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends com.github.catvod.spider.merge.E0.p {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f672short = {1541, 785, 774, 774, 795, 774, 852, 785, 773, 769, 789, 792, 797, 768, 781, 817, 780, 772, 774, 852, 794, 785, 789, 774, 846};
    public com.github.catvod.spider.merge.E0.d e;

    public g(int i, com.github.catvod.spider.merge.E0.p pVar) {
        super(i, pVar);
    }

    /* renamed from: ۟ۧ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static short[] m6059() {
        if (C0049.m8038() < 0) {
            return f672short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.p, com.github.catvod.spider.merge.I0.b
    public final Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        Class cls;
        com.github.catvod.spider.merge.Y0.b bVar;
        if (!(cVar instanceof com.github.catvod.spider.merge.Y0.c)) {
            return C0016.m3595(cVar, this);
        }
        C0047.m7777(cVar);
        List listM7111 = C0042.m7111(this, v.class);
        if (C0064.m9636(listM7111) == 1) {
            return (com.github.catvod.spider.merge.Y0.b) C0020.m4276((com.github.catvod.spider.merge.I0.b) C0048.m7915(listM7111, 0), cVar);
        }
        if (C0064.m9636(listM7111) != 2) {
            StringBuilder sb = new StringBuilder(C0037.m6307(m6059(), 1, 24, 884));
            C0018.m3933(sb, C0014.m3331(this));
            throw new com.github.catvod.spider.merge.Q0.a(C0047.m7763(sb));
        }
        com.github.catvod.spider.merge.Y0.b bVar2 = (com.github.catvod.spider.merge.Y0.b) C0020.m4276((com.github.catvod.spider.merge.I0.b) C0048.m7915(listM7111, 0), cVar);
        com.github.catvod.spider.merge.Y0.b bVar3 = (com.github.catvod.spider.merge.Y0.b) C0020.m4276((com.github.catvod.spider.merge.I0.b) C0048.m7915(listM7111, 1), cVar);
        cls = Object.class;
        if (C0007.m1815(C0013.m3106(m6059(), 0, 1, 1592), C0024.m4730(C0040.m6668(this)))) {
            Object objM6834 = C0041.m6834(bVar2);
            Class<Object> clsM7777 = objM6834 == null ? cls : C0047.m7777(objM6834);
            Object objM68342 = C0041.m6834(bVar3);
            if (C0058.m9103(clsM7777, objM68342 != null ? C0047.m7777(objM68342) : Object.class)) {
                bVar = new com.github.catvod.spider.merge.Y0.b(C0028.m5186(bVar2 == bVar3 || C0049.m8017(bVar2, bVar3)));
            } else {
                String strM7744 = C0047.m7744(bVar2);
                String strM77442 = C0047.m7744(bVar3);
                if (strM7744 == strM77442 || (strM7744 != null && C0058.m9103(strM7744, strM77442))) {
                    z = true;
                }
                bVar = new com.github.catvod.spider.merge.Y0.b(C0028.m5186(z));
            }
        } else {
            Object objM68343 = C0041.m6834(bVar2);
            Class<Object> clsM77772 = objM68343 == null ? cls : C0047.m7777(objM68343);
            Object objM68344 = C0041.m6834(bVar3);
            if (C0058.m9103(clsM77772, objM68344 != null ? C0047.m7777(objM68344) : Object.class)) {
                bVar = new com.github.catvod.spider.merge.Y0.b(C0028.m5186(!(bVar2 == bVar3 || C0049.m8017(bVar2, bVar3))));
            } else {
                String strM77443 = C0047.m7744(bVar2);
                String strM77444 = C0047.m7744(bVar3);
                if (strM77443 == strM77444 || (strM77443 != null && C0058.m9103(strM77443, strM77444))) {
                    z = true;
                }
                bVar = new com.github.catvod.spider.merge.Y0.b(C0028.m5186(!z));
            }
        }
        return bVar;
    }
}