package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.LinkedList;
import java.util.Stack;

/* loaded from: classes.dex */
public final class z extends com.github.catvod.spider.merge.E0.p {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f684short = {1070, 1140, 1123, 1134, 1072, 1087, 2728, 2730, 2725, 2795, 2725, 2724, 2751, 2795, 2726, 2734, 2745, 2732, 2734, 2795, 2749, 2730, 2727, 2810, 2806, 409};
    public com.github.catvod.spider.merge.E0.d e;

    public z(int i, com.github.catvod.spider.merge.E0.p pVar) {
        super(i, pVar);
    }

    /* renamed from: ۣۤۧۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6071() {
        if (C0031.m5628() >= 0) {
            return f684short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.p, com.github.catvod.spider.merge.I0.b
    public final Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        com.github.catvod.spider.merge.T0.m mVar;
        if (!(cVar instanceof com.github.catvod.spider.merge.Y0.c)) {
            return C0016.m3595(cVar, this);
        }
        C0047.m7777(cVar);
        if (((r) C0013.m3164(this, r.class)) == null && !C0050.m8105((r) C0013.m3164(this, r.class))) {
            return (com.github.catvod.spider.merge.Y0.b) C0031.m5641((z) C0013.m3164(this, z.class), cVar);
        }
        com.github.catvod.spider.merge.Y0.b bVar = (com.github.catvod.spider.merge.Y0.b) C0048.m7938((r) C0013.m3164(this, r.class), cVar);
        if (C0065.m9778(this) != null) {
            Stack stackM1317 = C0002.m1317(cVar);
            com.github.catvod.spider.merge.Y0.a aVarM4971 = C0026.m4971(C0055.m8764(cVar));
            com.github.catvod.spider.merge.Y0.a aVar = new com.github.catvod.spider.merge.Y0.a(C0000.m1092(aVarM4971));
            aVar.c = aVarM4971;
            C0005.m1657(stackM1317, aVar);
            com.github.catvod.spider.merge.Y0.b bVar2 = (com.github.catvod.spider.merge.Y0.b) C0031.m5641((z) C0013.m3164(this, z.class), cVar);
            C0047.m7745(stackM1317);
            Object objM6834 = C0041.m6834(bVar);
            if (objM6834 instanceof com.github.catvod.spider.merge.V0.d) {
                Object objM68342 = C0041.m6834(bVar2);
                if (objM68342 instanceof com.github.catvod.spider.merge.V0.d) {
                    C0002.m1243((com.github.catvod.spider.merge.V0.d) objM6834, (com.github.catvod.spider.merge.V0.d) objM68342);
                } else {
                    com.github.catvod.spider.merge.T0.m mVar2 = new com.github.catvod.spider.merge.T0.m();
                    String strM7744 = C0047.m7744(bVar2);
                    C0065.m9779(strM7744);
                    C0035.m6086(mVar2, new com.github.catvod.spider.merge.T0.t(strM7744));
                    C0018.m3918((com.github.catvod.spider.merge.V0.d) C0041.m6834(bVar), mVar2);
                }
            } else if (!(objM6834 instanceof String)) {
                boolean z = objM6834 instanceof Boolean;
                String strM5362 = C0030.m5362(m6071(), 0, 6, 1026);
                String strM8337 = C0052.m8337(m6071(), 6, 19, 2763);
                if (z) {
                    Object objM68343 = C0041.m6834(bVar2);
                    if (objM68343 instanceof Boolean) {
                        bVar = new com.github.catvod.spider.merge.Y0.b(C0028.m5186(C0010.m2318(C0000.m1120(bVar2)) | C0010.m2318(C0000.m1120(bVar))));
                    } else {
                        if (objM68343 instanceof com.github.catvod.spider.merge.V0.d) {
                            mVar = new com.github.catvod.spider.merge.T0.m();
                            String strM77442 = C0047.m7744(bVar);
                            C0065.m9779(strM77442);
                            C0035.m6086(mVar, new com.github.catvod.spider.merge.T0.t(strM77442));
                            C0018.m3918((com.github.catvod.spider.merge.V0.d) C0041.m6834(bVar2), mVar);
                            return bVar2;
                        }
                        if (!(objM68343 instanceof String)) {
                            StringBuilder sb = new StringBuilder(strM8337);
                            C0016.m3605(sb, C0000.m1120(bVar));
                            C0018.m3933(sb, strM5362);
                            C0018.m3933(sb, C0047.m7744(bVar2));
                            throw new com.github.catvod.spider.merge.Q0.a(C0047.m7763(sb));
                        }
                        StringBuilder sb2 = new StringBuilder();
                        C0016.m3605(sb2, C0000.m1120(bVar));
                        C0018.m3933(sb2, C0047.m7744(bVar2));
                        bVar = new com.github.catvod.spider.merge.Y0.b(C0047.m7763(sb2));
                    }
                } else if (objM6834 instanceof Number) {
                    Object objM68344 = C0041.m6834(bVar2);
                    if (!(objM68344 instanceof String)) {
                        if (!(objM68344 instanceof com.github.catvod.spider.merge.V0.d)) {
                            StringBuilder sb3 = new StringBuilder(strM8337);
                            C0016.m3605(sb3, C0038.m6470(bVar));
                            C0018.m3933(sb3, strM5362);
                            C0018.m3933(sb3, C0047.m7744(bVar2));
                            throw new com.github.catvod.spider.merge.Q0.a(C0047.m7763(sb3));
                        }
                        mVar = new com.github.catvod.spider.merge.T0.m();
                        String strM77443 = C0047.m7744(bVar);
                        C0065.m9779(strM77443);
                        C0035.m6086(mVar, new com.github.catvod.spider.merge.T0.t(strM77443));
                        C0018.m3918((com.github.catvod.spider.merge.V0.d) C0041.m6834(bVar2), mVar);
                        return bVar2;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    C0016.m3605(sb4, C0038.m6470(bVar));
                    C0018.m3933(sb4, C0047.m7744(bVar2));
                    bVar = new com.github.catvod.spider.merge.Y0.b(C0047.m7763(sb4));
                } else {
                    LinkedList linkedList = new LinkedList();
                    if (!C0003.m1430(C0047.m7744(bVar))) {
                        C0031.m5644(linkedList, C0047.m7744(bVar));
                    }
                    if (!C0003.m1430(C0047.m7744(bVar2))) {
                        C0031.m5644(linkedList, C0047.m7744(bVar2));
                    }
                    bVar = new com.github.catvod.spider.merge.Y0.b(C0032.m5761(linkedList, C0046.m7718(m6071(), 25, 1, 437)));
                }
            } else {
                if (C0041.m6834(bVar2) instanceof com.github.catvod.spider.merge.V0.d) {
                    mVar = new com.github.catvod.spider.merge.T0.m();
                    String strM77444 = C0047.m7744(bVar);
                    C0065.m9779(strM77444);
                    C0035.m6086(mVar, new com.github.catvod.spider.merge.T0.t(strM77444));
                    C0018.m3918((com.github.catvod.spider.merge.V0.d) C0041.m6834(bVar2), mVar);
                    return bVar2;
                }
                StringBuilder sb5 = new StringBuilder();
                C0018.m3933(sb5, C0047.m7744(bVar));
                C0018.m3933(sb5, C0047.m7744(bVar2));
                bVar = new com.github.catvod.spider.merge.Y0.b(C0047.m7763(sb5));
            }
        }
        return bVar;
    }
}