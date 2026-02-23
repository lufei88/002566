package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.F0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166x extends AbstractC0151h {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f441short = {2847, 2877, 2858, 2860, 2858, 2859, 2858, 2849, 2860, 2858, 2927, 2879, 2877, 2858, 2859, 2854, 2860, 2862, 2875, 2858, 2876, 2927, 2862, 2877, 2858, 2927, 2849, 2848, 2875, 2927, 2876, 2874, 2879, 2879, 2848, 2877, 2875, 2858, 2859, 2927, 2854, 2849, 2927, 2851, 2858, 2871, 2858, 2877, 2876, 2913, 1095, 1093, 1098, 1098, 1099, 1104, 1028, 1095, 1099, 1098, 1111, 1105, 1097, 1089, 1028, 1121, 1131, 1122};
    public final com.github.catvod.spider.merge.E0.k d;
    public int e;
    public int f;
    public int g;
    public final com.github.catvod.spider.merge.G0.b[] h;
    public int i;
    public final C0165w j;

    public C0166x(com.github.catvod.spider.merge.E0.k kVar, C0144a c0144a, com.github.catvod.spider.merge.G0.b[] bVarArr, S s) {
        super(c0144a, s);
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
        this.j = new C0165w();
        this.h = bVarArr;
        this.d = kVar;
    }

    public static void b(com.github.catvod.spider.merge.G0.d dVar, int i, com.github.catvod.spider.merge.G0.d dVar2) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (dVar) {
            try {
                if (C0051.m8278(dVar) == null) {
                    dVar.c = new com.github.catvod.spider.merge.G0.d[128];
                }
                C0051.m8278(dVar)[i] = dVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ۟ۡۥۧ۟, reason: not valid java name and contains not printable characters */
    public static short[] m3879() {
        if (C0006.m1726() <= 0) {
            return f441short;
        }
        return null;
    }

    /* renamed from: ۟ۧۧۤۡ, reason: not valid java name and contains not printable characters */
    public static Object m3880(Object obj) {
        if (C0040.m6582() > 0) {
            return ((InterfaceC0167y[]) obj).clone();
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.AbstractC0151h
    public final void a() {
        C0165w c0165wM1340 = C0002.m1340(this);
        c0165wM1340.a = -1;
        c0165wM1340.b = 0;
        c0165wM1340.c = -1;
        c0165wM1340.d = null;
        this.e = -1;
        this.f = 1;
        this.g = 0;
        this.i = 0;
    }

    public final com.github.catvod.spider.merge.G0.d c(K k) {
        C0145b c0145b;
        com.github.catvod.spider.merge.G0.d dVar = new com.github.catvod.spider.merge.G0.d(k);
        Iterator itM7816 = C0047.m7816(C0065.m9781(k));
        while (true) {
            if (!C0012.m2962(itM7816)) {
                c0145b = null;
                break;
            }
            c0145b = (C0145b) C0048.m7949(itM7816);
            if (C0047.m7799(c0145b) instanceof W) {
                break;
            }
        }
        if (c0145b != null) {
            dVar.d = true;
            dVar.f = C0045.m7568((C0164v) c0145b);
            dVar.e = C0063.m9587(C0041.m6800(this))[C0021.m4362(C0047.m7799(c0145b))];
        }
        com.github.catvod.spider.merge.G0.b bVar = C0025.m4867(this)[C0058.m9053(this)];
        synchronized (C0041.m6803(bVar)) {
            try {
                com.github.catvod.spider.merge.G0.d dVar2 = (com.github.catvod.spider.merge.G0.d) C0065.m9715(C0041.m6803(bVar), dVar);
                if (dVar2 != null) {
                    return dVar2;
                }
                dVar.a = C0014.m3311(C0041.m6803(bVar));
                k.a = true;
                k.b = null;
                dVar.b = k;
                C0053.m8424(C0041.m6803(bVar), dVar, dVar);
                return dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(com.github.catvod.spider.merge.E0.c r69, com.github.catvod.spider.merge.F0.C0164v r70, com.github.catvod.spider.merge.F0.K r71, boolean r72, boolean r73, boolean r74) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.F0.C0166x.d(com.github.catvod.spider.merge.E0.c, com.github.catvod.spider.merge.F0.v, com.github.catvod.spider.merge.F0.K, boolean, boolean, boolean):boolean");
    }

    public final void e(com.github.catvod.spider.merge.E0.c cVar) {
        int iM4431;
        if (C0029.m5224(cVar, 1) == 10) {
            this.f = C0007.m1835(this) + 1;
            iM4431 = 0;
        } else {
            iM4431 = C0022.m4431(this) + 1;
        }
        this.g = iM4431;
        int iM8228 = C0051.m8228(cVar);
        if (C0027.m5001(cVar) - iM8228 == 0) {
            throw new IllegalStateException(C0000.m1077(m3879(), 50, 18, 1060));
        }
        cVar.b = iM8228 + 1;
    }

    public final int f(com.github.catvod.spider.merge.E0.c cVar, com.github.catvod.spider.merge.G0.d dVar) throws Throwable {
        int i;
        boolean z;
        com.github.catvod.spider.merge.G0.d dVarM8109;
        K k;
        int i2;
        int i3;
        AbstractC0152i abstractC0152i;
        C0145b c0145b;
        int i4;
        int i5;
        int i6;
        AbstractC0152i abstractC0152i2;
        C0145b c0145b2;
        com.github.catvod.spider.merge.G0.d dVar2 = dVar;
        boolean zM6074 = C0035.m6074(dVar2);
        C0165w c0165wM1340 = C0002.m1340(this);
        if (zM6074) {
            c0165wM1340.a = C0051.m8228(cVar);
            c0165wM1340.b = C0007.m1835(this);
            c0165wM1340.c = C0022.m4431(this);
            c0165wM1340.d = dVar2;
        }
        int iM5224 = C0029.m5224(cVar, 1);
        while (true) {
            com.github.catvod.spider.merge.G0.d[] dVarArrM8278 = C0051.m8278(dVar2);
            com.github.catvod.spider.merge.G0.d dVar3 = (dVarArrM8278 == null || iM5224 < 0 || iM5224 > 127) ? null : dVarArrM8278[iM5224];
            com.github.catvod.spider.merge.G0.d dVarM5767 = C0032.m5767();
            if (dVar3 == null) {
                K k2 = new K();
                Iterator itM7816 = C0047.m7816(C0065.m9781(C0014.m3346(dVar2)));
                int iM3044 = 0;
                while (C0012.m2962(itM7816)) {
                    C0145b c0145b3 = (C0145b) C0048.m7949(itM7816);
                    boolean z2 = C0012.m3044(c0145b3) == iM3044;
                    if (!z2 || !C0039.m6477((C0164v) c0145b3)) {
                        AbstractC0152i abstractC0152iM7799 = C0047.m7799(c0145b3);
                        int iM2139 = C0009.m2139(C0037.m6349(abstractC0152iM7799));
                        int i7 = 0;
                        while (true) {
                            if (i7 >= iM2139) {
                                k = k2;
                                break;
                            }
                            l0 l0VarM4126 = C0019.m4126(abstractC0152iM7799, i7);
                            AbstractC0152i abstractC0152iM8417 = C0060.m9325(l0VarM4126, iM5224, 1114111) ? C0053.m8417(l0VarM4126) : null;
                            if (abstractC0152iM8417 != null) {
                                C0164v c0164v = (C0164v) c0145b3;
                                C0168z c0168zM7568 = C0045.m7568(c0164v);
                                if (c0168zM7568 != null) {
                                    i5 = i7;
                                    int iM8228 = C0051.m8228(cVar) - C0026.m4936(this);
                                    i6 = iM2139;
                                    abstractC0152i2 = abstractC0152iM7799;
                                    int i8 = 0;
                                    InterfaceC0167y[] interfaceC0167yArr = null;
                                    while (true) {
                                        InterfaceC0167y[] interfaceC0167yArrM6357 = C0037.m6357(c0168zM7568);
                                        c0145b2 = c0145b3;
                                        if (i8 >= interfaceC0167yArrM6357.length) {
                                            break;
                                        }
                                        if (C0049.m8015(interfaceC0167yArrM6357[i8]) && !(interfaceC0167yArrM6357[i8] instanceof D)) {
                                            if (interfaceC0167yArr == null) {
                                                interfaceC0167yArr = (InterfaceC0167y[]) m3880(interfaceC0167yArrM6357);
                                            }
                                            interfaceC0167yArr[i8] = new D(iM8228, interfaceC0167yArrM6357[i8]);
                                        }
                                        i8++;
                                        c0145b3 = c0145b2;
                                    }
                                    if (interfaceC0167yArr != null) {
                                        c0168zM7568 = new C0168z(interfaceC0167yArr);
                                    }
                                } else {
                                    i5 = i7;
                                    i6 = iM2139;
                                    abstractC0152i2 = abstractC0152iM7799;
                                    c0145b2 = c0145b3;
                                }
                                boolean z3 = iM5224 == -1;
                                C0164v c0164v2 = new C0164v(c0164v, abstractC0152iM8417, c0168zM7568);
                                i2 = i5;
                                int i9 = i6;
                                abstractC0152i = abstractC0152i2;
                                C0145b c0145b4 = c0145b2;
                                i4 = iM3044;
                                i3 = i9;
                                k = k2;
                                if (C0020.m4265(this, cVar, c0164v2, k2, z2, true, z3)) {
                                    iM3044 = C0012.m3044(c0145b4);
                                    break;
                                }
                                c0145b = c0145b4;
                            } else {
                                i2 = i7;
                                i3 = iM2139;
                                abstractC0152i = abstractC0152iM7799;
                                c0145b = c0145b3;
                                i4 = iM3044;
                                k = k2;
                            }
                            c0145b3 = c0145b;
                            i7 = i2 + 1;
                            k2 = k;
                            abstractC0152iM7799 = abstractC0152i;
                            iM3044 = i4;
                            iM2139 = i3;
                        }
                        k2 = k;
                    }
                }
                K k3 = k2;
                i = -1;
                if (C0007.m1817(C0065.m9781(k3))) {
                    if (!C0046.m7660(k3)) {
                        C0015.m3459(dVar2, iM5224, dVarM5767);
                    }
                    dVarM8109 = dVarM5767;
                } else {
                    boolean zM7660 = C0046.m7660(k3);
                    k3.f = false;
                    dVarM8109 = C0050.m8109(this, k3);
                    if (!zM7660) {
                        C0015.m3459(dVar2, iM5224, dVarM8109);
                    }
                }
                dVar2 = dVarM8109;
            } else {
                i = -1;
                dVar2 = dVar3;
            }
            if (dVar2 == dVarM5767) {
                break;
            }
            if (iM5224 != i) {
                C0057.m9037(this, cVar);
            }
            if (C0035.m6074(dVar2)) {
                c0165wM1340.a = C0051.m8228(cVar);
                c0165wM1340.b = C0007.m1835(this);
                c0165wM1340.c = C0022.m4431(this);
                c0165wM1340.d = dVar2;
                if (iM5224 == i) {
                    break;
                }
            }
            iM5224 = C0029.m5224(cVar, 1);
        }
        com.github.catvod.spider.merge.G0.d dVarM4891 = C0026.m4891(c0165wM1340);
        com.github.catvod.spider.merge.E0.k kVarM9676 = C0064.m9676(this);
        if (dVarM4891 == null) {
            if (iM5224 == i && C0051.m8228(cVar) == C0026.m4936(this)) {
                return -1;
            }
            throw new com.github.catvod.spider.merge.E0.l(kVarM9676, cVar, C0026.m4936(this));
        }
        C0168z c0168zM4233 = C0020.m4233(dVarM4891);
        int iM4936 = C0026.m4936(this);
        int iM5245 = C0029.m5245(c0165wM1340);
        int iM3183 = C0013.m3183(c0165wM1340);
        int iM7280 = C0043.m7280(c0165wM1340);
        cVar.b = iM5245;
        this.f = iM3183;
        this.g = iM7280;
        if (c0168zM4233 != null && kVarM9676 != null) {
            try {
                InterfaceC0167y[] interfaceC0167yArrM63572 = C0037.m6357(c0168zM4233);
                int length = interfaceC0167yArrM63572.length;
                boolean z4 = false;
                for (int i10 = 0; i10 < length; i10++) {
                    try {
                        InterfaceC0167y interfaceC0167yM3287 = interfaceC0167yArrM63572[i10];
                        if (interfaceC0167yM3287 instanceof D) {
                            int iM7117 = C0042.m7117((D) interfaceC0167yM3287) + iM4936;
                            cVar.b = iM7117;
                            interfaceC0167yM3287 = C0014.m3287((D) interfaceC0167yM3287);
                            z4 = iM7117 != iM5245;
                        } else if (C0049.m8015(interfaceC0167yM3287)) {
                            cVar.b = iM5245;
                        }
                        C0009.m2041(interfaceC0167yM3287, kVarM9676);
                    } catch (Throwable th) {
                        th = th;
                        z = z4;
                        if (z) {
                            cVar.b = iM5245;
                        }
                        throw th;
                    }
                }
                if (z4) {
                    cVar.b = iM5245;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
        }
        return C0054.m8634(C0026.m4891(c0165wM1340));
    }

    public final int g(com.github.catvod.spider.merge.E0.c cVar, int i) {
        this.i = i;
        C0047.m7777(cVar);
        this.e = C0051.m8228(cVar);
        C0165w c0165wM1340 = C0002.m1340(this);
        c0165wM1340.a = -1;
        c0165wM1340.b = 0;
        c0165wM1340.c = -1;
        c0165wM1340.d = null;
        com.github.catvod.spider.merge.G0.b bVar = C0025.m4867(this)[i];
        return C0049.m7987(bVar) == null ? C0022.m4428(this, cVar) : C0049.m8040(this, cVar, C0049.m7987(bVar));
    }

    public final int h(com.github.catvod.spider.merge.E0.c cVar) {
        AbstractC0152i abstractC0152i = (AbstractC0152i) C0028.m5167(C0001.m1193(C0041.m6800(this)), C0058.m9053(this));
        C0161s c0161sM6743 = C0041.m6743();
        K k = new K();
        int i = 0;
        while (i < C0009.m2139(C0037.m6349(abstractC0152i))) {
            int i2 = i + 1;
            C0020.m4265(this, cVar, new C0164v(C0053.m8417(C0019.m4126(abstractC0152i, i)), i2, c0161sM6743), k, false, false, false);
            i = i2;
        }
        boolean zM7660 = C0046.m7660(k);
        k.f = false;
        com.github.catvod.spider.merge.G0.d dVarM8109 = C0050.m8109(this, k);
        if (!zM7660) {
            C0025.m4867(this)[C0058.m9053(this)].b = dVarM8109;
        }
        return C0049.m8040(this, cVar, dVarM8109);
    }
}