package com.github.catvod.spider.merge.Z0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.google.gson.JsonObject;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f699short = {1827, 1828, 1850, 1072, 1070, 1082, 682, 678, 685, 684, 690, 696, 683, 681, 753, 700, 688, 690, 1009, 1019, 1000, 1002, 1014, 996, 2487, 2499, 2555, 2484, 2486, 2480, 2487, 2499, 2555, 2484, 2486, 449, 454, 472, 27048, 24219, -27507, -30085, 476, 448, 448, 452, 455, 398, 411, 411, 475, 448, 448, 410, 472, 477, 450, 465, 469, 452, 477, 410, 473, 467, 448, 450, 410, 471, 475, 473, 411, 450, 389, 411, 465, 452, 467, 385, 411, 467, 465, 448, 482, 475, 464, 484, 472, 469, 461, 481, 454, 472, 395, 452, 469, 454, 448, 491, 477, 464, 393, 1343, 1396, 1400, 1402, 1350, 1392, 1405, 1316, 1312, 1313, 1332, 1313, 1323, 1332, 1372, 1312, 1332, 1323, 1321, 1332, 1371, 1370, 1332, 1320, 1375, 1343, 1389, 1392, 1402, 1394, 1404, 1389, 1316, 1343, 1391, 1404, 1387, 1386, 1392, 1398, 1399, 1316, 1327, 1335, 1321, 1335, 1327, 1321, 1320, 1335, 1322, 1312, 1321, 1335, 1322, 1335, 1354, 1361, 1368, 1375, 1368, 1350, 1357, 1359, 1368, 1353, 1353, 1335, 1321, 1335, 1321, 1350, 1355, 1404, 1397, 1404, 1400, 1386, 1404, 1343, 1384, 1388, 1400, 1397, 1392, 1389, 1376, 1316, 1312, 1343, 1396, 1398, 1405, 1316, 1321, 1343, 1388, 1388, 1392, 1405, 1316, 1313, 1327, 1325, 1404, 1321, 1322, 1320, 1321, 1312, 1404, 1326, 1326, 1324, 1323, 1325, 1402, 1313, 1312, 1325, 1400, 1405, 1313, 1323, 1404, 1312, 1324, 1312, 1403, 1312, 1407, 1324, 1402, 1343, 1405, 1404, 1391, 1392, 1402, 1404, 1350, 1392, 1405, 1316, 1327, 1326, 1320, 1405, 1322, 1322, 1403, 1407, 1313, 1402, 1400, 1324, 1324, 1313, 1326, 1403, 1402, 1403, 1324, 1327, 1326, 1400, 1325, 1325, 1400, 1407, 1325, 1312, 1327, 1313, 1402, 1326, 1312, 1320, 1321, 1403, 1404, 1322, 1407, 1407, 1343, 1385, 1387, 1404, 1391, 1392, 1404, 1390, 1316, 1323, 1343, 1397, 1392, 1402, 1404, 1399, 1386, 1404, 1316, 1347, 1406, 1366, 1366, 1406, 1398, 1324, 1364, 1395, 1394, 1376, 1366, 1357, 1370, 1368, 1375, 1373, 1399, 1388, 1384, 1384, 1385, 1396, 1334, 1407, 1373, 1388, 1359, 1393, 1325, 1405, 1313, 1371, 1347, 1394, 1326, 1396, 1344, 1402, 1406, 1371, 1347, 1358, 1321, 1389, 1363, 1358, 1334, 1389, 1368, 1321, 1406, 1407, 1373, 1386, 1375, 1373, 1352, 1325, 1374, 1396, 1345, 1400, 1384, 1391, 1326, 1313, 1375, 1395, 1394, 1376, 1366, 1357, 1360, 1324, 1364, 1347, 1406, 1366, 1366, 1406, 1406, 1316, 1316, 1140, 1137, 1124, 1137, -32030, 27793, 26897, 22942, 1000, 1012, 1017, 993, 1021, 1002, 3077, 3160, 1180, 1169, 1176, 1165, 2061, 2131, 2069, 2136, 1964, 1969, 1973, 1981, -28873, 24900, 24549, -29711, 31600, 31485, -28714, 26723, 23331, 23065, 1051, 1025, 29681, 20698, 24329, 27067};

    public static String a(String str) {
        String strM9775;
        String strM3332 = C0014.m3332(m6713(), 0, 3, 1878);
        JSONObject jSONObject = new JSONObject();
        long jM2099 = C0009.m2099();
        String strM8007 = C0049.m8007(m6713(), 3, 3, 1117);
        String strM7718 = C0046.m7718(m6713(), 6, 4, 713);
        if (str != null && C0058.m9127(str, C0046.m7718(m6713(), 10, 8, 735)) && m6712(C0055.m8744(C0035.m6110()), C0021.m4340(m6713(), 18, 6, 924), true)) {
            Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0018.m3917(m6713(), 24, 11, 2463)), str);
            if (C0003.m1405(matcherM6026)) {
                C0021.m4306(matcherM6026, 1);
                try {
                    JSONObject jSONObjectM7123 = C0042.m7123(new JSONObject(C0032.m5769(C0000.m1130(C0060.m9352(m6713(), 42, 59, 436), C0021.m4306(matcherM6026, 2), C0045.m7657(m6713(), 101, 287, 1305)), null)), C0007.m1842(m6713(), 388, 4, 1040));
                    if (jSONObjectM7123 == null || !C0063.m9499(jSONObjectM7123, strM3332)) {
                        C0037.m6360(jSONObject, strM7718, 404);
                        C0047.m7743(jSONObject, strM8007, C0036.m6188(m6713(), 416, 4, 1748));
                    } else {
                        C0037.m6360(jSONObject, strM7718, 200);
                        C0047.m7743(jSONObject, strM8007, C0047.m7833(m6713(), 392, 4, 2817));
                        C0047.m7743(jSONObject, C0052.m8337(m6713(), 396, 6, 920), C0010.m2300(m6713(), 402, 2, 3181));
                        C0047.m7743(jSONObject, C0047.m7833(m6713(), 404, 4, 1256), C0057.m8978(m6713(), 408, 4, 2144));
                        C0047.m7743(jSONObject, strM3332, C0051.m8200(jSONObjectM7123, strM3332));
                        double dM2099 = C0009.m2099() - jM2099;
                        C0004.m1564(dM2099);
                        C0020.m4234(jSONObject, C0014.m3332(m6713(), 412, 4, 2008), dM2099 / 1000.0d);
                    }
                } catch (Exception e) {
                    C0037.m6360(jSONObject, strM7718, 500);
                    StringBuilder sb = new StringBuilder(C0039.m6551(m6713(), 420, 8, 1057));
                    C0018.m3933(sb, C0036.m6261(e));
                    C0047.m7743(jSONObject, strM8007, C0047.m7763(sb));
                }
                return C0004.m1539(jSONObject);
            }
            C0037.m6360(jSONObject, strM7718, 404);
            strM9775 = C0037.m6307(m6713(), 35, 7, 404);
        } else {
            C0037.m6360(jSONObject, strM7718, 201);
            strM9775 = C0065.m9775(m6713(), 428, 4, 3275);
        }
        C0047.m7743(jSONObject, strM8007, strM9775);
        return C0004.m1539(jSONObject);
    }

    /* renamed from: ۧۧۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6712(Object obj, Object obj2, boolean z) {
        if (C0000.m1116() <= 0) {
            return AbstractC0308c.a((JsonObject) obj, (String) obj2, z);
        }
        return false;
    }

    /* renamed from: ۣۧۧۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6713() {
        if (C0033.m5872() >= 0) {
            return f699short;
        }
        return null;
    }
}