package com.github.catvod.spider.merge.G;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f443short = {3149, 3075, 3090, 3083, 3149, 3090, 3095, 3072, 3086, 3083, 3073, 3149, 3089, 3079, 3094, 3094, 3083, 3084, 3077, 3089, 3121, 3189, 3177, 533, 563, 549, 562, 621, 513, 551, 549, 558, 564, 2793, 2763, 2782, 2765, 2760, 2760, 2757, 2699, 2705, 2698, 2708, 2692, 2700, 2803, 2765, 2762, 2752, 2763, 2771, 2775, 2692, 2794, 2800, 2692, 2709, 2708, 2698, 2708, 2719, 2692, 2803, 2765, 2762, 2706, 2704, 2719, 2692, 2780, 2706, 2704, 2701, 2692, 2789, 2772, 2772, 2760, 2753, 2803, 2753, 2758, 2799, 2765, 2768, 2699, 2705, 2711, 2707, 2698, 2711, 2706, 2692, 2700, 2799, 2796, 2800, 2793, 2792, 2696, 2692, 2760, 2765, 2767, 2753, 2692, 2787, 2753, 2759, 2767, 2763, 2701, 2692, 2791, 2764, 2774, 2763, 2761, 2753, 2699, 2709, 2710, 2710, 2698, 2708, 2698, 2708, 2698, 2708, 2692, 2807, 2757, 2754, 2757, 2774, 2765, 2699, 2705, 2711, 2707, 2698, 2711, 2706, 2788, 2768, 2769, 2765, 2762, 2775, 2764, 2783, 2756, 2769, 2764, 2762, 2763, 1984, 1436, 1426, 1422, 1408, 1432, 1413, 1427, 1412, 1830, 1847, 1841, 1843, 1717, 1700, 1719, 1696, 1707, 1713, 2857, 2876, 2859, 2822, 2857, 2872, 2878, 2876, 3160, 3158, 3146, 3140, 3164, 3137, 3159, 2924, 2941, 2920, 2932};

    @SerializedName("drives")
    private List<a> a;

    @SerializedName("params")
    private List<e> b;

    @SerializedName("login")
    private d c;

    @SerializedName("vodPic")
    private String d;

    @SerializedName("name")
    private String e;

    @SerializedName("server")
    private String f;

    @SerializedName("version")
    private int g;

    @SerializedName("path")
    private String h;

    @SerializedName("token")
    private String i;

    @SerializedName("search")
    private Boolean j;

    @SerializedName("hidden")
    private Boolean k;

    public a(String str) {
        this.e = str;
    }

    /* renamed from: ۟ۡ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static List m3991(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((a) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static d m3992(Object obj) {
        if (C0020.m4210() < 0) {
            return ((a) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۢۨۧۡ, reason: not valid java name and contains not printable characters */
    public static Boolean m3993(Object obj) {
        if (C0011.m2755() > 0) {
            return ((a) obj).j;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۣ۟, reason: not valid java name and contains not printable characters */
    public static List m3994(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((a) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۦۤۥۣ, reason: not valid java name and contains not printable characters */
    public static String m3995(Object obj) {
        if (C0018.m3956() > 0) {
            return ((a) obj).f;
        }
        return null;
    }

    /* renamed from: ۟ۦۥۨ۠, reason: not valid java name and contains not printable characters */
    public static short[] m3996() {
        if (C0052.m8320() >= 0) {
            return f443short;
        }
        return null;
    }

    /* renamed from: ۣۣۢۡ, reason: not valid java name and contains not printable characters */
    public static String m3997(Object obj, Object obj2) {
        if (C0051.m8216() <= 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    /* renamed from: ۣۥۧ۟, reason: not valid java name and contains not printable characters */
    public static String m3998(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((a) obj).h;
        }
        return null;
    }

    /* renamed from: ۤۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m3999(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((a) obj).e;
        }
        return null;
    }

    /* renamed from: ۥۤۤۦ, reason: contains not printable characters */
    public static String m4000(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((a) obj).d;
        }
        return null;
    }

    /* renamed from: ۧۡۨۦ, reason: not valid java name and contains not printable characters */
    public static String m4001(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((a) obj).i;
        }
        return null;
    }

    /* renamed from: ۧۦۢ۟, reason: not valid java name and contains not printable characters */
    public static int m4002(Object obj) {
        if (C0053.m8389() > 0) {
            return ((a) obj).g;
        }
        return 0;
    }

    /* renamed from: ۨۡۢۨ, reason: not valid java name and contains not printable characters */
    public static Boolean m4003(Object obj) {
        if (C0033.m5872() > 0) {
            return ((a) obj).k;
        }
        return null;
    }

    public final void a() {
        if (m3998(this) == null) {
            boolean zM7327 = C0043.m7327(m3995(this));
            String strM1840 = C0007.m1840();
            String strM4025 = C0019.m4025(C0022.m4422(zM7327 ? strM1840 : m3995(this)));
            if (!C0043.m7327(strM4025)) {
                strM1840 = strM4025;
            }
            this.h = strM1840;
        }
        if (m4002(this) == 0) {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0030.m5339(this));
            C0018.m3933(sb, C0052.m8337(m3996(), 0, 20, 3170));
            this.g = C0058.m9127(C0032.m5769(C0047.m7763(sb), null), C0002.m1305(m3996(), 20, 3, 3143)) ? 2 : 3;
        }
    }

    public final String b(String str) {
        Object objM3994 = m3994(this);
        if (objM3994 == null) {
            objM3994 = new ArrayList();
        }
        Iterator itM3109 = C0013.m3109(objM3994);
        while (C0012.m2962(itM3109)) {
            e eVar = (e) C0048.m7949(itM3109);
            if (C0043.m7277(str, C0011.m2773(eVar))) {
                return C0056.m8903(eVar);
            }
        }
        return C0007.m1840();
    }

    public final List c() {
        List listM3991 = m3991(this);
        return listM3991 == null ? new ArrayList() : listM3991;
    }

    public final HashMap d() {
        HashMap mapM4251 = C0020.m4251(C0001.m1189(m3996(), 23, 10, 576), C0040.m6584(m3996(), 33, 111, 2724));
        if (!C0057.m8953(C0043.m7327(m4001(this)) ? C0007.m1840() : m4001(this))) {
            C0053.m8424(mapM4251, C0032.m5708(m3996(), 144, 13, 2725), m4001(this));
        }
        return mapM4251;
    }

    public final String e() {
        boolean zM7327 = C0043.m7327(m3995(this));
        String strM1840 = C0007.m1840();
        return C0015.m3446(zM7327 ? strM1840 : m3995(this), C0000.m1104(this), strM1840);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return C0007.m1815(C0018.m3899(this), C0018.m3899((a) obj));
        }
        return false;
    }

    public final d f() {
        return m3992(this);
    }

    public final String g() {
        return C0043.m7327(m3999(this)) ? C0007.m1840() : m3999(this);
    }

    public final String h() {
        return C0043.m7327(m3998(this)) ? C0007.m1840() : m3998(this);
    }

    public final String i() {
        return C0043.m7327(m4000(this)) ? C0052.m8367() : m4000(this);
    }

    public final Boolean j() {
        Boolean boolM4003 = m4003(this);
        return C0028.m5186(boolM4003 != null && C0010.m2318(boolM4003));
    }

    public final boolean k() {
        return m4002(this) == 3;
    }

    public final String l(String str) {
        HashMap mapM4127;
        Gson gson;
        boolean zM7706 = C0046.m7706(this);
        String strM7718 = C0046.m7718(m3996(), 157, 1, 2031);
        if (zM7706) {
            mapM4127 = C0020.m4251(C0063.m9585(m3996(), 158, 8, 1527), str);
            C0053.m8424(mapM4127, C0011.m2805(m3996(), 166, 4, 1878), C0011.m2808(1));
            C0053.m8424(mapM4127, C0042.m7151(m3996(), 170, 6, 1733), strM7718);
            C0053.m8424(mapM4127, C0017.m3646(m3996(), 176, 8, 2905), C0011.m2808(100));
            gson = new Gson();
        } else {
            mapM4127 = C0019.m4127(C0041.m6779(m3996(), 184, 7, 3123), str, C0003.m1398(m3996(), 191, 4, 2844), strM7718);
            gson = new Gson();
        }
        return m3997(gson, mapM4127);
    }

    public final Boolean m() {
        Boolean boolM3993 = m3993(this);
        return C0028.m5186(boolM3993 == null || C0010.m2318(boolM3993));
    }

    public final void n(String str) {
        this.i = str;
    }
}