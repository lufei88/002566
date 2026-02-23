package com.github.catvod.spider.merge.l0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0163u;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import javax.net.ssl.SSLException;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f832short = {1266, 1265, 1268, 1261, 1267, 1261, 1267, 1261, 1266, 2283, 2952, 2944, 2961, 2957, 2954, 2945, 1768, 1780, 1780, 1776, 1679, 1681, 1678, 1681, 565, 564, 635, 555, 553, 564, 559, 564, 568, 564, 567, 635, 557, 574, 553, 552, 562, 564, 565, 635, 552, 555, 574, 568, 562, 573, 562, 574, 575, 631, 635, 552, 559, 553, 570, 565, 572, 574, 629, 635, 538, 552, 552, 558, 566, 562, 565, 572, 635, 531, 527, 527, 523, 628, 618, 629, 618, 629, 1795, 1796, 1823, 1336, 1339, 1342, 1370, 1320, 1343, 1323, 1327, 1343, 1321, 1326, 1344, 1370, 1335, 1299, 1289, 1289, 1299, 1300, 1309, 1370, 1327, 1320, 1331, 1364, 1370, 1327, 1289, 1307, 1309, 1311, 1344, 1370, 1341, 1343, 1326, 1370, 1365, 1311, 1282, 1307, 1303, 1290, 1302, 1311, 1365, 1308, 1299, 1302, 1311, 1364, 1298, 1294, 1303, 1302, 1461, 1462, 1459, 1495, 1445, 1458, 1446, 1442, 1458, 1444, 1443, 1485, 1495, 1444, 1422, 1433, 1411, 1430, 1423, 1495, 1426, 1413, 1413, 1432, 1413, 1497, 1495, 1442, 1412, 1430, 1424, 1426, 1485, 1495, 1456, 1458, 1443, 1495, 1496, 1426, 1423, 1430, 1434, 1415, 1435, 1426, 1496, 1425, 1438, 1435, 1426, 1497, 1439, 1411, 1434, 1435, 1009, 999, 1008, 1012, 999, 1008, 898, 1003, 1004, 1014, 999, 1008, 1004, 995, 1006, 898, 999, 1008, 1008, 1005, 1008, 920, 898, 1003, 1005, 999, 986, 961, 967, 978, 982, 971, 973, 972, 920, 898, 2456, 2448, 2433, 2461, 2458, 2449, 2185, 2200, 2181, 2185, 2258, 2189, 2193, 2204, 2196, 2195, 473, 502, 505, 504, 479, 483, 483, 487, 499, 439, 452, 511, 482, 483, 499, 504, 480, 505, 2122, 2141, 2133, 2135, 2124, 2141, 2069, 2137, 2140, 2140, 2122, 732, 704, 704, 708, 665, 727, 728, 733, 721, 730, 704, 665, 733, 708, 1092, 1091, 1112, 2488, 2484, 2485, 2485, 2494, 2488, 2479, 2482, 2484, 2485, 844, 848, 848, 852, 811, 821, 810, 821, 1852, 1835, 1917, 1853, 1850, 1854, 1911, 1912, 1915, 1895, 1905, 1850, 1854, 1619, 1617, 1617, 1623, 1602, 1606, 1567, 1623, 1628, 1617, 1629, 1622, 1627, 1628, 1621, 2197, 2184, 2203, 2178, 849, 850, 855, 819, 833, 854, 834, 838, 854, 832, 839, 809, 819, 832, 874, 893, 871, 882, 875, 819, 886, 865, 865, 892, 865, 829, 819, 859, 839, 839, 835, 819, 869, 886, 865, 881, 819, 2095, 2170, 2145, 2151, 2158, 2145, 2155, 2147, 2154, 2155, 2081, 1334, 1312, 1335, 1331, 1312, 1335, 1349, 1324, 1323, 1329, 1312, 1335, 1323, 1316, 1321, 1349, 1312, 1335, 1335, 1322, 1335, 1375, 1349, 1324, 1322, 1312, 1309, 1286, 1280, 1301, 1297, 1292, 1290, 1291, 1375, 1349, 496, 496, 495, 387, 499, 497, 492, 503, 492, 480, 492, 495, 387, 485, 482, 490, 495, 502, 497, 486, 409, 387};
    public final C0163u a;
    public final OutputStream b;
    public final BufferedInputStream c;
    public int d;
    public int e;
    public String f;
    public int g;
    public HashMap h;
    public HashMap i;
    public c j;
    public final String k;
    public String l;
    public final /* synthetic */ m m;

    public e(m mVar, C0163u c0163u, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.m = mVar;
        this.a = c0163u;
        this.c = new BufferedInputStream(inputStream, 8192);
        this.b = outputStream;
        this.k = (C0063.m9555(inetAddress) || C0033.m5793(inetAddress)) ? C0030.m5362(m8845(), 0, 9, 1219) : C0046.m7725(C0002.m1269(inetAddress));
        if (!C0063.m9555(inetAddress) && !C0033.m5793(inetAddress)) {
            C0047.m7777(C0033.m5871(inetAddress));
        }
        this.i = new HashMap();
    }

    public static void b(String str, Map map) {
        String strM9640;
        String strM1840;
        if (str == null) {
            return;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, C0063.m9585(m8845(), 9, 1, 2253));
        while (C0047.m7838(stringTokenizer)) {
            String strM5025 = C0027.m5025(stringTokenizer);
            int iM7935 = C0048.m7935(strM5025, 61);
            if (iM7935 >= 0) {
                strM9640 = C0064.m9640(C0039.m6504(C0054.m8636(strM5025, 0, iM7935)));
                strM1840 = C0039.m6504(C0056.m8890(strM5025, iM7935 + 1));
            } else {
                strM9640 = C0064.m9640(C0039.m6504(strM5025));
                strM1840 = C0007.m1840();
            }
            Object arrayList = (List) C0062.m9431(map, strM9640);
            if (arrayList == null) {
                arrayList = new ArrayList();
                C0006.m1755(map, strM9640, arrayList);
            }
            C0063.m9550(arrayList, strM1840);
        }
    }

    public static int d(int i, byte[] bArr) {
        int i2;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i) {
                return 0;
            }
            byte b = bArr[i3];
            if (b == 13 && bArr[i4] == 10 && (i2 = i3 + 3) < i && bArr[i3 + 2] == 13 && bArr[i2] == 10) {
                return i3 + 4;
            }
            if (b == 10 && bArr[i4] == 10) {
                return i3 + 2;
            }
            i3 = i4;
        }
    }

    /* renamed from: ۟ۡ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8845() {
        if (C0028.m5152() <= 0) {
            return f832short;
        }
        return null;
    }

    public final void a(BufferedReader bufferedReader, HashMap map, Map map2, Map map3) {
        String strM6504;
        try {
            String strM4438 = C0022.m4438(bufferedReader);
            if (strM4438 == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(strM4438);
            if (!C0047.m7838(stringTokenizer)) {
                throw new k(C0002.m1305(m8845(), 140, 56, 1527));
            }
            C0053.m8424(map, C0064.m9599(m8845(), 10, 6, 3045), C0027.m5025(stringTokenizer));
            if (!C0047.m7838(stringTokenizer)) {
                throw new k(C0014.m3332(m8845(), 85, 55, 1402));
            }
            String strM5025 = C0027.m5025(stringTokenizer);
            int iM7935 = C0048.m7935(strM5025, 63);
            if (iM7935 >= 0) {
                C0055.m8760(C0056.m8890(strM5025, iM7935 + 1), map2);
                strM6504 = C0039.m6504(C0054.m8636(strM5025, 0, iM7935));
            } else {
                strM6504 = C0039.m6504(strM5025);
            }
            if (C0047.m7838(stringTokenizer)) {
                this.l = C0027.m5025(stringTokenizer);
            } else {
                this.l = C0039.m6551(m8845(), 16, 8, 1696);
                C0040.m6658(C0013.m3148(), C0002.m1277(), C0026.m4951(m8845(), 24, 58, 603));
            }
            while (true) {
                String strM44382 = C0022.m4438(bufferedReader);
                if (strM44382 == null || C0057.m8953(C0064.m9640(strM44382))) {
                    break;
                }
                int iM79352 = C0048.m7935(strM44382, 58);
                if (iM79352 >= 0) {
                    C0006.m1755(map3, C0039.m6565(C0064.m9640(C0054.m8636(strM44382, 0, iM79352)), C0025.m4785()), C0064.m9640(C0056.m8890(strM44382, iM79352 + 1)));
                }
            }
            C0053.m8424(map, C0047.m7833(m8845(), 82, 3, 1910), strM6504);
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder(C0058.m9106(m8845(), 196, 36, 930));
            C0018.m3933(sb, C0036.m6261(e));
            throw new k(C0047.m7763(sb), e);
        }
    }

    public final void c() {
        byte[] bArr;
        boolean z;
        BufferedInputStream bufferedInputStreamM5747;
        int iM8009;
        i iVarM8573 = C0054.m8573();
        String strM5362 = C0030.m5362(m8845(), 232, 6, 2549);
        String strM9599 = C0064.m9599(m8845(), 238, 10, 2301);
        m mVarM1624 = C0005.m1624(this);
        String strM53622 = C0030.m5362(m8845(), 248, 18, 407);
        C0163u c0163uM7173 = C0042.m7173(this);
        OutputStream outputStreamM9140 = C0058.m9140(this);
        j jVarM3477 = null;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                bArr = new byte[8192];
                                z = false;
                                this.d = 0;
                                this.e = 0;
                                bufferedInputStreamM5747 = C0032.m5747(this);
                                C0009.m2135(bufferedInputStreamM5747, 8192);
                                try {
                                    iM8009 = C0049.m8009(bufferedInputStreamM5747, bArr, 0, 8192);
                                } catch (SSLException e) {
                                    throw e;
                                } catch (IOException unused) {
                                    C0048.m7903(bufferedInputStreamM5747);
                                    C0048.m7903(outputStreamM9140);
                                    throw new SocketException(strM53622);
                                }
                            } catch (SocketException e2) {
                                throw e2;
                            }
                        } catch (k e3) {
                            C0043.m7348(C0021.m4377(C0030.m5415(e3), strM9599, C0036.m6261(e3)), outputStreamM9140);
                            C0048.m7903(outputStreamM9140);
                            C0048.m7903(jVarM3477);
                            C0019.m4106(c0163uM7173);
                        }
                    } catch (IOException e4) {
                        StringBuilder sb = new StringBuilder();
                        C0018.m3933(sb, C0027.m5062(m8845(), 392, 36, 1381));
                        C0018.m3933(sb, C0036.m6261(e4));
                        C0043.m7348(C0021.m4377(iVarM8573, strM9599, C0047.m7763(sb)), outputStreamM9140);
                        C0048.m7903(outputStreamM9140);
                        C0048.m7903(jVarM3477);
                        C0019.m4106(c0163uM7173);
                    }
                } catch (SSLException e5) {
                    StringBuilder sb2 = new StringBuilder();
                    C0018.m3933(sb2, C0063.m9585(m8845(), 428, 22, 419));
                    C0018.m3933(sb2, C0036.m6261(e5));
                    C0043.m7348(C0021.m4377(iVarM8573, strM9599, C0047.m7763(sb2)), outputStreamM9140);
                    C0048.m7903(outputStreamM9140);
                    C0048.m7903(jVarM3477);
                    C0019.m4106(c0163uM7173);
                }
                if (iM8009 == -1) {
                    C0048.m7903(bufferedInputStreamM5747);
                    C0048.m7903(outputStreamM9140);
                    throw new SocketException(strM53622);
                }
                while (iM8009 > 0) {
                    int iM8191 = C0051.m8191(this) + iM8009;
                    this.e = iM8191;
                    int iM7965 = C0048.m7965(iM8191, bArr);
                    this.d = iM7965;
                    if (iM7965 > 0) {
                        break;
                    }
                    int iM81912 = C0051.m8191(this);
                    iM8009 = C0049.m8009(bufferedInputStreamM5747, bArr, iM81912, 8192 - iM81912);
                }
                if (C0015.m3504(this) < C0051.m8191(this)) {
                    C0002.m1346(bufferedInputStreamM5747);
                    C0058.m9080(bufferedInputStreamM5747, C0015.m3504(this));
                }
                this.h = new HashMap();
                HashMap mapM8221 = C0051.m8221(this);
                if (mapM8221 == null) {
                    this.i = new HashMap();
                } else {
                    C0062.m9402(mapM8221);
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, C0051.m8191(this))));
                HashMap map = new HashMap();
                C0051.m8231(this, bufferedReader, map, C0037.m6326(this), C0051.m8221(this));
                String strM3100 = C0013.m3100(this);
                if (strM3100 != null) {
                    C0053.m8424(C0051.m8221(this), C0008.m1970(m8845(), 266, 11, 2104), strM3100);
                    C0053.m8424(C0051.m8221(this), C0002.m1305(m8845(), 277, 14, 692), strM3100);
                }
                int iM5056 = C0027.m5056((String) C0065.m9715(map, strM5362));
                this.g = iM5056;
                if (iM5056 == 0) {
                    StringBuilder sb3 = new StringBuilder();
                    C0018.m3933(sb3, C0008.m1970(m8845(), 344, 37, 787));
                    C0018.m3933(sb3, (String) C0065.m9715(map, strM5362));
                    C0018.m3933(sb3, C0038.m6452(m8845(), 381, 11, 2063));
                    throw new k(C0047.m7763(sb3));
                }
                this.f = (String) C0065.m9715(map, C0006.m1774(m8845(), 291, 3, 1073));
                this.j = new c(C0051.m8221(this));
                String str = (String) C0065.m9715(C0051.m8221(this), C0047.m7833(m8845(), 294, 10, 2523));
                boolean z2 = C0007.m1815(C0016.m3525(m8845(), 304, 8, 772), C0059.m9227(this)) && (str == null || !C0064.m9686(str, C0005.m1645(m8845(), 312, 13, 1812)));
                jVarM3477 = C0015.m3477(mVarM1624, this);
                String str2 = (String) C0065.m9715(C0051.m8221(this), C0026.m4951(m8845(), 325, 15, 1586));
                C0044.m7479(C0040.m6583(this));
                C0046.m7727(jVarM3477, C0019.m4092(this));
                if (C0059.m9260(jVarM3477) && str2 != null && C0058.m9127(str2, C0027.m5062(m8845(), 340, 4, 2290))) {
                    z = true;
                }
                C0052.m8363(jVarM3477, z);
                C0052.m8316(jVarM3477, z2);
                C0043.m7348(jVarM3477, outputStreamM9140);
                if (!z2 || C0023.m4595(jVarM3477)) {
                    throw new SocketException(strM53622);
                }
                C0048.m7903(jVarM3477);
                C0019.m4106(c0163uM7173);
            } catch (SocketTimeoutException e6) {
                throw e6;
            }
        } catch (Throwable th) {
            C0048.m7903(null);
            C0019.m4106(c0163uM7173);
            throw th;
        }
    }
}