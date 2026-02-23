package com.github.catvod.spider.merge.a1;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.V.C0031;
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
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
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
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f735short = {1832, 1849, 1849, 1829, 1824, 1834, 1832, 1853, 1824, 1830, 1831, 1894, 1841, 1892, 1854, 1854, 1854, 1892, 1839, 1830, 1851, 1828, 1892, 1852, 1851, 1829, 1836, 1831, 1834, 1830, 1837, 1836, 1837, 1519, 1481, 1503, 1480, 1431, 1531, 1501, 1503, 1492, 1486, 2517, 2551, 2530, 2545, 2548, 2548, 2553, 2487, 2477, 2486, 2472, 2488, 2480, 2511, 2545, 2550, 2556, 2551, 2543, 2539, 2488, 2518, 2508, 2488, 2473, 2472, 2486, 2472, 2467, 2488, 2511, 2545, 2550, 2478, 2476, 2467, 2488, 2528, 2478, 2476, 2481, 2488, 2521, 2536, 2536, 2548, 2557, 2511, 2557, 2554, 2515, 2545, 2540, 2487, 2477, 2475, 2479, 2486, 2475, 2478, 2488, 2480, 2515, 2512, 2508, 2517, 2516, 2484, 2488, 2548, 2545, 2547, 2557, 2488, 2527, 2557, 2555, 2547, 2551, 2481, 2488, 2523, 2544, 2538, 2551, 2549, 2557, 2487, 2465, 2464, 2486, 2472, 2486, 2476, 2479, 2477, 2464, 2486, 2473, 2475, 2465, 2488, 2507, 2553, 2558, 2553, 2538, 2545, 2487, 2477, 2475, 2479, 2486, 2475, 2478, 2022, 2043, 2016, 2030, 2016, 2023, 2618, 2598, 2598, 2594, 2593, 2664, 2685, 2685, 2616, 2602, 2684, 2602, 2623, 2612, 2622, 2596, 2684, 2609, 2621, 2623, 966, 989, 964, 964, 857, 798, 781, 794, 798, 834, 1392, 1388, 1388, 1384, 1387, 1314, 1335, 1335, 1404, 1401, 1388, 1401, 1334, 1390, 1393, 1404, 1405, 1399, 1334, 1393, 1385, 1393, 1377, 1393, 1334, 1403, 1399, 1397, 1335, 1390, 1334, 1406, 1324, 1390, 2270, 2791, 2798, 2719, 2577, 2604, 2573, 2604, 2591, 2618, 2662, 2572, 2602, 2583, 2573, 2574, 2608, 2609, 2609, 2621, 691, 695, 673, 2905, 2909, 2891, 2871, 2907, 2906, 2907, 2871, 2902, 2935, 2888, 2937, 2940, 2940, 2929, 2934, 2943, 2649, 2639, 2654, 2579, 2591, 2568, 2651, 2652, 2626, 2579, 1827, 1905, 1900, 1896, 1888, 1848, 343, 282, 276, 264, 332, 931, 1009, 1002, 1006, 992, 1003, 952, 753, 683, 729, 763, 723, 767, 767, 716, 680, 740, 719, 761, 741, 758, 747, 717, 2177, 2205, 2205, 2201, 2202, 2259, 2246, 2246, 2267, 2265, 2267, 2247, 2264, 2257, 2256, 2247, 2257, 2247, 2264, 2270, 2265, 2246, 2216, 2201, 2176, 2247, 2179, 2202, 1088, 1113, 969, 976, 980, 969, 973, 965, 1142, 1139, 1126, 1139, 2830, 2880, 2915, 2909, 2921, 2939, 2889, 2943, 2939, 2927, 2921, 2828, 2915, 2939, 2895, 2910, 1164, 1164, 1181, 1227, 1165, 1160, 1198, 1224, 1201, 1183, 1215, 1205, 1201, 1215, 1188, 1224, 2084, 2106, 2094, 1710, 1705, 1719, 2909, 2897, 2906, 2907, 2754, 2756, 2770, 2770, 2772, 2754, 2754, -29861, 25896, 24744, 20519, 2962, 2973, 2961, 2969, 481, 508, 487, 489, 487, 480, 2194, 2190, 2190, 2186, 2185, 2240, 2261, 2261, 2192, 2178, 2260, 2178, 2199, 2204, 2198, 2188, 2260, 2201, 2201, 1842, 1855, 1851, 1854, 1855, 1832, 598, 598, 593, 593, 1316, 1382, 1388, 1407, 1405, 668, 706, 644, 713, 2319, 2322, 2390, 26251, 21104, 29886, 385, 402, 401, 403, 385, -29614, -28979, -339, 21868, 24373, 29463, 24992, 31136, 411, 385, 3218, 3252, 3234, 3253, 3306, 3206, 3232, 3234, 3241, 3251, 671, 701, 680, 699, 702, 702, 691, 765, 743, 764, 738, 754, 762, 645, 699, 700, 694, 701, 677, 673, 754, 668, 646, 754, 739, 738, 764, 738, 745, 754, 645, 699, 700, 740, 742, 745, 754, 682, 740, 742, 763, 754, 659, 674, 674, 702, 695, 645, 695, 688, 665, 699, 678, 765, 743, 737, 741, 764, 737, 740, 754, 762, 665, 666, 646, 671, 670, 766, 754, 702, 699, 697, 695, 754, 661, 695, 689, 697, 701, 763, 754, 657, 698, 672, 701, 703, 695, 765, 739, 739, 741, 764, 738, 764, 738, 764, 738, 754, 641, 691, 692, 691, 672, 699, 765, 743, 737, 741, 764, 737, 740, 20856, 23329, 23681, 19028, 26074, -1361, 2229, 2230, 2234, 2232, 2221, 2224, 2230, 2231, 1220, 1217, 1217, 1270, 1232, 1237, 1237, 1239, 1216, 1238, 1238, 1216, 1217, 1728, 1672, 1754, 1688, 1088, 1101, 1038, 1104, 1099, 1090, 1101, 1092, 1099, 1090, 1098, 3298, 3326, 3326, 3322, 22574, -32145, 25008, -1221, 1145, 1132, 25179, -31524, -29246, 25521, 26161, 22206, 2423, 2356, 2410, 2348, 2401, 440, 420, 420, 416, 490, 511, 511, 481, 482, 487, 510, 480, 510, 480, 510, 481, 490, 489, 489, 489, 487, 511, 445, 483, 421, 488, 495, 421, 418, 444, 493, 1803, 1877, 1861, 1801, 1866, 1102, 1087, 1045, 1045, 1045, 1045, 1047, 1110, 1114, 1105, 1104, 1047, 1039, 1045, 1047, 1025, 1029, 1025, 1047, 1049, 1087, 1045, 1045, 1045, 1045, 1047, 1094, 1088, 1110, 1110, 1104, 1094, 1094, 1047, 1039, 1045, 1047, 1029, 1047, 1049, 1087, 1045, 1045, 1045, 1045, 1047, 1112, 1094, 1106, 1047, 1039, 1045, 1047, -29226, 25509, 23812, -30448, 1047, 1049, 1087, 1045, 1045, 1045, 1045, 1047, 1126, 1104, 1095, 1091, 1104, 1095, 1130, 1112, 1094, 1106, 1047, 1039, 1045, 1047, 2735, 2695, 2800, 3162, 3153, 3164, 3149, 3142, 3151, 3147, 3195, 3166, 3147, 3166, 3103, 3161, 3166, 3158, 3155, 3162, 3163, 855, 806, 780, 780, 780, 780, 782, 847, 835, 840, 841, 782, 790, 780, 782, 792, 796, 796, 782, 768, 806, 780, 780, 780, 780, 782, 863, 857, 847, 847, 841, 863, 863, 782, 790, 780, 782, 796, 782, 768, 806, 780, 780, 780, 780, 782, 833, 863, 843, 782, 790, 780, 782, 857, 862, 832, 19734, 31062, 782, 806, 849};

    public static String a(String str, String str2) {
        return m7205(m7216(m7199(m7214(new OkHttpClient(), m7204(m7208(m7208(m7206(m7211(new Request.Builder(), str), m7196(m7210(C0017.m3646(m7200(), 0, 33, 1865)), str2)), C0027.m5062(m7200(), 33, 10, 1466), C0025.m4795(m7200(), 43, 115, 2456)), C0016.m3525(m7200(), 158, 6, 1929), C0019.m4107(m7200(), 164, 20, 2642)))))));
    }

    public static String b(String str) {
        String strM7763;
        String strM4719;
        String strM1840 = C0007.m1840();
        if (str == null || C0007.m1815(str, C0046.m7718(m7200(), 184, 4, 936)) || C0057.m8953(str)) {
            return C0008.m1970(m7200(), 794, 61, 812);
        }
        String strM6188 = C0036.m6188(m7200(), 188, 6, 895);
        try {
            JSONObject jSONObject = new JSONObject(C0010.m2324(C0045.m7657(m7200(), 194, 34, 1304), C0054.m8599(11112)));
            StringBuilder sb = new StringBuilder(strM6188);
            C0018.m3933(sb, C0009.m2054(jSONObject, C0013.m3106(m7200(), 228, 1, 2218), strM1840));
            strM7763 = C0047.m7763(sb);
        } catch (Exception unused) {
            strM7763 = strM1840;
        }
        String strM5627 = C0031.m5627(C0009.m2099());
        try {
            byte[] bArrM6159 = C0035.m6159(C0015.m3410(C0049.m8007(m7200(), 229, 3, 2730)), C0050.m8115(C0065.m9804(strM5627, str)));
            StringBuilder sb2 = new StringBuilder();
            for (byte b : bArrM6159) {
                String strM8889 = C0056.m8889(b & 255);
                if (C0004.m1584(strM8889) == 1) {
                    C0062.m9399(sb2, '0');
                }
                C0018.m3933(sb2, strM8889);
            }
            String strM77632 = C0047.m7763(sb2);
            String strM8717 = C0055.m8717(strM77632);
            String strM3106 = C0013.m3106(m7200(), 232, 16, 2654);
            try {
                byte[] bArr = new byte[32];
                byte[] bArrM3018 = C0012.m3018(strM8717, C0034.m5989());
                C0062.m9384(bArrM3018, 0, bArr, 0, C0051.m8186(bArrM3018.length, 32));
                byte[] bArr2 = new byte[16];
                byte[] bArrM30182 = C0012.m3018(strM3106, C0034.m5989());
                C0062.m9384(bArrM30182, 0, bArr2, 0, C0051.m8186(bArrM30182.length, 16));
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, C0041.m6779(m7200(), 248, 3, 754));
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                Cipher cipherM4284 = C0020.m4284(C0058.m9106(m7200(), 251, 17, 2840));
                C0058.m9088(cipherM4284, 1, secretKeySpec, ivParameterSpec);
                strM4719 = C0024.m4719(C0010.m2335(cipherM4284, C0012.m3018(strM77632, C0034.m5989())));
            } catch (Exception e) {
                C0049.m7975(e);
                strM4719 = null;
            }
            StringBuilder sbM8368 = C0052.m8368(C0015.m3484(m7200(), 268, 10, 2606), str, C0064.m9599(m7200(), 278, 6, 1797), strM5627, C0005.m1645(m7200(), 284, 5, 369));
            C0018.m3933(sbM8368, C0056.m8909(strM4719));
            C0018.m3933(sbM8368, C0039.m6551(m7200(), 289, 7, 901));
            try {
                byte[] bArrM30183 = C0012.m3018(C0040.m6584(m7200(), 296, 16, 668), C0034.m5989());
                byte[] bArrM30184 = C0012.m3018(strM4719, C0034.m5989());
                int length = bArrM30184.length;
                double d = length + 1;
                C0004.m1564(d);
                int iM1140 = ((int) C0001.m1140(d / 16.0d)) * 16;
                byte[] bArr3 = new byte[iM1140];
                C0062.m9384(bArrM30184, 0, bArr3, 0, length);
                bArr3[length] = -128;
                byte[] bArr4 = new byte[iM1140];
                int length2 = bArrM30183.length;
                for (int i = 0; i < iM1140; i++) {
                    bArr4[i] = (byte) (bArr3[i] ^ bArrM30183[i % length2]);
                }
                C0018.m3933(sbM8368, C0024.m4719(bArr4));
                C0018.m3933(sbM8368, strM7763);
                JSONObject jSONObject2 = new JSONObject(C0010.m2324(C0033.m5852(m7200(), 312, 28, 2281), C0047.m7763(sbM8368)));
                String strM1549 = C0004.m1549(m7200(), 340, 2, 1065);
                String strM8200 = C0051.m8200(jSONObject2, strM1549);
                String strM8477 = C0053.m8477(m7200(), 342, 6, 928);
                String strM82002 = C0051.m8200(jSONObject2, strM8477);
                String strM7651 = C0045.m7651(C0051.m8200(jSONObject2, C0022.m4403(m7200(), 348, 4, 1042)), C0016.m3525(m7200(), 352, 16, 2874), C0035.m6131(m7200(), 368, 16, 1276));
                String strM1842 = C0007.m1842(m7200(), 384, 3, 2121);
                if (strM7651 == null || C0057.m8953(strM7651)) {
                    return C0000.m1130(C0005.m1645(m7200(), 694, 79, 1077), C0025.m4800(C0009.m2054(jSONObject2, strM1842, strM1840), C0015.m3484(m7200(), 689, 4, 1847), C0031.m5565(m7200(), 693, 1, 1898)), C0023.m4536(m7200(), 773, 3, 2701));
                }
                JsonObject jsonObjectM7213 = m7213(strM7651);
                String strM8131 = C0050.m8131(m7200(), 387, 3, 1755);
                String strM7207 = m7207(jsonObjectM7213, strM8131, strM1840);
                JSONObject jSONObject3 = new JSONObject();
                C0037.m6360(jSONObject3, C0013.m3106(m7200(), 390, 4, 2878), 200);
                C0037.m6360(jSONObject3, C0058.m9106(m7200(), 394, 7, 2737), 1);
                C0047.m7743(jSONObject3, strM1842, C0021.m4340(m7200(), 401, 4, 696));
                C0047.m7743(jSONObject3, strM1549, strM8200);
                C0047.m7743(jSONObject3, strM8477, strM82002);
                String strM6452 = C0038.m6452(m7200(), 405, 4, 3068);
                C0047.m7743(jSONObject3, strM6452, m7207(jsonObjectM7213, strM6452, strM1840));
                JSONObject jSONObject4 = new JSONObject();
                String strM7151 = C0042.m7151(m7200(), 409, 6, 398);
                String strM6131 = C0035.m6131(m7200(), 415, 19, 2298);
                C0047.m7743(jSONObject4, strM7151, strM6131);
                C0047.m7743(jSONObject3, C0043.m7290(m7200(), 434, 6, 1882), jSONObject4);
                HashMap map = new HashMap();
                C0053.m8424(map, strM7151, strM6131);
                String strM61312 = C0035.m6131(m7200(), 440, 4, 610);
                boolean zM9127 = C0058.m9127(strM7207, strM61312);
                String strM84772 = C0053.m8477(m7200(), 444, 5, 1291);
                if (zM9127 && C0058.m9127(strM7207, C0015.m3484(m7200(), 449, 4, 753)) && !C0058.m9127(strM7207, strM84772)) {
                    C0047.m7743(jSONObject3, strM8131, C0057.m9036(strM7207, map));
                } else {
                    if (!C0058.m9127(strM7207, strM61312) || (!C0058.m9127(strM7207, strM84772) && !C0058.m9127(strM7207, C0021.m4340(m7200(), 453, 3, 2402)))) {
                        if (!C0058.m9127(strM7207, C0035.m6131(m7200(), 622, 4, 1774)) && !C0058.m9127(strM7207, C0001.m1189(m7200(), 626, 11, 1059))) {
                            C0047.m7743(jSONObject3, strM8131, strM7207);
                        }
                        return C0004.m1539(jSONObject3);
                    }
                    String strM9389 = C0062.m9389(m7200(), 456, 18, 417);
                    try {
                        Response responseM7199 = m7199(m7214(m7215(m7209(m7202(new OkHttpClient.Builder(), false), false)), m7204(m7208(m7208(m7197(m7211(new Request.Builder(), strM7207)), C0004.m1549(m7200(), 474, 10, 3271), C0041.m6779(m7200(), 484, 111, 722)), strM7151, strM6131))));
                        try {
                            if (m7198(responseM7199) == 302) {
                                C0012.m2969(C0035.m6087(), C0061.m9361(m7200(), 595, 6, 1461));
                                String strM7201 = m7201(m7203(responseM7199), C0002.m1305(m7200(), 601, 8, 2265));
                                m7212(responseM7199);
                                strM1840 = strM7201;
                            } else {
                                PrintStream printStreamM6087 = C0035.m6087();
                                StringBuilder sb3 = new StringBuilder(strM9389);
                                C0036.m6177(sb3, m7198(responseM7199));
                                C0012.m2969(printStreamM6087, C0047.m7763(sb3));
                                m7212(responseM7199);
                            }
                        } catch (Throwable th) {
                            if (responseM7199 != null) {
                                try {
                                    m7212(responseM7199);
                                } catch (Throwable th2) {
                                    try {
                                        C0052.m8352(C0057.m8970(Throwable.class, C0015.m3484(m7200(), 609, 13, 1189), new Class[]{Throwable.class}), th, new Object[]{th2});
                                    } catch (Exception unused2) {
                                    }
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e2) {
                        C0049.m7975(e2);
                    }
                    C0047.m7743(jSONObject3, strM8131, strM1840);
                }
                if (C0058.m9127(strM7207, C0054.m8574(m7200(), 637, 4, 3210))) {
                    C0038.m6402(C0051.m8259(m7200(), 641, 12, 1057));
                }
                if (C0060.m9349(strM7207, C0053.m8477(m7200(), 653, 5, 2393))) {
                    C0047.m7743(jSONObject3, strM8131, C0050.m8125(C0040.m6584(m7200(), 658, 31, 464), strM7651));
                }
                return C0004.m1539(jSONObject3);
            } catch (Exception e3) {
                throw new RuntimeException(C0016.m3525(m7200(), 776, 18, 3135), e3);
            }
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: ۟۟ۥۦۡ, reason: not valid java name and contains not printable characters */
    public static RequestBody m7196(Object obj, Object obj2) {
        if (C0054.m8557() <= 0) {
            return RequestBody.create((MediaType) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟۠۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m7197(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((Request.Builder) obj).get();
        }
        return null;
    }

    /* renamed from: ۟ۡ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static int m7198(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((Response) obj).code();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Response m7199(Object obj) {
        if (C0017.m3633() < 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۟ۥۣۣۨ, reason: not valid java name and contains not printable characters */
    public static short[] m7200() {
        if (C0035.m6140() <= 0) {
            return f735short;
        }
        return null;
    }

    /* renamed from: ۟ۦۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m7201(Object obj, Object obj2) {
        if (C0018.m3956() >= 0) {
            return ((Headers) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m7202(Object obj, boolean z) {
        if (C0042.m7147() < 0) {
            return ((OkHttpClient.Builder) obj).followRedirects(z);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Headers m7203(Object obj) {
        if (C0037.m6350() < 0) {
            return ((Response) obj).headers();
        }
        return null;
    }

    /* renamed from: ۠ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static Request m7204(Object obj) {
        if (C0031.m5628() > 0) {
            return ((Request.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۣۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m7205(Object obj) {
        if (C0050.m8121() < 0) {
            return ((ResponseBody) obj).string();
        }
        return null;
    }

    /* renamed from: ۣۢۨۦ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m7206(Object obj, Object obj2) {
        if (C0008.m1975() >= 0) {
            return ((Request.Builder) obj).post((RequestBody) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣۣۤ, reason: not valid java name and contains not printable characters */
    public static String m7207(Object obj, Object obj2, Object obj3) {
        if (C0008.m1975() > 0) {
            return AbstractC0308c.f((JsonObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣۣۥ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m7208(Object obj, Object obj2, Object obj3) {
        if (C0043.m7332() > 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۤ۟۟۠, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m7209(Object obj, boolean z) {
        if (C0024.m4693() <= 0) {
            return ((OkHttpClient.Builder) obj).followSslRedirects(z);
        }
        return null;
    }

    /* renamed from: ۤۤۥ۠, reason: not valid java name and contains not printable characters */
    public static MediaType m7210(Object obj) {
        if (C0041.m6823() < 0) {
            return MediaType.parse((String) obj);
        }
        return null;
    }

    /* renamed from: ۤۧۢۧ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m7211(Object obj, Object obj2) {
        if (C0035.m6140() < 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۥ۠ۧ۠, reason: contains not printable characters */
    public static void m7212(Object obj) {
        if (C0046.m7701() > 0) {
            ((Response) obj).close();
        }
    }

    /* renamed from: ۧۢۥۣ, reason: not valid java name and contains not printable characters */
    public static JsonObject m7213(Object obj) {
        if (C0003.m1463() <= 0) {
            return AbstractC0308c.k((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۨۧ۟, reason: not valid java name and contains not printable characters */
    public static Call m7214(Object obj, Object obj2) {
        if (C0005.m1599() < 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۨۦۣۦ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient m7215(Object obj) {
        if (C0064.m9659() < 0) {
            return ((OkHttpClient.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۨۧۧ, reason: not valid java name and contains not printable characters */
    public static ResponseBody m7216(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((Response) obj).body();
        }
        return null;
    }
}