package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.github.catvod.spider.merge.P0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171c extends Format {
    public final B a;
    public final n b;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f478short = {2370, 2366, 2306, 2319, 2378, 3222, 3290, 3289, 3285, 3287, 3290, 3283, 3222, 3282, 3289, 3283, 3269, 3222, 3288, 3289, 3266, 3222, 3269, 3267, 3270, 3270, 3289, 3268, 3266, 3222, 3282, 3287, 3266, 3283, 3269, 3222, 3284, 3283, 3280, 3289, 3268, 3283, 3222, 3207, 3214, 3200, 3214, 3222, 3319, 3314, 3231, 3260, 3299, 3288, 3270, 3287, 3268, 3269, 3283, 3287, 3284, 3290, 3283, 3222, 3282, 3287, 3266, 3283, 3212, 3222, 3220, 2407, 2396, 2370, 2387, 2368, 2369, 2391, 2387, 2384, 2398, 2391, 2322, 2390, 2387, 2374, 2391, 2312, 2322, 1763, 1713, 1706, 1715, 1715, 1761, 461, 502, 499, 502, 503, 495, 502, 440, 507, 500, 505, 491, 491, 418, 440, 1104, 1143, 1125, 1122, 1106, 1143, 1122, 1139, 1104, 1145, 1124, 1147, 1143, 1122, 1101, 749, 2489};
    public static final C0170b c = new C0170b();

    public C0171c(String str, TimeZone timeZone, Locale locale) {
        this.a = new B(str, timeZone, locale);
        this.b = new n(str, timeZone, locale);
    }

    public static C0171c a(String str) {
        return (C0171c) C0053.m8405(C0024.m4745(), str, null);
    }

    /* renamed from: ۣۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m4634() {
        if (C0036.m6252() > 0) {
            return f478short;
        }
        return null;
    }

    public final Date b(String str) throws ParseException {
        n nVarM7898 = C0048.m7898(this);
        C0047.m7777(nVarM7898);
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateM4115 = C0019.m4115(nVarM7898, str, parsePosition);
        if (dateM4115 != null) {
            return dateM4115;
        }
        Locale localeM4656 = C0024.m4656();
        Locale localeM7584 = C0045.m7584(nVarM7898);
        if (!C0027.m5024(localeM7584, localeM4656)) {
            throw new ParseException(C0026.m4915(C0065.m9775(m4634(), 71, 18, 2354), str), C0014.m3376(parsePosition));
        }
        StringBuilder sb = new StringBuilder(C0012.m2973(m4634(), 0, 5, 2410));
        C0016.m3605(sb, localeM7584);
        C0018.m3933(sb, C0029.m5256(m4634(), 5, 66, 3254));
        C0018.m3933(sb, str);
        throw new ParseException(C0047.m7763(sb), C0014.m3376(parsePosition));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0171c) {
            return C0036.m6246(C0013.m3108(this), C0013.m3108((C0171c) obj));
        }
        return false;
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        String strM7763;
        B bM3108 = C0013.m3108(this);
        C0047.m7777(bM3108);
        boolean z = obj instanceof Date;
        int i = 0;
        Locale localeM6122 = C0035.m6122(bM3108);
        TimeZone timeZoneM7392 = C0044.m7392(bM3108);
        if (z) {
            Calendar calendarM5741 = C0032.m5741(timeZoneM7392, localeM6122);
            C0022.m4437(calendarM5741, (Date) obj);
            StringBuilder sb = new StringBuilder(C0008.m1977(bM3108));
            t[] tVarArrM2743 = C0011.m2743(bM3108);
            int length = tVarArrM2743.length;
            while (i < length) {
                C0010.m2283(tVarArrM2743[i], sb, calendarM5741);
                i++;
            }
            strM7763 = C0047.m7763(sb);
        } else if (obj instanceof Calendar) {
            Calendar calendar = (Calendar) obj;
            StringBuilder sb2 = new StringBuilder(C0008.m1977(bM3108));
            if (!C0058.m9103(C0014.m3298(calendar), timeZoneM7392)) {
                calendar = (Calendar) C0042.m7140(calendar);
                C0050.m8141(calendar, timeZoneM7392);
            }
            t[] tVarArrM27432 = C0011.m2743(bM3108);
            int length2 = tVarArrM27432.length;
            while (i < length2) {
                C0010.m2283(tVarArrM27432[i], sb2, calendar);
                i++;
            }
            strM7763 = C0047.m7763(sb2);
        } else {
            if (!(obj instanceof Long)) {
                throw new IllegalArgumentException(C0050.m8125(C0002.m1305(m4634(), 95, 15, 408), obj == null ? C0014.m3332(m4634(), 89, 6, 1759) : C0013.m3085(C0047.m7777(obj))));
            }
            long jM5649 = C0031.m5649((Long) obj);
            Calendar calendarM57412 = C0032.m5741(timeZoneM7392, localeM6122);
            C0020.m4288(calendarM57412, jM5649);
            StringBuilder sb3 = new StringBuilder(C0008.m1977(bM3108));
            t[] tVarArrM27433 = C0011.m2743(bM3108);
            int length3 = tVarArrM27433.length;
            while (i < length3) {
                C0010.m2283(tVarArrM27433[i], sb3, calendarM57412);
                i++;
            }
            strM7763 = C0047.m7763(sb3);
        }
        C0051.m8251(stringBuffer, strM7763);
        return stringBuffer;
    }

    public final int hashCode() {
        return C0028.m5132(C0013.m3108(this));
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        return C0019.m4115(C0048.m7898(this), str, parsePosition);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0049.m8007(m4634(), 110, 15, 1046));
        B bM3108 = C0013.m3108(this);
        C0018.m3933(sb, C0000.m1055(bM3108));
        String strM5565 = C0031.m5565(m4634(), 125, 1, 705);
        C0018.m3933(sb, strM5565);
        C0016.m3605(sb, C0035.m6122(bM3108));
        C0018.m3933(sb, strM5565);
        C0018.m3933(sb, C0057.m8967(C0044.m7392(bM3108)));
        C0018.m3933(sb, C0028.m5109(m4634(), 126, 1, 2532));
        return C0047.m7763(sb);
    }
}