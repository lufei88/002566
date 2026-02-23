package com.github.catvod.spider.merge.W;

import android.app.Activity;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0033;
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
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class s {
    public static WebView a;
    public static String b;
    public static boolean c;
    public static WebBackForwardList d;
    public static Process e;
    public static File f;
    public static File g;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f657short = {3172, 3196, 3172, 3175, 3185, 3131, 3172, 3196, 3172, 2428, 2404, 2428, 18336, -30985, 23322, 27819, 18394, 18209, 21108, 24068, -2528, 21809, -32007, 18215, -31151, 2326, 2316, 537, 545, 569, 538, 556, 571, 575, 556, 571, 1451, 1463, 1463, 1459, 1529, 1516, 1516, 1465, 1455, 1450, 1453, 1444, 1517, 1452, 1453, 1455, 1450, 1453, 1446, 1529, 1521, 1523, 1521, 1523, 1521, 1516, 1459, 1451, 1459, 1518, 1442, 1457, 1454, 1525, 1527, 1517, 1465, 1450, 1459, 2502, 2526, 2502, 18202, -31155, 23456, 27665, 18272, 18333, -30997, 20647, -31565, 27520, 18331, 21198, 24254, 2476, 2486, 25617, 27940, -30129, 32415, 417, 441, 417, 20349, -29142, 21447, 25718, 20231, 25494, -30275, 26290, -26719, 459, 465, 840, 880, 872, 843, 893, 874, 878, 893, 874, 567, 556, 545, 552, 552, 612, 551, 556, 553, 555, 544, 23413, -28831, 638, 612, 723, 728, 733, 735, 724, 656, 647, 647, 647, 656, 1229, 1222, 1219, 1217, 1226, 1166, 1177, 1179, 1179, 23967, -30325, 1172, 1166, 546, 553, 556, 558, 549, 609, 630, 628, 628, 609, 19738, 30541, 534, 512, 529, 544, 541, 512, 518, 528, 529, 516, 519, 521, 512, -30245, 32011, 25894, -27595, 24693, 20730, 18362, 32237, 2214, 2221, 2216, 2218, 2209, 2277, 2290, 2288, 2288, -31877, 30635, 28550, -24939, 27349, 23130, 1978, 2022, 2028, 2022, 2017, 2032, 2040, 1978, 2039, 2044, 2043, 1978, 2022, 2045, 3183, 1556, 1545, 1560, 1541, 1659, 19370, 29181, 1190, 1213, 1200, 1209, 1209, 1269, 1206, 1213, 1208, 1210, 1201, -28821, 31675, 25494, -28027, 26309, 22090, 24586, 25923, -30220, 32036, 25865, -27622, 26611, 28319, -27977, 23419, -28817, -32073, 30311, 28234, -24743, 27903, 23256, 31766, 22027, 22321, 644, 644, 644, 27972, 25713, 23231, 22110, 30709, 29309, 24733, 32330, 22513, 2206, 2180, 1192, 1168, 1160, 1195, 1181, 1162, 1166, 1181, 1162, 21562, 28420, 1078, 1070, 1078, 25451, 22215, 21006, 23895, -30397, 1116, 1094, 2449, 2441, 2449, 28364, 23392, 24489, 21555, 22941, 25251, 2848, 2872, 2848, 17916, -31573, 22854, 28407, 17798, 26577, 27769, 26903, -31940, 27699, -25312, 2890, 2896, 3159, 3152, 3162, 3163, 3142, 3088, 3150, 3158, 3150, 3317, 3318, 3257, 3233, 3257, 3305, 3244, 3242, 3233, 3238, 3305, 3307, 3225, 3201, 3225, 3305, 3226, 3244, 3259, 3263, 3244, 3259, 3305, 3232, 3258, 3305, 3259, 3260, 3239, 3239, 3232, 3239, 3246, 3305, 3238, 3239, 3305, 3208, 3239, 3245, 3259, 3238, 3232, 3245, 3304, 3307, 3314, 3305, 3318, 3319, 294, 291, 291, 276, 306, 311, 311, 309, 290, 308, 308, 290, 291, 1874, 1806, 1796, 1806, 1801, 1816, 1808, 1874, 1823, 1812, 1811, 1874, 1806, 1813, 3010, 3039, 3031, 3016, 3029, 3027, 2951, 3063, 3055, 3063, 3061, 3044, 2970, 1210, 1186, 1210, 1209, 1199, 1796, 2866, 2863, 2855, 2872, 2853, 2851, 2935, 2819, 2842, 2823, 2835, 2846, 2821, 2922, 1128, 1141, 1149, 1122, 1151, 1145, 1069, 1089, 1097, 1106, 1089, 1092, 1103, 1119, 1100, 1119, 1108, 1106, 1117, 1100, 1113, 1093, 1072, 460, 399, 394, 385, 400, 473, 460, 400, 410, 400, 407, 390, 398, 460, 399, 394, 385, 469, 471, 473, 460, 400, 410, 400, 407, 390, 398, 460, 399, 394, 385, 489, 1618, 1616, 1621, 1621, 1561, 1565, 1553, 1609, 1610, 1561, 1556, 1628, 1631, 1561, 1605, 1561, 1630, 1611, 1628, 1609, 1561, 1566, 1609, 1617, 1609, 1566, 1561, 1605, 1561, 1630, 1611, 1628, 1609, 1561, 1556, 1615, 1561, 1630, 1611, 1628, 1609, 1561, 1605, 1561, 1624, 1614, 1618, 1561, 1566, 1602, 1609, 1611, 1616, 1623, 1613, 1561, 1565, 1547, 1604, 1566, 1552, 1587, 271, 270, 265, 276, 273, 321, 324, 274, 321, 332, 306, 321, 337, 335, 337, 335, 337, 335, 337, 347, 324, 261, 321, 332, 277, 321, 324, 274, 321, 332, 261, 321, 260, 275, 275, 270, 275, 318, 275, 260, 273, 270, 275, 277, 264, 271, 262, 348, 292, 318, 288, 301, 301, 321, 332, 261, 321, 261, 264, 274, 273, 269, 256, 280, 318, 260, 275, 275, 270, 275, 274, 348, 302, 271, 321, 351, 321, 334, 274, 261, 258, 256, 275, 261, 334, 273, 265, 273, 318, 274, 260, 275, 279, 260, 275, 335, 269, 270, 262, 321, 339, 351, 327, 336, 321, 327, 2764, 2769, 2752, 2781, 2723, 2842, 2818, 2842, 17862, -31599, 22908, 28365, 17852, 17735, 20498, 23650, 2928, 2922};

    public static void a(WebView webView) {
        WebSettings webSettingsM8148 = C0050.m8148(webView);
        C0044.m7416(webSettingsM8148, true);
        C0042.m7175(webSettingsM8148, true);
        C0064.m9603(webSettingsM8148, true);
        C0019.m4050(webSettingsM8148, true);
        C0014.m3317(webSettingsM8148, true);
        C0057.m9025(webSettingsM8148, true);
        C0028.m5150(webSettingsM8148, false);
        C0037.m6309(webSettingsM8148, -1);
        int iM8632 = C0054.m8632();
        if (iM8632 >= 19) {
            C0027.m5086();
        }
        if (iM8632 >= 21) {
            C0024.m4654(webSettingsM8148);
            C0045.m7640(C0001.m1175(), webView);
        }
        C0037.m6361(webView, new l(2));
    }

    public static synchronized WebView b(Activity activity) {
        try {
            if (C0019.m4128() == null) {
                WebView webView = new WebView(C0035.m6101(activity));
                a = webView;
                if (!C0036.m6201()) {
                    C0060.m9343(webView);
                    c = true;
                }
                WebBackForwardList webBackForwardListM6155 = C0035.m6155();
                if (webBackForwardListM6155 != null) {
                    WebView webViewM4128 = C0019.m4128();
                    if (C0060.m9328(webBackForwardListM6155) != 0) {
                        String strM4540 = C0023.m4540(C0057.m8955(webBackForwardListM6155));
                        if (strM4540 != null && !C0057.m8953(strM4540)) {
                            C0048.m7899(webViewM4128, strM4540);
                        }
                        d = webBackForwardListM6155;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return C0019.m4128();
    }

    public static void c(Activity activity) {
        File file = new File(C0003.m1375(activity), C0040.m6584(m5944(), 0, 9, 3092));
        f = file;
        if (C0028.m5187(file) && C0020.m4245(C0019.m4062())) {
            return;
        }
        if (!C0028.m5187(C0019.m4062())) {
            StringBuilder sb = new StringBuilder(C0036.m6188(m5944(), 9, 18, 2348));
            C0018.m3933(sb, C0022.m4399(C0019.m4062()));
            C0047.m7763(sb);
            C0047.m7833(m5944(), 27, 9, 585);
            C0040.m6593(new Market(), C0003.m1398(m5944(), 36, 39, 1475));
            if (!C0028.m5187(C0019.m4062())) {
                StringBuilder sb2 = new StringBuilder(C0061.m9361(m5944(), 75, 18, 2454));
                C0018.m3933(sb2, C0022.m4399(C0019.m4062()));
                throw new IOException(C0047.m7763(sb2));
            }
        }
        if (C0045.m7561(C0019.m4062())) {
            return;
        }
        StringBuilder sb3 = new StringBuilder(C0027.m5062(m5944(), 93, 18, 497));
        C0018.m3933(sb3, C0022.m4399(C0019.m4062()));
        throw new IOException(C0047.m7763(sb3));
    }

    public static boolean d(File file) {
        Runtime runtimeM8355;
        StringBuilder sb;
        C0006.m1774(m5944(), 111, 9, 792);
        String strM1077 = C0000.m1077(m5944(), 120, 15, 580);
        String strM1842 = C0007.m1842(m5944(), 135, 10, 688);
        String strM8911 = C0056.m8911(m5944(), 145, 13, 1198);
        String strM4199 = C0020.m4199(m5944(), 158, 10, 577);
        try {
        } catch (Exception e2) {
            C0041.m6779(m5944(), 256, 9, 2313);
            return false;
        }
        if (C0060.m9293(file, true, false)) {
            C0038.m6452(m5944(), 168, 21, 613);
            return true;
        }
        try {
            runtimeM8355 = C0052.m8355();
            sb = new StringBuilder(strM4199);
            C0018.m3933(sb, C0022.m4399(file));
        } catch (Exception e3) {
            StringBuilder sb2 = new StringBuilder(strM8911);
            C0018.m3933(sb2, C0036.m6261(e3));
            C0047.m7763(sb2);
        }
        if (C0036.m6197(C0054.m8580(runtimeM8355, C0047.m7763(sb))) == 0 && C0020.m4245(file)) {
            C0049.m8007(m5944(), 189, 17, 2245);
            return true;
        }
        try {
            Process processM8580 = C0054.m8580(C0052.m8355(), C0007.m1842(m5944(), 206, 14, 1941));
            DataOutputStream dataOutputStream = new DataOutputStream(C0047.m7791(processM8580));
            StringBuilder sb3 = new StringBuilder(strM1842);
            C0018.m3933(sb3, C0022.m4399(file));
            C0018.m3933(sb3, C0014.m3332(m5944(), 220, 1, 3173));
            C0034.m6050(dataOutputStream, C0047.m7763(sb3));
            C0034.m6050(dataOutputStream, C0010.m2300(m5944(), 221, 5, 1649));
            C0033.m5896(dataOutputStream);
            C0027.m5049(dataOutputStream);
            if (C0036.m6197(processM8580) == 0 && C0020.m4245(file)) {
                C0039.m6551(m5944(), 226, 19, 1237);
                return true;
            }
        } catch (Exception e4) {
            StringBuilder sb4 = new StringBuilder(strM1077);
            C0018.m3933(sb4, C0036.m6261(e4));
            C0047.m7763(sb4);
        }
        C0046.m7718(m5944(), 245, 11, 586);
        return false;
        C0041.m6779(m5944(), 256, 9, 2313);
        return false;
    }

    public static void e(Activity activity, String str) {
        if (str == null || C0057.m8953(str)) {
            File file = new File(C0003.m1375(activity), C0029.m5256(m5944(), 265, 3, 755));
            g = file;
            if (!C0028.m5187(file)) {
                C0045.m7616(C0064.m9635());
            }
        } else {
            g = new File(str);
        }
        if (C0028.m5187(C0064.m9635()) || C0045.m7616(C0064.m9635())) {
            return;
        }
        StringBuilder sb = new StringBuilder(C0040.m6584(m5944(), 268, 11, 2212));
        C0018.m3933(sb, C0022.m4399(C0064.m9635()));
        throw new RuntimeException(C0047.m7763(sb));
    }

    public static void f() {
        int i = 0;
        C0050.m8082();
        C0006.m1774(m5944(), 279, 9, 1272);
        Process processM2983 = C0012.m2983();
        if (processM2983 != null) {
            C0042.m7139(processM2983);
            try {
                m5943(C0012.m2983(), C0050.m8151());
            } catch (InterruptedException e2) {
                StringBuilder sb = new StringBuilder(C0013.m3106(m5944(), 288, 12, 1126));
                C0018.m3933(sb, C0036.m6261(e2));
                C0047.m7763(sb);
            }
            e = null;
            C0054.m8574(m5944(), 300, 9, 2497);
        }
        if (!C0028.m5187(C0019.m4062())) {
            StringBuilder sb2 = new StringBuilder(C0043.m7290(m5944(), 672, 13, 2890));
            C0018.m3933(sb2, C0022.m4399(C0019.m4062()));
            throw new IOException(C0047.m7763(sb2));
        }
        if (!C0020.m4245(C0019.m4062()) && !C0045.m7561(C0019.m4062())) {
            StringBuilder sb3 = new StringBuilder(C0060.m9352(m5944(), 309, 16, 2928));
            C0018.m3933(sb3, C0022.m4399(C0019.m4062()));
            throw new IOException(C0047.m7763(sb3));
        }
        File file = new File(C0064.m9635(), C0015.m3484(m5944(), 325, 9, 3134));
        if (!C0028.m5187(file)) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                C0016.m3527(fileOutputStream, C0050.m8115(C0028.m5109(m5944(), 334, 50, 3273)));
                C0023.m4573(fileOutputStream);
            } catch (Throwable th) {
                try {
                    C0023.m4573(fileOutputStream);
                } catch (Throwable th2) {
                    try {
                        C0052.m8352(C0057.m8970(Throwable.class, C0052.m8337(m5944(), 384, 13, 327), new Class[]{Throwable.class}), th, new Object[]{th2});
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        }
        Process processM8580 = C0054.m8580(C0052.m8355(), C0040.m6584(m5944(), 397, 14, 1917));
        DataOutputStream dataOutputStream = new DataOutputStream(C0047.m7791(processM8580));
        StringBuilder sb4 = new StringBuilder(C0041.m6779(m5944(), 411, 13, 2983));
        File fileM1375 = C0003.m1375(C0022.m4453());
        String strM5852 = C0033.m5852(m5944(), 424, 5, 1226);
        C0018.m3933(sb4, C0022.m4399(new File(fileM1375, strM5852)));
        String strM9599 = C0064.m9599(m5944(), 429, 1, 1806);
        C0018.m3933(sb4, strM9599);
        C0034.m6050(dataOutputStream, C0047.m7763(sb4));
        StringBuilder sb5 = new StringBuilder(C0044.m7509(m5944(), 430, 14, 2903));
        C0018.m3933(sb5, C0022.m4399(C0043.m7309(C0022.m4453())));
        C0018.m3933(sb5, strM9599);
        C0034.m6050(dataOutputStream, C0047.m7763(sb5));
        StringBuilder sb6 = new StringBuilder(C0018.m3917(m5944(), 444, 23, 1037));
        C0018.m3933(sb6, C0022.m4399(new File(C0003.m1375(C0022.m4453()), strM5852)));
        C0018.m3933(sb6, C0006.m1774(m5944(), 467, 32, 483));
        C0034.m6050(dataOutputStream, C0047.m7763(sb6));
        C0033.m5896(dataOutputStream);
        C0034.m6050(dataOutputStream, C0062.m9389(m5944(), 499, 62, 1593));
        C0033.m5896(dataOutputStream);
        C0034.m6050(dataOutputStream, C0050.m8125(C0002.m1327(C0003.m1398(m5944(), 561, 106, 353), new Object[]{C0022.m4399(C0019.m4062()), C0011.m2808(9995), C0022.m4399(C0064.m9635())}), strM9599));
        C0033.m5896(dataOutputStream);
        C0034.m6050(dataOutputStream, C0028.m5109(m5944(), 667, 5, 2729));
        C0033.m5896(dataOutputStream);
        C0027.m5049(dataOutputStream);
        e = processM8580;
        C0024.m4682(new Thread(new com.github.catvod.spider.merge.D.g(i)));
    }

    /* renamed from: ۟۠ۦۡۧ, reason: not valid java name and contains not printable characters */
    public static void m5943(Object obj, Object obj2) {
        if (C0035.m6140() <= 0) {
            androidx.core.app.b.v((Process) obj, (TimeUnit) obj2);
        }
    }

    /* renamed from: ۦۣۣۢ, reason: contains not printable characters */
    public static short[] m5944() {
        if (C0004.m1557() < 0) {
            return f657short;
        }
        return null;
    }
}