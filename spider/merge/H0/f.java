package com.github.catvod.spider.merge.H0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E0.v;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class f implements c {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f452short = {1862, 1860, 1867, 1794, 1873, 1797, 1860, 1865, 1873, 1856, 1879, 1797, 1879, 1856, 1860, 1857, 1866, 1867, 1865, 1884, 1797, 1900, 1867, 1873, 1856, 1879, 1875, 1860, 1865, 1910, 1856, 1873, 1808, 1810, 1821, 1876, 1799, 1875, 1810, 1823, 1799, 1814, 1793, 1875, 1793, 1814, 1810, 1815, 1820, 1821, 1823, 1802, 1875, 1850, 1821, 1799, 1814, 1793, 1797, 1810, 1823, 1824, 1814, 1799, 534, 532, 539, 594, 513, 597, 532, 537, 513, 528, 519, 597, 519, 528, 532, 529, 538, 539, 537, 524, 597, 572, 539, 513, 528, 519, 515, 532, 537, 550, 528, 513, 1918, 2931, 2826, 2847, 2844, 2822, 2819, 2816, 2817, 2929, 2973, 3044, 3054, 3047, 2975, 2027, 2023, 3079, 1019, 1021, 293, 511, 390, 396, 389, 509, 3008, 3008, 1781, 1785, 2855, 683, 685};
    public final ArrayList a;
    public boolean b;

    static {
        f fVar = new f(new int[0]);
        C0018.m3984(fVar, 0, 1114111);
        fVar.b = true;
        new f(new int[0]).b = true;
    }

    public f(f fVar) {
        this(new int[0]);
        C0032.m5775(this, fVar);
    }

    public f(int... iArr) {
        this.a = new ArrayList(iArr.length);
        for (int i : iArr) {
            C0065.m9745(this, i);
        }
    }

    /* renamed from: ۠۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m4139() {
        if (C0020.m4210() < 0) {
            return f452short;
        }
        return null;
    }

    public final void a(int i) {
        if (C0027.m5099(this)) {
            throw new IllegalStateException(C0004.m1549(m4139(), 0, 32, 1829));
        }
        C0018.m3984(this, i, i);
    }

    public final void b(int i, int i2) {
        e eVarM9209 = C0059.m9209(i, i2);
        if (C0027.m5099(this)) {
            throw new IllegalStateException(C0038.m6452(m4139(), 32, 32, 1907));
        }
        if (C0030.m5364(eVarM9209) < C0031.m5636(eVarM9209)) {
            return;
        }
        ArrayList arrayListM4436 = C0022.m4436(this);
        ListIterator listIteratorM1399 = C0003.m1399(arrayListM4436);
        while (C0004.m1518(listIteratorM1399)) {
            e eVar = (e) C0000.m1123(listIteratorM1399);
            if (C0008.m1973(eVarM9209, eVar)) {
                return;
            }
            int iM5636 = C0031.m5636(eVarM9209);
            int iM5364 = C0030.m5364(eVar);
            if (iM5636 != iM5364 + 1) {
                int iM53642 = C0030.m5364(eVarM9209);
                int iM56362 = C0031.m5636(eVar);
                if (iM53642 != iM56362 - 1 && ((iM5636 < iM56362 && iM53642 < iM56362) || iM5636 > iM5364)) {
                    if (iM5636 < iM56362 && iM53642 < iM56362) {
                        C0064.m9694(listIteratorM1399);
                        C0039.m6513(listIteratorM1399, eVarM9209);
                        return;
                    }
                }
            }
            e eVarM92092 = C0059.m9209(C0051.m8186(iM5636, C0031.m5636(eVar)), C0008.m1965(C0030.m5364(eVarM9209), C0030.m5364(eVar)));
            C0002.m1345(listIteratorM1399, eVarM92092);
            while (C0004.m1518(listIteratorM1399)) {
                e eVar2 = (e) C0000.m1123(listIteratorM1399);
                int iM56363 = C0031.m5636(eVarM92092);
                int iM53643 = C0030.m5364(eVar2);
                if (iM56363 != iM53643 + 1) {
                    int iM53644 = C0030.m5364(eVarM92092);
                    int iM56364 = C0031.m5636(eVar2);
                    if (iM53644 != iM56364 - 1 && ((iM56363 < iM56364 && iM53644 < iM56364) || iM56363 > iM53643)) {
                        return;
                    }
                }
                C0042.m7122(listIteratorM1399);
                C0064.m9694(listIteratorM1399);
                C0002.m1345(listIteratorM1399, C0059.m9209(C0051.m8186(C0031.m5636(eVarM92092), C0031.m5636(eVar2)), C0008.m1965(C0030.m5364(eVarM92092), C0030.m5364(eVar2))));
                C0000.m1123(listIteratorM1399);
            }
            return;
        }
        C0004.m1532(arrayListM4436, eVarM9209);
    }

    public final void c(c cVar) {
        if (cVar == null) {
            return;
        }
        int i = 0;
        if (cVar instanceof f) {
            ArrayList arrayListM4436 = C0022.m4436((f) cVar);
            int iM2139 = C0009.m2139(arrayListM4436);
            while (i < iM2139) {
                e eVar = (e) C0028.m5167(arrayListM4436, i);
                C0018.m3984(this, C0031.m5636(eVar), C0030.m5364(eVar));
                i++;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListM44362 = C0022.m4436((f) cVar);
        int iM21392 = C0009.m2139(arrayListM44362);
        while (i < iM21392) {
            e eVar2 = (e) C0028.m5167(arrayListM44362, i);
            int iM5364 = C0030.m5364(eVar2);
            for (int iM5636 = C0031.m5636(eVar2); iM5636 <= iM5364; iM5636++) {
                C0004.m1532(arrayList, C0011.m2808(iM5636));
            }
            i++;
        }
        Iterator itM7816 = C0047.m7816(arrayList);
        while (C0012.m2962(itM7816)) {
            C0065.m9745(this, C0024.m4690((Integer) C0048.m7949(itM7816)));
        }
    }

    public final boolean d(int i) {
        ArrayList arrayListM4436 = C0022.m4436(this);
        int iM2139 = C0009.m2139(arrayListM4436) - 1;
        int i2 = 0;
        while (i2 <= iM2139) {
            int i3 = (i2 + iM2139) / 2;
            e eVar = (e) C0028.m5167(arrayListM4436, i3);
            int iM5636 = C0031.m5636(eVar);
            if (C0030.m5364(eVar) < i) {
                i2 = i3 + 1;
            } else {
                if (iM5636 <= i) {
                    return true;
                }
                iM2139 = i3 - 1;
            }
        }
        return false;
    }

    public final boolean e() {
        ArrayList arrayListM4436 = C0022.m4436(this);
        return arrayListM4436 == null || C0007.m1817(arrayListM4436);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        return C0007.m1866(C0022.m4436(this), C0022.m4436((f) obj));
    }

    public final void f() {
        if (C0027.m5099(this)) {
            throw new IllegalStateException(C0027.m5062(m4139(), 64, 32, 629));
        }
        ArrayList arrayListM4436 = C0022.m4436(this);
        int iM2139 = C0009.m2139(arrayListM4436);
        for (int i = 0; i < iM2139; i++) {
            e eVar = (e) C0028.m5167(arrayListM4436, i);
            int iM5636 = C0031.m5636(eVar);
            int iM5364 = C0030.m5364(eVar);
            if (-2 < iM5636) {
                return;
            }
            if (-2 == iM5636 && -2 == iM5364) {
                C0045.m7536(arrayListM4436, i);
                return;
            }
            if (-2 == iM5636) {
                eVar.a = iM5636 + 1;
                return;
            }
            if (-2 == iM5364) {
                eVar.b = iM5364 - 1;
                return;
            }
            if (-2 > iM5636 && -2 < iM5364) {
                eVar.b = -3;
                C0018.m3984(this, -1, iM5364);
            }
        }
    }

    public final int g() {
        ArrayList arrayListM4436 = C0022.m4436(this);
        int iM2139 = C0009.m2139(arrayListM4436);
        if (iM2139 == 1) {
            e eVar = (e) C0028.m5167(arrayListM4436, 0);
            return (C0030.m5364(eVar) - C0031.m5636(eVar)) + 1;
        }
        int iM5364 = 0;
        for (int i = 0; i < iM2139; i++) {
            e eVar2 = (e) C0028.m5167(arrayListM4436, i);
            iM5364 += (C0030.m5364(eVar2) - C0031.m5636(eVar2)) + 1;
        }
        return iM5364;
    }

    public final String h(v vVar) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayListM4436 = C0022.m4436(this);
        if (arrayListM4436 == null || C0007.m1817(arrayListM4436)) {
            return C0005.m1645(m4139(), 114, 2, 896);
        }
        if (C0046.m7722(this) > 1) {
            C0018.m3933(sb, C0007.m1842(m4139(), 96, 1, 1797));
        }
        Iterator itM7816 = C0047.m7816(arrayListM4436);
        while (C0012.m2962(itM7816)) {
            e eVar = (e) C0048.m7949(itM7816);
            int iM5636 = C0031.m5636(eVar);
            int iM5364 = C0030.m5364(eVar);
            String strM8911 = C0056.m8911(m4139(), 97, 9, 2895);
            String strM6188 = C0036.m6188(m4139(), 106, 5, 2977);
            String strM1842 = C0007.m1842(m4139(), 111, 2, 1991);
            if (iM5636 == iM5364) {
                if (iM5636 == -1) {
                    strM8911 = strM6188;
                } else if (iM5636 != -2) {
                    strM8911 = C0017.m3714(vVar, iM5636);
                }
                C0018.m3933(sb, strM8911);
            } else {
                int i = iM5636;
                while (i <= iM5364) {
                    if (i > iM5636) {
                        C0018.m3933(sb, strM1842);
                    }
                    C0018.m3933(sb, i == -1 ? strM6188 : i == -2 ? strM8911 : C0017.m3714(vVar, i));
                    i++;
                }
            }
            if (C0012.m2962(itM7816)) {
                C0018.m3933(sb, strM1842);
            }
        }
        if (C0046.m7722(this) > 1) {
            C0018.m3933(sb, C0002.m1305(m4139(), 113, 1, 3194));
        }
        return C0047.m7763(sb);
    }

    public final int hashCode() {
        ArrayList arrayListM4436 = C0022.m4436(this);
        Iterator itM7816 = C0047.m7816(arrayListM4436);
        int iM9238 = 0;
        while (C0012.m2962(itM7816)) {
            e eVar = (e) C0048.m7949(itM7816);
            iM9238 = C0059.m9238(C0059.m9238(iM9238, C0031.m5636(eVar)), C0030.m5364(eVar));
        }
        return C0043.m7334(iM9238, C0009.m2139(arrayListM4436) * 2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayListM4436 = C0022.m4436(this);
        if (arrayListM4436 == null || C0007.m1817(arrayListM4436)) {
            return C0030.m5362(m4139(), 127, 2, 720);
        }
        if (C0046.m7722(this) > 1) {
            C0018.m3933(sb, C0030.m5362(m4139(), 116, 1, 350));
        }
        Iterator itM7816 = C0047.m7816(arrayListM4436);
        while (C0012.m2962(itM7816)) {
            e eVar = (e) C0048.m7949(itM7816);
            int iM5636 = C0031.m5636(eVar);
            int iM5364 = C0030.m5364(eVar);
            if (iM5636 != iM5364) {
                C0036.m6177(sb, iM5636);
                C0018.m3933(sb, C0006.m1774(m4139(), 122, 2, 3054));
                C0036.m6177(sb, iM5364);
            } else if (iM5636 == -1) {
                C0018.m3933(sb, C0054.m8574(m4139(), 117, 5, 451));
            } else {
                C0036.m6177(sb, iM5636);
            }
            if (C0012.m2962(itM7816)) {
                C0018.m3933(sb, C0029.m5256(m4139(), 124, 2, 1753));
            }
        }
        if (C0046.m7722(this) > 1) {
            C0018.m3933(sb, C0036.m6188(m4139(), 126, 1, 2906));
        }
        return C0047.m7763(sb);
    }
}