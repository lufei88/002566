package com.github.catvod.spider.merge.g0;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0163u;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.Gson;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f795short = {401, 2123, 2113, 2135, 2133, 3240, 3245, 3245, 3226, 3260, 3257, 3257, 3259, 3244, 3258, 3258, 3244, 3245, 22610, 22702, 27724, 18237, 22577, -25390, -2351, 2936, 2940, 2922, 2838, 2938, 2939, 2938, 2838, 2921, 2930, 2938, 2922, 2830, 2921, 2904, 2909, 2909, 2896, 2903, 2910, 2899, 2903, 2881, 778, 779, 793, 882, 871, 2930, 2857, 2850, 2928, 2877, 2879, 2850, 2869, 2868, 2923, 2872, 2879, 2849, 2928, 3032, 2966, 2971, 2975, 2970, 2971, 2956, 3011, 28526, 26203, 22702, -25366, 28425, 17528, 2740, 2734, 893, 886, 883, 881, 890, 830, 809, 809, 809, 830, 937, 914, 927, 918, 918, 986, 921, 917, 919, 919, 923, 916, 926, 986, 924, 923, 915, 918, 927, 926, 986, 909, 915, 910, 914, 986, 927, 898, 915, 910, 986, 921, 917, 926, 927, 986, 2527, 2523, 2509, 507, 511, 489, 405, 511, 505, 504, 405, 490, 497, 505, 489, 399, 490, 475, 478, 478, 467, 468, 477, 418, 419, 433, 474, 463, 2239, 2235, 2221, 1349, 1348, 1366, 1341, 1320, 3121, 3125, 3107, 362, 264, 604, 602, 592, 579, 583, 594, 1295, 2198, 2205, 2178, 2261, 2195, 2198, 2240, 2289, 1175, 1174, 1156, 1263, 1274, 1889, 1891, 1906, 766, 701, 672, 740, 2807, 2792, 2789, 2788, 2798, 2734, 2796, 2801, 2741, 511, 422, 436, 435, 444, 2374, 2393, 2388, 2389, 2399, 2335, 2375, 2389, 2386, 2397, 906, 965, 978, 973, 960, 991, 978, 979, 985, 921, 974, 923, 987, 965, 960, 991, 978, 979, 985, 2979, 3066, 3040, 3067, 1293, 1298, 1311, 1310, 1300, 1364, 1283, 1366, 1302, 1288, 1366, 1292, 1302, 1293, 2207, 2263, 2269, 2247, 2432, 2463, 2450, 2451, 2457, 2521, 2446, 2523, 2448, 2458, 2432, 843, 776, 778, 787, 1184, 1215, 1202, 1203, 1209, 1273, 1191, 1187, 1215, 1205, 1213, 1186, 1215, 1211, 1203, 906, 969, 975, 978, 3049, 3062, 3067, 3066, 3056, 2992, 3047, 2994, 3058, 3070, 3051, 3053, 3056, 3052, 3060, 3070, 1925, 1990, 2011, 1998, 1996, 2576, 2575, 2562, 2563, 2569, 2633, 2571, 2582, 2563, 2561, 2771, 2766, 2714, 2701, 3273, 3286, 3291, 3290, 3280, 3216, 3212, 3288, 3279, 3279, 1713, 1771, 1772, 530, 525, 512, 513, 523, 587, 553, 564, 598, 560, 697, 762, 743, 676, 1796, 1808, 1793, 1804, 1802, 1866, 1800, 1813, 1878, 2066, 2123, 2141, 2122, 3198, 3178, 3195, 3190, 3184, 3120, 3176, 3198, 3177, 3005, 3058, 3058, 3056, 2264, 2252, 2269, 2256, 2262, 2198, 2264, 2264, 2266, 2190, 2207, 2178, 2190, 2261, 2186, 2198, 2203, 2195, 2196, 646, 666, 666, 670, 669, 724, 705, 705, 655, 670, 647, 704, 640, 640, 704, 653, 647, 705, 641, 653, 668, 705, 652, 728, 730, 705, 666, 651, 662, 666, 2703, 2729, 2751, 2728, 2807, 2715, 2749, 2751, 2740, 2734, 2809, 2779, 2766, 2781, 2776, 2776, 2773, 2715, 2689, 2714, 2692, 2708, 2716, 2808, 2781, 2778, 2753, 2764, 2703, 2708, 2805, 2778, 2768, 2758, 2779, 2781, 2768, 2708, 2693, 2693, 2703, 2708, 2788, 2781, 2764, 2769, 2776, 2708, 2689, 2717, 2708, 2805, 2756, 2756, 2776, 2769, 2787, 2769, 2774, 2815, 2781, 2752, 2715, 2689, 2695, 2691, 2714, 2695, 2690, 2708, 2716, 2815, 2812, 2784, 2809, 2808, 2712, 2708, 2776, 2781, 2783, 2769, 2708, 2803, 2769, 2775, 2783, 2779, 2717, 2708, 2807, 2780, 2758, 2779, 2777, 2769, 2715, 2701, 2692, 2714, 2692, 2714, 2688, 2688, 2695, 2692, 2714, 2701, 2693, 2708, 2809, 2779, 2774, 2781, 2776, 2769, 2708, 2791, 2773, 2770, 2773, 2758, 2781, 2715, 2689, 2695, 2691, 2714, 2695, 2690, 2118, 2153, 2155, 2172, 2175, 2172, 2155, 2172, 2167, 2170, 2172, 2154, 2161, 2171, 548, 549, 567, 604, 585, 3195, 1020, 1013, 1014, 1015, 1020, 1707, 1711, 1711, 1700, 1711, 1676, 1703, 1704, 1700, 1665, 1677, 1687, 1678, 1677, 1679, 1697, 1759, 1681, 1750, 1700, 1703, 1719, 1699, 1696, 1703, 1703, 1705, 1701, 1703, 1719, 1758, 1703, 1707, 1711, 1711, 1700, 1701, 1665, 1709, 1701, 1703, 1719, 1699, 1703, 1686, 1680, 1682, 1749, 1695, 1726, 1694, 1715, 1681, 1744, 1726, 1694, 1683, 1684, 1714, 1747, 1669, 1715, 1701, 1751, 1694, 1715, 1698, 1707, 1676, 1675, 1678, 1678, 1758, 1680, 1685, 1666, 1715, 1745, 1687, 1747, 1684, 1717, 1748, 1680, 1759, 1704, 1692, 1704, 1705, 1759, 1682, 1758, 1673, 1673, 1751, 1713, 1681, 1694, 1710, 1748, 1718, 1709, 1676, 1684, 1745, 1751, 1747, 1746, 1681, 1726, 1745, 1713, 1744, 1665, 1749, 1685, 1692, 1718, 1666, 1705, 1695, 1684, 1746, 1746, 1717, 1664, 1664, 1709, 1714, 1741, 1719, 1714, 1664, 1664, 1667, 1673, 1676, 1745, 1708, 1751, 1679, 1676, 1737, 1667, 1695, 1665, 1741, 1749, 1705, 1664, 1716, 1684, 1680, 1745, 1759, 1695, 1716, 1724, 1667, 1737, 1669, 1697, 1705, 1665, 1746, 1716, 1711, 1750, 1669, 1741, 1718, 1744, 1726, 1727, 1667, 1664, 1667, 1674, 1676, 1698, 1744, 1710, 1703, 1748, 1741, 1703, 1713, 1685, 1667, 1708, 1717, 1672, 1679, 1696, 1718, 1712, 1704, 1707, 1750, 1676, 1680, 1759, 1695, 1698, 1726, 1680, 1717, 1687, 1750, 1667, 1697, 1713, 1747, 1676, 1701, 1750, 1713, 1668, 1758, 1678, 1699, 1706, 1727, 1695, 1717, 1706, 1707, 1709, 1719, 1666, 1707, 1684, 1676, 1710, 1705, 1705, 1715, 1667, 1758, 1746, 1696, 1673, 1706, 1745, 1680, 1669, 1667, 1698, 1692, 1710, 1667, 1717, 1706, 1679, 1717, 1679, 1681, 1676, 1758, 1665, 1694, 1709, 1684, 1750, 1674, 1685, 1741, 1718, 1746, 1714, 1715, 1714, 1759, 1717, 1745, 1682, 1686, 1687, 1717, 1683, 1749, 1701, 1712, 1708, 1687, 1724, 1709, 1683, 1671, 1713, 1696, 1672, 1682, 1678, 1686, 1724, 1666, 1718, 1699, 1706, 1698, 1737, 1719, 1710, 1664, 1726, 1671, 1716, 1684, 1698, 1699, 1703, 1667, 1727, 1714, 1714, 1747, 1666, 1697, 1682, 1718, 1672, 1759, 1749, 1715, 1699, 1758, 1681, 1685, 1715, 1705, 1717, 1747, 1669, 1667, 1727, 1678, 1708, 1685, 1716, 1719, 1681, 1692, 1748, 1668, 1667, 1687, 1680, 1741, 1726, 1708, 1700, 1737, 1706, 1703, 1669, 1718, 1682, 1741, 1684, 1741, 1707, 1708, 1683, 1751, 1703, 1748, 1758, 1750, 1677, 1745, 1714, 1749, 1758, 1678, 1682, 1726, 1683, 1676, 1741, 1701, 1713, 1759, 1695, 1675, 1719, 1711, 1698, 1703, 1719, 1703, 1700, 1381, 1380, 1398, 2097, 2096, 2082, 2124, 2086, 2080, 2081, 2124, 2099, 2088, 2080, 2096, 2130, 2099, 2050, 2055, 2055, 
    2058, 2061, 2052, 964, 996, 2153, 2157, 2171, 2040, 2044, 2026, 1942, 2042, 2043, 2042, 1942, 2025, 2034, 2042, 2026, 1932, 2025, 2008, 2013, 2013, 2000, 2007, 2014, 24933, 18964, 24027, 24005, 22765, 1240, 1218, 24849, 19040, 23983, 23985, 22681, -30445, -29871, 1206, -1033, 23547, 23856, 27390, 28925, 1237, 1237, 1237, 27016, 29579, 23553, 26013, -1908, 24503, -31242, 26153, -862, 31915, 22752, 23681, 24045, -29690, 20872, -27216, 21380, 916, 24138, 28093, 30654, 26386, 32017, 20518, -31694, -2533, -32032, 25047, 28402, 28244, -24761, 27393, 27792, 18401, 20526, 31649, 26902, 14613, 25557, 18596, 24427, 24437, 23133, 24952, -29737, -30315, -28582, 22126, -1698, 25522, -28334, 26711, 29268, 13904, 26917, 20920, 31910, -30771, 21926, 17455, 20858, 23818, 26676, 17455, 27661, 17442, 17416, 28581, 17620, 21275, 14880, 462, 449, 459, 477, 448, 454, 459, 385, 454, 449, 475, 458, 449, 475, 385, 462, 460, 475, 454, 448, 449, 385, 505, 486, 490, 504, 2919, 2873, 2875, 2854, 2879, 2848, 2861, 2860, 2875, 736, 711, 719, 714, 707, 706, 646, 722, 713, 646, 726, 711, 724, 725, 707, 646, 711, 712, 706, 724, 713, 719, 706, 648, 725, 723, 726, 726, 713, 724, 722, 648, 736, 751, 746, 739, 761, 758, 756, 745, 752, 751, 738, 739, 756, 761, 758, 743, 754, 750, 757, 646, 715, 707, 722, 711, 651, 706, 711, 722, 711, 427, 396, 388, 385, 392, 393, 461, 409, 386, 461, 413, 396, 415, 414, 392, 461, 396, 387, 393, 415, 386, 388, 393, 451, 414, 408, 413, 413, 386, 415, 409, 451, 427, 420, 417, 424, 434, 445, 447, 418, 443, 420, 425, 424, 447, 434, 445, 428, 441, 421, 446, 461, 384, 392, 409, 396, 448, 393, 396, 409, 396, 989, 412, 400, 401, 395, 410, 401, 395, 656, 661, 656, 1346, 1381, 1389, 1384, 1377, 1376, 1316, 1392, 1387, 1316, 1378, 1389, 1386, 1376, 1316, 1383, 1387, 1386, 1378, 1389, 1379, 1393, 1398, 1377, 1376, 1316, 1398, 1387, 1387, 1392, 1316, 1392, 1388, 1381, 1392, 1316, 1383, 1387, 1386, 1392, 1381, 1389, 1386, 1399, 1316, 2008, 2047, 2039, 2034, 2043, 2042, 1982, 2026, 2033, 1982, 2028, 2043, 2029, 2033, 2034, 2024, 2043, 1982, 2045, 2047, 2032, 2033, 2032, 2039, 2045, 2047, 2034, 1982, 2030, 2047, 2026, 2038, 1982, 2040, 2033, 2028, 1982, 1618, 1662, 1663, 1637, 1652, 1663, 1637, 1596, 1605, 1640, 1633, 1652, 1345, 1389, 1388, 1398, 1383, 1388, 1398, 1327, 1350, 1387, 1393, 1394, 1389, 1393, 1387, 1398, 1387, 1389, 1388, 2616, 2617, 2603, 2624, 2645};
    public static volatile C0163u a = new C0163u(5);

    public static File A(String str) {
        String strM8125 = str;
        String strM4740 = C0024.m4740(m8514(), 0, 1, 447);
        if (!C0043.m7277(strM8125, strM4740)) {
            strM8125 = C0050.m8125(strM4740, strM8125);
        }
        StringBuilder sb = new StringBuilder();
        C0016.m3605(sb, C0049.m7985());
        File file = new File(C0028.m5188(sb, C0011.m2748(), C0013.m3106(m8514(), 1, 4, 2051)));
        if (!C0028.m5187(file)) {
            C0045.m7616(file);
        }
        return new File(file, strM8125);
    }

    public static void B(File file, File file2) {
        try {
            if (!C0028.m5187(file2)) {
                C0045.m7616(file2);
            }
            ZipFile zipFile = new ZipFile(C0022.m4399(file));
            try {
                Enumeration enumerationM7723 = C0046.m7723(zipFile);
                while (C0034.m6038(enumerationM7723)) {
                    ZipEntry zipEntry = (ZipEntry) C0033.m5838(enumerationM7723);
                    File file3 = new File(file2, C0027.m5098(zipEntry));
                    if (C0039.m6495(zipEntry)) {
                        C0045.m7616(file3);
                    } else {
                        File fileM5255 = C0029.m5255(file3);
                        if (fileM5255 != null && !C0028.m5187(fileM5255)) {
                            C0045.m7616(fileM5255);
                        }
                        InputStream inputStreamM3669 = C0017.m3669(zipFile, zipEntry);
                        try {
                            byte[] bArr = new byte[8192];
                            C0006.m1725(file3);
                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                            while (true) {
                                int iM9318 = C0060.m9318(inputStreamM3669, bArr);
                                if (iM9318 == -1) {
                                    break;
                                } else {
                                    C0034.m6047(fileOutputStream, bArr, 0, iM9318);
                                }
                            }
                            C0023.m4573(fileOutputStream);
                            C0008.m1955(inputStreamM3669);
                        } catch (Exception unused) {
                        }
                    }
                }
                C0037.m6303(zipFile);
            } catch (Throwable th) {
                try {
                    C0037.m6303(zipFile);
                } catch (Throwable th2) {
                    try {
                        C0052.m8352(C0057.m8970(Throwable.class, C0036.m6188(m8514(), 5, 13, 3273), new Class[]{Throwable.class}), th, new Object[]{th2});
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            C0049.m7975(e);
        }
    }

    public static void C(String str, File file) {
        byte[] bArrM8115 = C0050.m8115(str);
        try {
            C0006.m1725(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            C0016.m3527(fileOutputStream, bArrM8115);
            C0065.m9744(fileOutputStream);
            C0023.m4573(fileOutputStream);
        } catch (Exception e) {
            C0049.m7975(e);
            C0043.m7366(e, new StringBuilder(C0016.m3525(m8514(), 18, 7, 2507)));
        }
    }

    public static String a(String str, String str2, String str3) {
        try {
            byte[] bArrM5997 = C0034.m5997(str, 0);
            Cipher cipherM4284 = C0020.m4284(C0046.m7718(m8514(), 25, 20, 2873));
            C0058.m9088(cipherM4284, 2, new SecretKeySpec(C0050.m8115(str2), C0054.m8574(m8514(), 45, 3, 2834)), new IvParameterSpec(C0050.m8115(str3)));
            return new String(C0010.m2335(cipherM4284, bArrM5997), C0034.m6001(m8514(), 48, 5, 863));
        } catch (Exception e) {
            C0049.m7975(e);
            return null;
        }
    }

    public static String b(String str, HashMap map) {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0051.m8217());
        C0018.m3933(sb, C0003.m1398(m8514(), 53, 14, 2893));
        C0018.m3933(sb, C0050.m8153(C0012.m3018(str, C0002.m1270())));
        C0018.m3933(sb, C0040.m6584(m8514(), 67, 8, 3070));
        C0018.m3933(sb, C0050.m8153(C0012.m3018(m8507(new Gson(), map), C0002.m1270())));
        return C0047.m7763(sb);
    }

    public static long c(File file) {
        File[] fileArrM1265 = C0002.m1265(file);
        long jM7709 = 0;
        if (fileArrM1265 != null) {
            for (File file2 : fileArrM1265) {
                jM7709 = (C0032.m5709(file2) ? C0046.m7709(file2) : C0030.m5400(file2)) + jM7709;
            }
        }
        return jM7709;
    }

    public static boolean d(File file) {
        File[] fileArrM1265 = C0002.m1265(file);
        if (fileArrM1265 == null) {
            return true;
        }
        for (File file2 : fileArrM1265) {
            if (C0032.m5777(file2) && !C0019.m4117(file2)) {
                return false;
            }
            if (!C0046.m7663(file2)) {
                PrintStream printStreamM6087 = C0035.m6087();
                StringBuilder sb = new StringBuilder(C0019.m4107(m8514(), 75, 8, 2702));
                C0018.m3933(sb, C0022.m4399(file2));
                C0012.m2969(printStreamM6087, C0047.m7763(sb));
                return false;
            }
        }
        return true;
    }

    public static File e(File file) {
        String strM5852;
        int iM6197;
        String strM4740 = C0024.m4740(m8514(), 83, 10, 798);
        try {
            if (!C0052.m8284(file)) {
                C0026.m4880(file, true);
            }
            if (!C0028.m5187(file)) {
                C0033.m5816(file);
            }
            StringBuilder sb = new StringBuilder(strM4740);
            C0016.m3605(sb, file);
            String strM7763 = C0047.m7763(sb);
            strM5852 = C0033.m5852(m8514(), 93, 36, 1018);
            try {
                iM6197 = C0036.m6197(C0054.m8580(C0052.m8355(), strM7763));
            } catch (Exception e) {
                C0049.m7975(e);
            }
        } catch (Exception unused) {
        }
        if (iM6197 == 0) {
            return file;
        }
        StringBuilder sb2 = new StringBuilder(strM5852);
        C0036.m6177(sb2, iM6197);
        throw new RuntimeException(C0047.m7763(sb2));
    }

    public static String f(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(C0050.m8115(str2), C0013.m3106(m8514(), 129, 3, 2462));
            Cipher cipherM4284 = C0020.m4284(C0005.m1645(m8514(), 132, 20, 442));
            C0060.m9336(cipherM4284, 2, secretKeySpec);
            return new String(C0010.m2335(cipherM4284, C0007.m1882(str)));
        } catch (Exception unused) {
            return str;
        }
    }

    public static String g(String str, String str2, String str3, String str4) {
        String strM6779 = C0041.m6779(m8514(), 152, 5, 503);
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(C0021.m4347(str2, strM6779), C0025.m4795(m8514(), 157, 3, 2302));
            IvParameterSpec ivParameterSpec = new IvParameterSpec(C0043.m7354(str3));
            Cipher cipherM4284 = C0020.m4284(str4);
            if (C0048.m7937(new CharSequence[]{str3})) {
                C0060.m9336(cipherM4284, 2, secretKeySpec);
            } else {
                C0058.m9088(cipherM4284, 2, secretKeySpec, ivParameterSpec);
            }
            return new String(C0010.m2335(cipherM4284, C0007.m1882(str)), strM6779);
        } catch (Exception e) {
            C0049.m7975(e);
            return null;
        }
    }

    public static int h(int i) {
        return (int) C0037.m6364(1, i, C0007.m1852(C0002.m1335(C0031.m5652())));
    }

    public static String i(String str, String str2, String str3, String str4) {
        String strM6188 = C0036.m6188(m8514(), 160, 5, 1296);
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(C0021.m4347(str2, strM6188), C0037.m6307(m8514(), 165, 3, 3184));
            IvParameterSpec ivParameterSpec = new IvParameterSpec(C0043.m7354(str3));
            Cipher cipherM4284 = C0020.m4284(str4);
            if (C0048.m7937(new CharSequence[]{str3})) {
                C0060.m9336(cipherM4284, 1, secretKeySpec);
            } else {
                C0058.m9088(cipherM4284, 1, secretKeySpec, ivParameterSpec);
            }
            return C0024.m4719(C0010.m2335(cipherM4284, C0021.m4347(str, strM6188)));
        } catch (Exception e) {
            C0049.m7975(e);
            return null;
        }
    }

    public static String j(long j) {
        if (j < 1024) {
            StringBuilder sb = new StringBuilder();
            C0058.m9141(sb, j);
            C0018.m3933(sb, C0050.m8131(m8514(), 168, 2, 330));
            return C0047.m7763(sb);
        }
        double d = j;
        int iM9203 = (int) (C0059.m9203(d) / C0059.m9203(1024.0d));
        StringBuilder sb2 = new StringBuilder();
        C0062.m9399(sb2, C0007.m1823(C0032.m5708(m8514(), 170, 6, 535), iM9203 - 1));
        C0018.m3933(sb2, C0023.m4536(m8514(), 176, 1, 1382));
        String strM7763 = C0047.m7763(sb2);
        double dM8392 = C0053.m8392(1024.0d, iM9203);
        C0004.m1564(d);
        return C0002.m1327(C0062.m9389(m8514(), 177, 8, 2227), new Object[]{C0013.m3079(d / dM8392), strM7763});
    }

    public static Bitmap k(int i, String str) {
        try {
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            C0024.m4657(enumMap, m8512(), C0031.m5565(m8514(), 185, 5, 1218));
            C0024.m4657(enumMap, m8517(), C0011.m2808(2));
            BitMatrix bitMatrixM8503 = m8503(new MultiFormatWriter(), str, m8519(), i, i, enumMap);
            int iM8511 = m8511(bitMatrixM8503);
            int iM8513 = m8513(bitMatrixM8503);
            int[] iArr = new int[iM8511 * iM8513];
            for (int i2 = 0; i2 < iM8513; i2++) {
                int i3 = i2 * iM8511;
                for (int i4 = 0; i4 < iM8511; i4++) {
                    iArr[i3 + i4] = m8524(bitMatrixM8503, i4, i2) ? -16777216 : -1;
                }
            }
            Bitmap bitmapM7554 = C0045.m7554(iM8511, iM8513, C0052.m8383());
            C0018.m3926(bitmapM7554, iArr, 0, iM8511, 0, 0, iM8511, iM8513);
            return bitmapM7554;
        } catch (Exception e) {
            C0049.m7975(e);
            return null;
        }
    }

    public static boolean l(String str) {
        return C0042.m7178(C0009.m2038(), str, true);
    }

    public static boolean m(String str) {
        return C0042.m7178(C0009.m2038(), str, false);
    }

    public static String n(String str, HashMap map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) C0018.m3955(new URL(str));
            C0005.m1655(httpURLConnection, C0047.m7833(m8514(), 190, 3, 1830));
            Iterator itM5199 = C0029.m5199(C0043.m7267(map));
            while (C0012.m2962(itM5199)) {
                Map.Entry entry = (Map.Entry) C0048.m7949(itM5199);
                C0017.m3641(httpURLConnection, (String) C0045.m7624(entry), (String) C0039.m6540(entry));
            }
            if (C0057.m9038(httpURLConnection) == 200) {
                InputStream inputStreamM9040 = C0057.m9040(httpURLConnection);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int iM9318 = C0060.m9318(inputStreamM9040, bArr);
                    if (iM9318 == -1) {
                        byte[] bArrM4028 = C0019.m4028(byteArrayOutputStream);
                        C0008.m1955(inputStreamM9040);
                        C0038.m6427(byteArrayOutputStream);
                        return C0024.m4719(bArrM4028);
                    }
                    C0047.m7846(byteArrayOutputStream, bArr, 0, iM9318);
                }
            }
        } catch (Exception unused) {
        }
        return C0007.m1840();
    }

    public static int o(int i, String str) {
        return C0015.m3489(C0009.m2038(), str, i);
    }

    public static String p(String str) {
        boolean zM9349 = C0060.m9349(str, C0030.m5362(m8514(), 193, 4, 720));
        String strM2300 = C0010.m2300(m8514(), 197, 9, 2689);
        return zM9349 ? strM2300 : C0060.m9349(str, C0015.m3484(m8514(), 206, 5, 465)) ? C0003.m1398(m8514(), 211, 10, 2352) : C0060.m9349(str, C0024.m4740(m8514(), 221, 4, 932)) ? C0002.m1305(m8514(), 225, 15, 950) : C0060.m9349(str, C0041.m6779(m8514(), 240, 4, 2957)) ? C0044.m7509(m8514(), 244, 14, 1403) : C0060.m9349(str, C0029.m5256(m8514(), 258, 4, 2225)) ? C0047.m7833(m8514(), 262, 11, 2550) : C0060.m9349(str, C0030.m5362(m8514(), 273, 4, 869)) ? C0047.m7833(m8514(), 277, 15, 1238) : C0060.m9349(str, C0048.m7902(m8514(), 292, 4, 932)) ? C0032.m5708(m8514(), 296, 16, 2975) : C0060.m9349(str, C0054.m8574(m8514(), 312, 5, 1963)) ? C0041.m6779(m8514(), 317, 10, 2662) : C0060.m9349(str, C0015.m3484(m8514(), 327, 4, 2813)) ? C0000.m1077(m8514(), 331, 10, 3263) : C0060.m9349(str, C0007.m1842(m8514(), 341, 3, 1695)) ? C0006.m1774(m8514(), 344, 10, 612) : C0060.m9349(str, C0038.m6452(m8514(), 354, 4, 663)) ? C0007.m1842(m8514(), 358, 9, 1893) : C0060.m9349(str, C0063.m9585(m8514(), 367, 4, 2108)) ? C0050.m8131(m8514(), 371, 9, 3103) : C0060.m9349(str, C0040.m6584(m8514(), 380, 4, 2963)) ? C0058.m9106(m8514(), 384, 9, 2233) : strM2300;
    }

    public static String q(String str) {
        try {
            return m8526(m8505(m8525(m8502(new OkHttpClient(), m8523(m8522(m8515(m8520(new Request.Builder(), C0028.m5109(m8514(), 403, 30, 750)), m8510(m8518(C0049.m8007(m8514(), 393, 10, 2298)), str)), C0006.m1774(m8514(), 433, 10, 2778), C0007.m1842(m8514(), 443, 120, 2740)))))));
        } catch (IOException unused) {
            return null;
        }
    }

    public static SharedPreferences r() {
        Application applicationM5652 = C0031.m5652();
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0004.m1486(C0031.m5652()));
        C0018.m3933(sb, C0034.m6001(m8514(), 563, 14, 2073));
        return C0031.m5620(applicationM5652, C0047.m7763(sb), 0);
    }

    public static String s(String str, String str2) {
        return C0058.m9132(C0009.m2038(), str, str2);
    }

    public static byte[] t(String str) {
        int iM1584 = C0004.m1584(str);
        byte[] bArr = new byte[iM1584 / 2];
        for (int i = 0; i < iM1584; i += 2) {
            bArr[i / 2] = (byte) (C0019.m4036(C0007.m1823(str, i + 1), 16) + (C0019.m4036(C0007.m1823(str, i), 16) << 4));
        }
        return bArr;
    }

    public static String u(String str) {
        String strM1774 = C0006.m1774(m8514(), 577, 5, 625);
        String strM6001 = C0034.m6001(m8514(), 582, 1, 3161);
        String strM1840 = C0007.m1840();
        String[] strArrM1240 = C0002.m1240(C0015.m3446(str, strM6001, strM1840), C0024.m4740(m8514(), 583, 5, 964), 2);
        String str2 = strArrM1240[0];
        String str3 = strArrM1240.length > 1 ? strArrM1240[1] : strM1840;
        if (C0057.m8953(str3)) {
            return strM1840;
        }
        try {
            PublicKey publicKeyM2981 = C0012.m2981(C0022.m4426(C0005.m1645(m8514(), 980, 3, 1335)), new X509EncodedKeySpec(C0007.m1882(C0060.m9352(m8514(), 588, 392, 1766))));
            byte[] bArrM1882 = C0007.m1882(str3);
            Cipher cipherM4284 = C0020.m4284(C0043.m7290(m8514(), 983, 20, 2147));
            C0060.m9336(cipherM4284, 2, publicKeyM2981);
            String[] strArrM12402 = C0002.m1240(new String(C0010.m2335(cipherM4284, bArrM1882), strM1774), C0029.m5256(m8514(), 1003, 2, 920), 2);
            String str4 = strArrM12402[0];
            String str5 = strArrM12402[1];
            byte[] bArrM18822 = C0007.m1882(str2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(C0021.m4347(str4, strM1774), C0002.m1305(m8514(), 1005, 3, 2088));
            IvParameterSpec ivParameterSpec = new IvParameterSpec(C0021.m4347(str5, strM1774));
            Cipher cipherM42842 = C0020.m4284(C0000.m1077(m8514(), 1008, 20, 1977));
            C0058.m9088(cipherM42842, 2, secretKeySpec, ivParameterSpec);
            String str6 = new String(C0010.m2335(cipherM42842, bArrM18822), strM1774);
            C0012.m2969(C0035.m6087(), str6);
            return str6;
        } catch (Exception e) {
            C0049.m7975(e);
            return null;
        }
    }

    public static void v(File file) {
        String strM8978;
        if (!C0028.m5187(file) || !C0032.m5777(file)) {
            C0012.m2969(C0035.m6087(), C0018.m3917(m8514(), 1105, 17, 2594));
            return;
        }
        long jM5400 = C0030.m5400(file);
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb = new StringBuilder(C0035.m6131(m8514(), 1028, 7, 1250));
        C0018.m3933(sb, C0051.m8269(jM5400));
        C0012.m2969(printStreamM6087, C0047.m7763(sb));
        if (jM5400 > 52428800) {
            StringBuilder sb2 = new StringBuilder(C0013.m3106(m8514(), 1035, 8, 1174));
            C0018.m3933(sb2, C0051.m8269(52428800L));
            C0018.m3933(sb2, C0027.m5062(m8514(), 1043, 8, 1275));
            C0012.m2969(printStreamM6087, C0047.m7763(sb2));
            if (C0019.m4117(file)) {
                C0012.m2969(printStreamM6087, C0064.m9599(m8514(), 1051, 5, 1933));
                C0038.m6402(C0063.m9585(m8514(), 1056, 16, 952));
                return;
            }
            strM8978 = C0061.m9361(m8514(), 1072, 17, 2327);
        } else {
            strM8978 = C0057.m8978(m8514(), 1089, 16, 1618);
        }
        C0012.m2969(printStreamM6087, strM8978);
    }

    public static void w(File file) {
        C0306a c0306aM3437;
        Uri uriM7477;
        Intent intent = new Intent(C0019.m4107(m8514(), 1122, 26, 431));
        C0035.m6106(intent, 268435456);
        C0035.m6106(intent, 1);
        if (C0054.m8632() < 24) {
            uriM7477 = C0030.m5381(file);
        } else {
            Application applicationM5652 = C0031.m5652();
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0004.m1486(C0031.m5652()));
            C0018.m3933(sb, C0042.m7151(m8514(), 1148, 9, 2889));
            String strM7763 = C0047.m7763(sb);
            HashMap mapM9434 = C0062.m9434();
            synchronized (mapM9434) {
                try {
                    c0306aM3437 = (C0306a) C0065.m9715(mapM9434, strM7763);
                    if (c0306aM3437 == null) {
                        try {
                            try {
                                c0306aM3437 = C0015.m3437(applicationM5652, strM7763);
                                C0053.m8424(mapM9434, strM7763, c0306aM3437);
                            } catch (IOException e) {
                                throw new IllegalArgumentException(C0025.m4795(m8514(), 1218, 61, 493), e);
                            }
                        } catch (com.github.catvod.spider.merge.i1.b e2) {
                            throw new IllegalArgumentException(C0013.m3106(m8514(), 1157, 61, 678), e2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                String strM9760 = C0065.m9760(file);
                Iterator itM5199 = C0029.m5199(C0043.m7267(C0032.m5718(c0306aM3437)));
                Map.Entry entry = null;
                while (C0012.m2962(itM5199)) {
                    Map.Entry entry2 = (Map.Entry) C0048.m7949(itM5199);
                    String strM1154 = C0001.m1154((File) C0039.m6540(entry2));
                    if (C0043.m7277(strM9760, strM1154) && (entry == null || C0004.m1584(strM1154) > C0004.m1584(C0001.m1154((File) C0039.m6540(entry))))) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException(C0026.m4915(C0040.m6584(m8514(), 1290, 45, 1284), strM9760));
                }
                String strM11542 = C0001.m1154((File) C0039.m6540(entry));
                String strM6779 = C0041.m6779(m8514(), 1279, 1, 1010);
                String strM8890 = C0060.m9349(strM11542, strM6779) ? C0056.m8890(strM9760, C0004.m1584(strM11542)) : C0056.m8890(strM9760, C0004.m1584(strM11542) + 1);
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, C0037.m6333((String) C0045.m7624(entry)));
                C0062.m9399(sb2, '/');
                C0018.m3933(sb2, C0056.m8926(strM8890, strM6779));
                uriM7477 = C0044.m7477(C0045.m7539(C0049.m8000(C0033.m5785(new Uri.Builder(), C0008.m1970(m8514(), 1280, 7, 511)), C0051.m8213(c0306aM3437)), C0047.m7763(sb2)));
            } catch (IOException unused) {
                StringBuilder sb3 = new StringBuilder(C0009.m2037(m8514(), 1335, 37, 1950));
                C0016.m3605(sb3, file);
                throw new IllegalArgumentException(C0047.m7763(sb3));
            }
        }
        String strM4577 = C0023.m4577(C0038.m6412(file));
        if (C0043.m7327(strM4577)) {
            strM4577 = C0051.m8259(m8514(), 1287, 3, 698);
        }
        C0007.m1865(intent, uriM7477, strM4577);
        C0032.m5680(C0031.m5652(), intent);
    }

    public static Object[] x(String str, Map map) {
        Response responseM8506 = m8506(str, map);
        String strM8516 = m8516(m8504(responseM8506), C0057.m8978(m8514(), 1372, 12, 1553));
        String strM85162 = m8516(m8504(responseM8506), C0065.m9775(m8514(), 1384, 19, 1282));
        if (strM85162 != null) {
            strM8516 = C0041.m6752(strM85162);
        }
        HashMap map2 = new HashMap();
        Iterator itM5199 = C0029.m5199(m8509(m8504(responseM8506)));
        while (C0012.m2962(itM5199)) {
            String str2 = (String) C0048.m7949(itM5199);
            C0053.m8424(map2, str2, m8516(m8504(responseM8506), str2));
        }
        return new Object[]{C0011.m2808(m8508(responseM8506)), strM8516, m8521(m8505(responseM8506)), map2};
    }

    public static void y(Object obj, String str) {
        SharedPreferences.Editor editorM6653;
        if (obj == null) {
            return;
        }
        if (obj instanceof String) {
            editorM6653 = C0043.m7324(C0050.m8069(C0009.m2038()), str, (String) obj);
        } else if (obj instanceof Boolean) {
            editorM6653 = C0009.m2035(C0050.m8069(C0009.m2038()), str, C0010.m2318((Boolean) obj));
        } else if (obj instanceof Float) {
            editorM6653 = C0017.m3721(C0050.m8069(C0009.m2038()), str, C0037.m6370((Float) obj));
        } else if (obj instanceof Integer) {
            editorM6653 = C0054.m8635(C0050.m8069(C0009.m2038()), str, C0024.m4690((Integer) obj));
        } else if (!(obj instanceof Long)) {
            return;
        } else {
            editorM6653 = C0040.m6653(C0050.m8069(C0009.m2038()), str, C0031.m5649((Long) obj));
        }
        C0049.m7994(editorM6653);
    }

    public static String z(File file) {
        String strM1840 = C0007.m1840();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[C0003.m1469(fileInputStream)];
                C0060.m9318(fileInputStream, bArr);
                C0008.m1955(fileInputStream);
                return new String(bArr, C0012.m2973(m8514(), 1403, 5, 2669));
            } catch (IOException e) {
                C0049.m7975(e);
                return strM1840;
            }
        } catch (Exception unused) {
            return strM1840;
        }
    }

    /* renamed from: ۟۟ۧۧۤ, reason: not valid java name and contains not printable characters */
    public static Call m8502(Object obj, Object obj2) {
        if (C0054.m8557() <= 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۟۠ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static BitMatrix m8503(Object obj, Object obj2, Object obj3, int i, int i2, Object obj4) {
        if (C0011.m2755() >= 0) {
            return ((MultiFormatWriter) obj).encode((String) obj2, (BarcodeFormat) obj3, i, i2, (Map) obj4);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۡ۠, reason: not valid java name and contains not printable characters */
    public static Headers m8504(Object obj) {
        if (C0046.m7701() >= 0) {
            return ((Response) obj).headers();
        }
        return null;
    }

    /* renamed from: ۟ۢۤۦۨ, reason: not valid java name and contains not printable characters */
    public static ResponseBody m8505(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۟ۢۦ۠۠, reason: not valid java name and contains not printable characters */
    public static Response m8506(Object obj, Object obj2) {
        if (C0017.m3633() <= 0) {
            return com.github.catvod.spider.merge.Z.c.g((String) obj, (Map) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static String m8507(Object obj, Object obj2) {
        if (C0064.m9659() <= 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static int m8508(Object obj) {
        if (C0046.m7701() >= 0) {
            return ((Response) obj).code();
        }
        return 0;
    }

    /* renamed from: ۟ۤۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Set m8509(Object obj) {
        if (C0043.m7332() > 0) {
            return ((Headers) obj).names();
        }
        return null;
    }

    /* renamed from: ۟ۦۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static RequestBody m8510(Object obj, Object obj2) {
        if (C0057.m9017() >= 0) {
            return RequestBody.create((MediaType) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۥۣ۠, reason: not valid java name and contains not printable characters */
    public static int m8511(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((BitMatrix) obj).getWidth();
        }
        return 0;
    }

    /* renamed from: ۟ۧۥۧۥ, reason: not valid java name and contains not printable characters */
    public static EncodeHintType m8512() {
        if (C0057.m9017() > 0) {
            return EncodeHintType.CHARACTER_SET;
        }
        return null;
    }

    /* renamed from: ۡۢ۠, reason: not valid java name and contains not printable characters */
    public static int m8513(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((BitMatrix) obj).getHeight();
        }
        return 0;
    }

    /* renamed from: ۣۣۣۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8514() {
        if (C0051.m8216() < 0) {
            return f795short;
        }
        return null;
    }

    /* renamed from: ۣۡۤۨ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m8515(Object obj, Object obj2) {
        if (C0032.m5686() < 0) {
            return ((Request.Builder) obj).post((RequestBody) obj2);
        }
        return null;
    }

    /* renamed from: ۡۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m8516(Object obj, Object obj2) {
        if (C0021.m4379() >= 0) {
            return ((Headers) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۢۡ۠, reason: not valid java name and contains not printable characters */
    public static EncodeHintType m8517() {
        if (C0037.m6350() <= 0) {
            return EncodeHintType.MARGIN;
        }
        return null;
    }

    /* renamed from: ۣۣ۠۟, reason: not valid java name and contains not printable characters */
    public static MediaType m8518(Object obj) {
        if (C0061.m9359() <= 0) {
            return MediaType.parse((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۥۧۦ, reason: not valid java name and contains not printable characters */
    public static BarcodeFormat m8519() {
        if (C0019.m4065() < 0) {
            return BarcodeFormat.QR_CODE;
        }
        return null;
    }

    /* renamed from: ۣۦ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m8520(Object obj, Object obj2) {
        if (C0023.m4566() <= 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۤۥۦ۠, reason: not valid java name and contains not printable characters */
    public static InputStream m8521(Object obj) {
        if (C0046.m7701() >= 0) {
            return ((ResponseBody) obj).byteStream();
        }
        return null;
    }

    /* renamed from: ۥۦۡۨ, reason: contains not printable characters */
    public static Request.Builder m8522(Object obj, Object obj2, Object obj3) {
        if (C0048.m7971() > 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۦۥۧۨ, reason: contains not printable characters */
    public static Request m8523(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((Request.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۧ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8524(Object obj, int i, int i2) {
        if (C0036.m6252() > 0) {
            return ((BitMatrix) obj).get(i, i2);
        }
        return false;
    }

    /* renamed from: ۧۨۧ۟, reason: not valid java name and contains not printable characters */
    public static Response m8525(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۣۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m8526(Object obj) {
        if (C0055.m8740() > 0) {
            return ((ResponseBody) obj).string();
        }
        return null;
    }
}