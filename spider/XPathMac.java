package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class XPathMac extends XPath {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f127short = {1779, 1780, 1791, 1748, 1780, 1787, 1748, 1670, 1781, 1666, 1687, 1765, 1737, 1739, 1784, 1732, 1737, 1745, 1741, 1754, 1771, 1735, 1734, 1742, 1729, 1743, 1670, 1752, 1732, 1737, 1745, 1741, 1754, 1783, 1732, 1729, 1755, 1756, 1779, 1780, 1791, 1748, 1780, 1787, 1748, 1670, 1781, 1666, 1687, 1685, 1664, 1779, 1780, 1791, 1748, 1780, 1787, 1748, 1670, 1781, 1666, 1687, 1665, 1668, 1765, 1737, 1739, 1784, 1732, 1737, 1745, 1741, 1754, 1771, 1735, 1734, 1742, 1729, 1743, 1670, 1740, 1735, 1759, 1734, 1741, 1754, 1783, 1732, 1729, 1755, 1756, 477, 474, 489, 469, 472, 448, 492, 459, 469, 1202, 1205, 1152, 1215, 1190, 1168, 1210, 1207, 1201, 1421, 1418, 1466, 1409, 1414, 1438, 1499, 1471, 1408, 1433, 3046, 3029, 3056, 3057, 3036, 3045, 1654, 1605, 1632, 1633, 1612, 1653, 1620, 404, 397, 390, 445, 402, 398, 387, 411, 445, 388, 400, 397, 399, 387, 390, 412, 411, 1237, 1197, 1237, 1197, 1237, 1197, 1611, 1611, 1611, 2829, 2838, 2833, 2825, 1830, 1837, 1824, 1841, 1850, 1843, 1847, 1418, 1409, 1437, 1424, 1416, 1444, 1411, 1437, 1420, 1386, 1389, 1395, 296, 312, 297, 306, 299, 303, 3250, 3237, 3254, 3300, 3252, 3240, 3237, 3261, 3233, 3254, 3227, 1538, 1555, 1536, 1537, 1559, 1654, 1636, 1221, 2986, 2983, 2979, 2982, 2983, 2992, 1410, 1438, 1427, 1419, 1447, 1408, 1438, 644, 674, 692, 675, 764, 656, 694, 692, 703, 677, 1139, 1092, 1095, 1092, 1107, 1092, 1107};
    public boolean c;
    public boolean d;
    public String e = C0007.m1840();
    public String f = C0009.m2037(m750(), 0, 91, 1704);
    public final HashMap g = new HashMap();

    /* renamed from: ۣۣ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static void m748(Object obj) {
        if (C0054.m8557() <= 0) {
            SpiderDebug.log((Throwable) obj);
        }
    }

    /* renamed from: ۣ۟ۦۧ۠, reason: not valid java name and contains not printable characters */
    public static String m749(Object obj, Object obj2) {
        if (C0062.m9429() > 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static short[] m750() {
        if (C0038.m6471() > 0) {
            return f127short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.XPath
    public final void d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.c = C0016.m3603(jSONObject, C0033.m5852(m750(), 91, 9, 441), false);
            this.d = C0016.m3603(jSONObject, C0022.m4403(m750(), 100, 9, 1238), false);
            JSONObject jSONObjectM7123 = C0042.m7123(jSONObject, C0028.m5109(m750(), 109, 10, 1513));
            if (jSONObjectM7123 != null) {
                Iterator itM7553 = C0045.m7553(jSONObjectM7123);
                while (C0012.m2962(itM7553)) {
                    String str2 = (String) C0048.m7949(itM7553);
                    C0053.m8424(C0039.m6530(this), C0064.m9640(str2), C0064.m9640(C0001.m1212(jSONObjectM7123, str2)));
                }
            }
            this.e = C0064.m9640(C0051.m8200(jSONObject, C0047.m7833(m750(), 119, 6, 2966)));
            this.f = C0064.m9640(C0009.m2054(jSONObject, C0065.m9775(m750(), 125, 7, 1542), C0027.m5035(this)));
        } catch (JSONException e) {
            m748(e);
        }
    }

    @Override // com.github.catvod.spider.XPath
    public String detailContent(List<String> list) {
        String strM3332 = C0014.m3332(m750(), 132, 13, 482);
        String strM4795 = C0025.m4795(m750(), 145, 4, 495);
        String strDetailContent = super.detailContent(list);
        if (!C0059.m9266(this) || C0004.m1584(strDetailContent) <= 0) {
            return strDetailContent;
        }
        try {
            JSONObject jSONObject = new JSONObject(strDetailContent);
            String[] strArrM4752 = C0024.m4752(C0051.m8200(C0018.m3923(C0008.m1964(jSONObject, strM4795), 0), strM3332), C0042.m7151(m750(), 149, 6, 1161));
            if (strArrM4752.length <= 0) {
                return strDetailContent;
            }
            for (int i = 0; i < strArrM4752.length; i++) {
                HashMap mapM6530 = C0039.m6530(this);
                if (C0058.m9098(mapM6530, strArrM4752[i])) {
                    strArrM4752[i] = (String) C0065.m9715(mapM6530, strArrM4752[i]);
                }
            }
            C0047.m7743(C0018.m3923(C0008.m1964(jSONObject, strM4795), 0), strM3332, C0006.m1702(C0019.m4107(m750(), 155, 3, 1647), strArrM4752));
            return C0004.m1539(jSONObject);
        } catch (Throwable th) {
            m748(th);
            return strDetailContent;
        }
    }

    @Override // com.github.catvod.spider.XPath
    public String homeContent(boolean z) {
        String strHomeContent = super.homeContent(z);
        if (C0004.m1584(strHomeContent) > 0 && C0004.m1584(C0023.m4549(this)) > 0) {
            Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0027.m5035(this)), C0060.m9356(this, C0023.m4549(this)));
            if (C0003.m1405(matcherM6026)) {
                try {
                    JSONObject jSONObject = new JSONObject(C0021.m4306(matcherM6026, 1));
                    Iterator itM7553 = C0045.m7553(jSONObject);
                    while (C0012.m2962(itM7553)) {
                        String str = (String) C0048.m7949(itM7553);
                        JSONObject jSONObjectM7123 = C0042.m7123(jSONObject, str);
                        if (jSONObjectM7123 != null) {
                            String strM9640 = C0064.m9640(C0051.m8200(jSONObjectM7123, C0065.m9775(m750(), 158, 4, 2942)));
                            if (!C0057.m8953(strM9640)) {
                                C0053.m8424(C0039.m6530(this), strM9640, str);
                            }
                        }
                    }
                } catch (Exception e) {
                    m748(e);
                }
            }
        }
        return strHomeContent;
    }

    @Override // com.github.catvod.spider.XPath
    public void init(Context context, String str) {
        super.init(context, str);
    }

    @Override // com.github.catvod.spider.XPath
    public String playerContent(String str, String str2, List<String> list) {
        String strM9421;
        String strM6188 = C0036.m6188(m750(), 162, 7, 1859);
        C0046.m7732(this);
        String strM3446 = C0057.m8953(C0008.m1999(C0064.m9621(this))) ? str2 : C0015.m3446(C0008.m1999(C0064.m9621(this)), C0033.m5852(m750(), 169, 9, 1521), str2);
        boolean zM7737 = C0046.m7737(this);
        String strM4795 = C0025.m4795(m750(), 178, 3, 1311);
        String str3 = null;
        if (zM7737) {
            try {
                d dVarM5333 = C0030.m5333(C0016.m3577(C0060.m9356(this, strM3446)), C0046.m7718(m750(), 181, 6, 347));
                int i = 0;
                while (true) {
                    if (i >= C0009.m2095(dVarM5333)) {
                        break;
                    }
                    String strM9640 = C0064.m9640(C0000.m1081((m) C0028.m5161(dVarM5333, i)));
                    if (C0043.m7277(strM9640, C0004.m1549(m750(), 187, 11, 3268))) {
                        JSONObject jSONObject = new JSONObject(C0054.m8636(strM9640, C0048.m7935(strM9640, 123), C0030.m5416(strM9640, 125) + 1));
                        String strM1212 = C0001.m1212(jSONObject, strM4795);
                        if (C0063.m9499(jSONObject, strM6188)) {
                            int iM7710 = C0046.m7710(jSONObject, strM6188);
                            if (iM7710 == 1) {
                                strM9421 = C0062.m9421(strM1212);
                            } else {
                                if (iM7710 == 2) {
                                    strM9421 = C0062.m9421(new String(C0034.m5997(strM1212, 0)));
                                }
                                str3 = strM1212;
                            }
                            str3 = strM9421;
                        } else {
                            str3 = strM1212;
                        }
                    } else {
                        i++;
                    }
                }
            } catch (Exception e) {
                m748(e);
            }
        }
        if (str3 != null) {
            boolean zM9266 = C0059.m9266(this);
            String strM5109 = C0028.m5109(m750(), 198, 5, 1650);
            try {
                if (zM9266 && C0003.m1402(str3)) {
                    JSONObject jSONObject2 = new JSONObject();
                    C0037.m6360(jSONObject2, strM5109, 1);
                    C0047.m7743(jSONObject2, C0033.m5852(m750(), 203, 2, 1564), C0045.m7657(m750(), 205, 1, 1268));
                    C0047.m7743(jSONObject2, strM4795, str3);
                    return C0004.m1539(jSONObject2);
                }
                boolean zM92662 = C0059.m9266(this);
                String strM1842 = C0007.m1842(m750(), 206, 6, 3010);
                String strM6551 = C0039.m6551(m750(), 212, 7, 1522);
                String strM1840 = C0007.m1840();
                if (zM92662 && C0021.m4355(list, str)) {
                    JSONObject jSONObject3 = new JSONObject();
                    C0037.m6360(jSONObject3, strM5109, 1);
                    C0047.m7743(jSONObject3, strM6551, strM1840);
                    C0047.m7743(jSONObject3, strM4795, str3);
                    C0047.m7743(jSONObject3, strM1842, strM1840);
                    return C0004.m1539(jSONObject3);
                }
                if (C0032.m5731(this, str3)) {
                    JSONObject jSONObject4 = new JSONObject();
                    C0037.m6360(jSONObject4, strM5109, 0);
                    C0047.m7743(jSONObject4, strM6551, strM1840);
                    C0047.m7743(jSONObject4, strM4795, str3);
                    HashMap map = new HashMap();
                    if (C0004.m1584(C0016.m3561(C0064.m9621(this))) > 0) {
                        C0053.m8424(map, C0062.m9389(m750(), 219, 10, 721), C0016.m3561(C0064.m9621(this)));
                    }
                    if (C0004.m1584(C0007.m1836(C0064.m9621(this))) > 0) {
                        C0053.m8424(map, C0052.m8337(m750(), 229, 7, 1057), C0007.m1836(C0064.m9621(this)));
                    }
                    C0047.m7743(jSONObject4, strM1842, m749(new Gson(), map));
                    return C0004.m1539(jSONObject4);
                }
            } catch (Exception e2) {
                m748(e2);
            }
        }
        return super.playerContent(str, str2, list);
    }
}