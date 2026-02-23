package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import java.text.Format;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.github.catvod.spider.merge.P0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170b {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f477short = {2937, 2920, 2941, 2941, 2924, 2939, 2919};
    public final ConcurrentHashMap a = new ConcurrentHashMap(7);

    static {
        new ConcurrentHashMap(7);
    }

    /* renamed from: ۣ۟۠ۢۤ, reason: not valid java name and contains not printable characters */
    public static short[] m4633() {
        if (C0054.m8557() < 0) {
            return f477short;
        }
        return null;
    }

    public final Format a(String str, Locale locale) {
        C0056.m8946(str, new com.github.catvod.spider.merge.M0.f(C0003.m1398(m4633(), 0, 7, 2825), new Object[0]));
        TimeZone timeZoneM7293 = C0043.m7293();
        Locale localeM9324 = C0060.m9324(locale);
        D d = new D(str, timeZoneM7293, localeM9324);
        ConcurrentHashMap concurrentHashMapM9253 = C0059.m9253(this);
        Format format = (Format) C0030.m5374(concurrentHashMapM9253, d);
        if (format != null) {
            return format;
        }
        C0171c c0171c = new C0171c(str, timeZoneM7293, localeM9324);
        Format format2 = (Format) C0031.m5655(concurrentHashMapM9253, d, c0171c);
        return format2 != null ? format2 : c0171c;
    }
}