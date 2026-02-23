package com.github.catvod.spider.merge.K0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class a extends c {
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final int i;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f462short = {854, 851, 852, 863, 873, 863, 842, 859, 840, 859, 846, 853, 840, 794, 855, 847, 841, 846, 794, 852, 853, 846, 794, 857, 853, 852, 846, 859, 851, 852, 794, 856, 859, 841, 863, 780, 782, 794, 857, 850, 859, 840, 859, 857, 846, 863, 840, 841, 768, 794, 865, 1665, 1406, 1397, 1400, 1396, 1407, 1406, 1359, 1402, 1401, 1399, 1406, 1339, 1398, 1390, 1384, 1391, 1339, 1395, 1402, 1389, 1406, 1339, 1406, 1379, 1402, 1400, 1391, 1399, 1378, 1339, 1325, 1327, 1339, 1406, 1397, 1391, 1385, 1394, 1406, 1384, 1333, 1712, 1687, 1673, 1676, 1677, 1753, 1688, 1675, 1675, 1688, 1664, 1753, 1677, 1686, 1686, 1753, 1691, 1680, 1694, 1749, 1753, 1677, 1681, 1692, 1753, 1686, 1676, 1677, 1673, 1676, 1677, 1753, 1688, 1675, 1675, 1688, 1664, 1753, 1678, 1686, 1676, 1685, 1693, 1753, 1691, 1692, 1753, 1691, 1680, 1694, 1694, 1692, 1675, 1753, 1745, 683, 674, 758, 746, 739, 748, 674, 758, 746, 743, 674, 753, 754, 743, 737, 747, 740, 747, 743, 742, 674, 751, 739, 762, 747, 751, 759, 751, 674, 753, 747, 760, 743, 674, 749, 740, 674, 688, 691, 694, 693, 694, 698, 689, 692, 694, 693, 2799, 2760, 2766, 2773, 2783, 2760, 2716, 2776, 2777, 2783, 2771, 2776, 2773, 2770, 2779, 2694, 2716, 2800, 2781, 2767, 2760, 2716, 2777, 2770, 2783, 2771, 2776, 2777, 2776, 2716, 2783, 2772, 2781, 2766, 2781, 2783, 2760, 2777, 2766, 2716, 2708, 2782, 2777, 2778, 2771, 2766, 2777, 2716, 2760, 2772, 2777, 2716, 2764, 2781, 2776, 2776, 2773, 2770, 2779, 2767, 2716, 2773, 2778, 2716, 2781, 2770, 2757, 2709, 2716, 2773, 2767, 2716, 2781, 2716, 2762, 2781, 2768, 2773, 2776, 2716, 2782, 2781, 2767, 2777, 2716, 2698, 2696, 2716, 2781, 2768, 2764, 2772, 2781, 2782, 2777, 2760, 2716, 2782, 2761, 2760, 2716, 2770, 2771, 2760, 2716, 2781, 2716, 2764, 2771, 2767, 2767, 2773, 2782, 2768, 2777, 2716, 2777, 2770, 2783, 2771, 2776, 2773, 2770, 2779, 2706, 2716, 2809, 2756, 2764, 2777, 2783, 2760, 2777, 2776, 2716, 2760, 2772, 2777, 2716, 2776, 2773, 2767, 2783, 2781, 2766, 2776, 2777, 2776, 2716, 2782, 2773, 2760, 2767, 2716, 2778, 2766, 2771, 2769, 2716, 2760, 2772, 2777, 2716, 2783, 2772, 2781, 2766, 2781, 2783, 2760, 2777, 2766, 2716, 2760, 2771, 2716, 2782, 2777, 2716, 2758, 2777, 2766, 2771, 2706, 2178, 2214, 2235, 2212, 2232, 2232, 2210, 2217, 2215, 2222, 2283, 2214, 2212, 2223, 2238, 2215, 2238, 2232, 2283, 445, 410, 412, 391, 397, 410, 462, 394, 395, 397, 385, 394, 391, 384, 393, 468, 462, 418, 399, 413, 410, 462, 395, 384, 397, 385, 394, 395, 394, 462, 397, 390, 399, 412, 399, 397, 410, 395, 412, 462, 454, 396, 395, 392, 385, 412, 395, 462, 410, 390, 395, 462, 414, 399, 394, 394, 391, 384, 393, 413, 462, 391, 392, 462, 399, 384, 407, 455, 462, 391, 413, 462, 399, 462, 408, 399, 386, 391, 394, 462, 396, 399, 413, 395, 462, 472, 474, 462, 399, 386, 414, 390, 399, 396, 395, 410, 462, 396, 411, 410, 462, 384, 385, 410, 462, 399, 462, 414, 385, 413, 413, 391, 396, 386, 395, 462, 395, 384, 397, 385, 394, 391, 384, 393, 448, 462, 426, 395, 397, 385, 394, 391, 384, 393, 462, 412, 395, 415, 411, 391, 412, 395, 413, 462, 399, 410, 462, 386, 395, 399, 413, 410, 462, 410, 409, 385, 462, 410, 412, 399, 391, 386, 391, 384, 393, 462, 472, 451, 396, 391, 410, 462, 397, 390, 399, 412, 399, 397, 410, 395, 412, 413, 462, 410, 385, 462, 397, 412, 395, 399, 410, 395, 462, 396, 407, 410, 395, 413, 448, 1930, 1966, 1971, 1964, 1968, 1968, 1962, 1953, 1967, 1958, 2019, 1966, 1964, 1959, 1974, 1967, 1974, 1968, 2019};
    public static final byte[] j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte[] k = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public a() {
        this(0, C0003.m1393());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i, byte[] bArr) {
        super(i, bArr.length);
        byte[] bArrM9136 = C0058.m9136();
        if (bArrM9136.length != 64) {
            throw new IllegalArgumentException(C0046.m7718(m4391(), 52, 41, 1307));
        }
        this.g = C0009.m2109();
        this.f = bArrM9136;
        byte[] bArr2 = (byte[]) m4390(bArr);
        for (byte b : bArr2) {
            if (C0020.m4255(this) != b) {
                if (b >= 0) {
                    byte[] bArrM8560 = C0054.m8560(this);
                    if (b >= bArrM8560.length || bArrM8560[b] == -1) {
                    }
                }
            }
            throw new IllegalArgumentException(C0000.m1130(C0043.m7290(m4391(), 0, 51, 826), new String(bArr2, C0034.m5989()), C0013.m3106(m4391(), 51, 1, 1756)));
        }
        if (i > 0) {
            this.i = bArr2.length + 4;
            this.h = bArr2;
        } else {
            this.i = 4;
            this.h = null;
        }
    }

    public static byte[] d(String str) {
        a aVar = new a();
        byte[] bArrM3018 = str == null ? null : C0012.m3018(str, C0034.m5989());
        if (bArrM3018 == null || bArrM3018.length == 0) {
            return bArrM3018;
        }
        b bVar = new b();
        C0015.m3473(aVar, bArrM3018, bArrM3018.length, bVar);
        C0015.m3473(aVar, bArrM3018, -1, bVar);
        int iM6547 = C0039.m6547(bVar);
        byte[] bArr = new byte[iM6547];
        C0029.m5246(bArr, iM6547, bVar);
        return bArr;
    }

    public static byte[] f(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = new a(0, C0003.m1393());
        long length = ((bArr.length + 2) / 3) * 4;
        int iM5755 = C0032.m5755(aVar);
        if (iM5755 > 0) {
            long j2 = iM5755;
            length += (((length + j2) - 1) / j2) * C0028.m5190(aVar);
        }
        if (length > Integer.MAX_VALUE) {
            StringBuilder sb = new StringBuilder(C0040.m6584(m4391(), 93, 55, 1785));
            C0058.m9141(sb, length);
            C0018.m3933(sb, C0039.m6551(m4391(), 148, 47, 642));
            throw new IllegalArgumentException(C0047.m7763(sb));
        }
        if (bArr.length == 0) {
            return bArr;
        }
        int length2 = bArr.length;
        if (bArr.length == 0) {
            return bArr;
        }
        b bVar = new b();
        C0013.m3123(aVar, bArr, length2, bVar);
        C0013.m3123(aVar, bArr, -1, bVar);
        int iM6547 = C0039.m6547(bVar) - C0038.m6409(bVar);
        byte[] bArr2 = new byte[iM6547];
        C0029.m5246(bArr2, iM6547, bVar);
        return bArr2;
    }

    public static String g(byte[] bArr) {
        byte[] bArrM1553 = C0004.m1553(bArr);
        Charset charsetM8865 = C0056.m8865();
        if (bArrM1553 == null) {
            return null;
        }
        return new String(bArrM1553, charsetM8865);
    }

    /* renamed from: ۥۣ۠ۤ, reason: contains not printable characters */
    public static Object m4390(Object obj) {
        if (C0051.m8216() < 0) {
            return ((byte[]) obj).clone();
        }
        return null;
    }

    /* renamed from: ۧۤۢۡ, reason: not valid java name and contains not printable characters */
    public static short[] m4391() {
        if (C0013.m3167() >= 0) {
            return f462short;
        }
        return null;
    }

    public final void c(byte[] bArr, int i, b bVar) {
        byte b;
        if (C0065.m9711(bVar)) {
            return;
        }
        if (i < 0) {
            bVar.e = true;
        }
        int iM3093 = C0013.m3093(this) - 1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            byte[] bArrM8090 = C0050.m8090(iM3093, bVar);
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 == C0020.m4255(this)) {
                bVar.e = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArrM8560 = C0054.m8560(this);
                if (b2 < bArrM8560.length && (b = bArrM8560[b2]) >= 0) {
                    int iM3421 = (C0015.m3421(bVar) + 1) % 4;
                    bVar.g = iM3421;
                    int iM1162 = (C0001.m1162(bVar) << 6) + b;
                    bVar.a = iM1162;
                    if (iM3421 == 0) {
                        int iM6547 = C0039.m6547(bVar);
                        bArrM8090[iM6547] = (byte) ((iM1162 >> 16) & 255);
                        bArrM8090[iM6547 + 1] = (byte) ((iM1162 >> 8) & 255);
                        bVar.c = iM6547 + 3;
                        bArrM8090[iM6547 + 2] = (byte) (iM1162 & 255);
                    }
                }
            }
            i2++;
            i3 = i4;
        }
        if (!C0065.m9711(bVar) || C0015.m3421(bVar) == 0) {
            return;
        }
        byte[] bArrM80902 = C0050.m8090(iM3093, bVar);
        int iM34212 = C0015.m3421(bVar);
        int iM6405 = C0038.m6405(this);
        if (iM34212 == 1) {
            if (iM6405 == 1) {
                throw new IllegalArgumentException(C0028.m5109(m4391(), 398, 199, 494));
            }
            return;
        }
        String strM6584 = C0040.m6584(m4391(), 195, 184, 2748);
        if (iM34212 == 2) {
            if (iM6405 == 1 && (C0001.m1162(bVar) & 15) != 0) {
                throw new IllegalArgumentException(strM6584);
            }
            int iM11622 = C0001.m1162(bVar) >> 4;
            bVar.a = iM11622;
            int iM65472 = C0039.m6547(bVar);
            bVar.c = iM65472 + 1;
            bArrM80902[iM65472] = (byte) (iM11622 & 255);
            return;
        }
        if (iM34212 != 3) {
            StringBuilder sb = new StringBuilder(C0043.m7290(m4391(), 379, 19, 2251));
            C0036.m6177(sb, C0015.m3421(bVar));
            throw new IllegalStateException(C0047.m7763(sb));
        }
        if (iM6405 == 1 && (C0001.m1162(bVar) & 3) != 0) {
            throw new IllegalArgumentException(strM6584);
        }
        int iM11623 = C0001.m1162(bVar);
        int i5 = iM11623 >> 2;
        bVar.a = i5;
        int iM65473 = C0039.m6547(bVar);
        bArrM80902[iM65473] = (byte) ((iM11623 >> 10) & 255);
        bVar.c = iM65473 + 2;
        bArrM80902[iM65473 + 1] = (byte) (i5 & 255);
    }

    public final void e(byte[] bArr, int i, b bVar) {
        if (C0065.m9711(bVar)) {
            return;
        }
        int iM3093 = C0013.m3093(this);
        byte[] bArrM9627 = C0064.m9627(this);
        int iM5755 = C0032.m5755(this);
        byte[] bArrM9153 = C0058.m9153(this);
        if (i >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                byte[] bArrM8090 = C0050.m8090(iM3093, bVar);
                int iM3421 = (C0015.m3421(bVar) + 1) % 3;
                bVar.g = iM3421;
                int i4 = i3 + 1;
                int i5 = bArr[i3];
                if (i5 < 0) {
                    i5 += 256;
                }
                int iM1162 = (C0001.m1162(bVar) << 8) + i5;
                bVar.a = iM1162;
                if (iM3421 == 0) {
                    int iM6547 = C0039.m6547(bVar);
                    bArrM8090[iM6547] = bArrM9627[(iM1162 >> 18) & 63];
                    bArrM8090[iM6547 + 1] = bArrM9627[(iM1162 >> 12) & 63];
                    int i6 = iM6547 + 3;
                    bArrM8090[iM6547 + 2] = bArrM9627[(iM1162 >> 6) & 63];
                    int i7 = iM6547 + 4;
                    bVar.c = i7;
                    bArrM8090[i6] = bArrM9627[iM1162 & 63];
                    int iM1500 = C0004.m1500(bVar) + 4;
                    bVar.f = iM1500;
                    if (iM5755 > 0 && iM5755 <= iM1500) {
                        C0062.m9384(bArrM9153, 0, bArrM8090, i7, bArrM9153.length);
                        bVar.c = C0039.m6547(bVar) + bArrM9153.length;
                        bVar.f = 0;
                    }
                }
                i2++;
                i3 = i4;
            }
            return;
        }
        bVar.e = true;
        if (C0015.m3421(bVar) == 0 && iM5755 == 0) {
            return;
        }
        byte[] bArrM80902 = C0050.m8090(iM3093, bVar);
        int iM65472 = C0039.m6547(bVar);
        int iM34212 = C0015.m3421(bVar);
        if (iM34212 != 0) {
            byte[] bArrM9136 = C0058.m9136();
            byte bM4255 = C0020.m4255(this);
            if (iM34212 == 1) {
                int iM11622 = C0001.m1162(bVar);
                bArrM80902[iM65472] = bArrM9627[(iM11622 >> 2) & 63];
                int i8 = iM65472 + 2;
                bVar.c = i8;
                bArrM80902[iM65472 + 1] = bArrM9627[(iM11622 << 4) & 63];
                if (bArrM9627 == bArrM9136) {
                    bArrM80902[i8] = bM4255;
                    bVar.c = iM65472 + 4;
                    bArrM80902[iM65472 + 3] = bM4255;
                }
            } else {
                if (iM34212 != 2) {
                    StringBuilder sb = new StringBuilder(C0058.m9106(m4391(), 597, 19, 1987));
                    C0036.m6177(sb, C0015.m3421(bVar));
                    throw new IllegalStateException(C0047.m7763(sb));
                }
                int iM11623 = C0001.m1162(bVar);
                bArrM80902[iM65472] = bArrM9627[(iM11623 >> 10) & 63];
                bArrM80902[iM65472 + 1] = bArrM9627[(iM11623 >> 4) & 63];
                int i9 = iM65472 + 3;
                bVar.c = i9;
                bArrM80902[iM65472 + 2] = bArrM9627[(iM11623 << 2) & 63];
                if (bArrM9627 == bArrM9136) {
                    bVar.c = iM65472 + 4;
                    bArrM80902[i9] = bM4255;
                }
            }
        }
        int iM15002 = C0004.m1500(bVar);
        int iM65473 = C0039.m6547(bVar);
        int i10 = (iM65473 - iM65472) + iM15002;
        bVar.f = i10;
        if (iM5755 <= 0 || i10 <= 0) {
            return;
        }
        C0062.m9384(bArrM9153, 0, bArrM80902, iM65473, bArrM9153.length);
        bVar.c = C0039.m6547(bVar) + bArrM9153.length;
    }
}