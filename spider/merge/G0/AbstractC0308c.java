package com.github.catvod.spider.merge.g0;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;

/* renamed from: com.github.catvod.spider.merge.g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0308c {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f793short = {563, 548, 630, 562, 581, 583, 616, 561, 564, 564, 565, 561, 575, 1626, 1577, 1631, 1627, 1631, 1610, 1577, 1631, 1626, 2019, 2042, 2022, 2023, 1961, 2041, 2024, 2043, 2042, 2028, 1961, 2028, 2043, 2043, 2022, 2043, 1971, 1961, 450, 488};

    static {
        C0005.m1602(C0021.m4340(m8495(), 0, 13, 539));
        C0026.m4930(C0054.m8574(m8495(), 13, 9, 1653), 32);
    }

    public static boolean a(JsonObject jsonObject, String str, boolean z) {
        JsonElement jsonElementM8494 = m8494(jsonObject, str);
        return (jsonElementM8494 == null || m8493(jsonElementM8494) || !m8488(jsonElementM8494) || !m8500(m8491(jsonElementM8494))) ? z : m8483(jsonElementM8494);
    }

    public static int b(int i, JsonObject jsonObject, String str) {
        JsonElement jsonElementM8494 = m8494(jsonObject, str);
        return (jsonElementM8494 == null || m8493(jsonElementM8494) || !m8488(jsonElementM8494) || !m8487(m8491(jsonElementM8494))) ? i : m8482(jsonElementM8494);
    }

    public static JsonArray c(JsonObject jsonObject, String str) {
        JsonElement jsonElementM8494 = m8494(jsonObject, str);
        return (jsonElementM8494 == null || m8493(jsonElementM8494) || !m8484(jsonElementM8494)) ? new JsonArray() : m8492(jsonElementM8494);
    }

    public static JsonObject d(JsonObject jsonObject, String str) {
        JsonElement jsonElementM8494 = m8494(jsonObject, str);
        return (jsonElementM8494 == null || m8493(jsonElementM8494) || !m8496(jsonElementM8494)) ? new JsonObject() : m8481(jsonElementM8494);
    }

    public static long e(JsonObject jsonObject, String str, long j) {
        JsonElement jsonElementM8494 = m8494(jsonObject, str);
        return (jsonElementM8494 == null || m8493(jsonElementM8494) || !m8488(jsonElementM8494) || !m8487(m8491(jsonElementM8494))) ? j : m8485(jsonElementM8494);
    }

    public static String f(JsonObject jsonObject, String str, String str2) {
        JsonElement jsonElementM8494 = m8494(jsonObject, str);
        return (jsonElementM8494 == null || m8493(jsonElementM8494) || !m8488(jsonElementM8494)) ? str2 : m8480(jsonElementM8494);
    }

    public static JsonElement g(String str) {
        try {
            return m8490(str);
        } catch (Throwable unused) {
            return m8499(new JsonParser(), str);
        }
    }

    public static Object h(String str, Type type) {
        try {
            return m8489(new Gson(), str, type);
        } catch (JsonSyntaxException e) {
            StringBuilder sb = new StringBuilder(C0014.m3332(m8495(), 22, 18, 1929));
            C0018.m3933(sb, C0036.m6261(e));
            C0018.m3933(sb, C0031.m5565(m8495(), 40, 2, 456));
            C0018.m3933(sb, str);
            m8497(C0047.m7763(sb));
            return null;
        }
    }

    public static JsonObject i(String str) {
        try {
            JsonObject jsonObjectM8481 = m8481(m8498(str));
            return jsonObjectM8481 == null ? new JsonObject() : jsonObjectM8481;
        } catch (Throwable unused) {
            return new JsonObject();
        }
    }

    public static String j(Object obj) {
        return m8486(new Gson(), obj);
    }

    public static JsonObject k(String str) {
        try {
            JsonElement jsonElementM8498 = m8498(str);
            return m8496(jsonElementM8498) ? m8481(jsonElementM8498) : new JsonObject();
        } catch (Exception unused) {
            return new JsonObject();
        }
    }

    /* renamed from: ۟۟ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static String m8480(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۟۠ۤۢۨ, reason: not valid java name and contains not printable characters */
    public static JsonObject m8481(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m8482(Object obj) {
        if (C0063.m9589() <= 0) {
            return ((JsonElement) obj).getAsInt();
        }
        return 0;
    }

    /* renamed from: ۟ۡۦۣۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8483(Object obj) {
        if (C0032.m5686() < 0) {
            return ((JsonElement) obj).getAsBoolean();
        }
        return false;
    }

    /* renamed from: ۟ۢۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8484(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((JsonElement) obj).isJsonArray();
        }
        return false;
    }

    /* renamed from: ۟ۢۥۨۨ, reason: not valid java name and contains not printable characters */
    public static long m8485(Object obj) {
        if (C0015.m3433() > 0) {
            return ((JsonElement) obj).getAsLong();
        }
        return 0L;
    }

    /* renamed from: ۣ۟ۢۨۢ, reason: not valid java name and contains not printable characters */
    public static String m8486(Object obj, Object obj2) {
        if (C0040.m6582() >= 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8487(Object obj) {
        if (C0016.m3596() < 0) {
            return ((JsonPrimitive) obj).isNumber();
        }
        return false;
    }

    /* renamed from: ۟ۤ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8488(Object obj) {
        if (C0064.m9659() < 0) {
            return ((JsonElement) obj).isJsonPrimitive();
        }
        return false;
    }

    /* renamed from: ۣۣ۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static Object m8489(Object obj, Object obj2, Object obj3) {
        if (C0006.m1726() <= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Type) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۤۦۧ۟, reason: not valid java name and contains not printable characters */
    public static JsonElement m8490(Object obj) {
        if (C0011.m2755() >= 0) {
            return JsonParser.parseString((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m8491(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((JsonElement) obj).getAsJsonPrimitive();
        }
        return null;
    }

    /* renamed from: ۟ۥۦۤۨ, reason: not valid java name and contains not printable characters */
    public static JsonArray m8492(Object obj) {
        if (C0063.m9589() < 0) {
            return ((JsonElement) obj).getAsJsonArray();
        }
        return null;
    }

    /* renamed from: ۟ۥۧۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8493(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((JsonElement) obj).isJsonNull();
        }
        return false;
    }

    /* renamed from: ۡ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static JsonElement m8494(Object obj, Object obj2) {
        if (C0021.m4379() > 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۢۧۧۦ, reason: not valid java name and contains not printable characters */
    public static short[] m8495() {
        if (C0062.m9429() > 0) {
            return f793short;
        }
        return null;
    }

    /* renamed from: ۤۤۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8496(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((JsonElement) obj).isJsonObject();
        }
        return false;
    }

    /* renamed from: ۥۡۡۢ, reason: contains not printable characters */
    public static void m8497(Object obj) {
        if (C0026.m4977() < 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۦۢۡ۠, reason: contains not printable characters */
    public static JsonElement m8498(Object obj) {
        if (C0027.m5017() >= 0) {
            return g((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۧۦۥ, reason: not valid java name and contains not printable characters */
    public static JsonElement m8499(Object obj, Object obj2) {
        if (C0059.m9257() < 0) {
            return ((JsonParser) obj).parse((String) obj2);
        }
        return null;
    }

    /* renamed from: ۧۤۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8500(Object obj) {
        if (C0040.m6582() > 0) {
            return ((JsonPrimitive) obj).isBoolean();
        }
        return false;
    }
}