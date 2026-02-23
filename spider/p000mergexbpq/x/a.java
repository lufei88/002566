package com.github.catvod.spider.p000mergexbpq.x;

import com.github.catvod.spider.merge-xbpq.A.b;
import com.github.catvod.spider.merge-xbpq.A.c;
import com.github.catvod.spider.merge-xbpq.E.f;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f364short = {732, 660, 648, 649, 659, 734, 2544, 2541, 2550, 2544, 2533, 2529, 2556, 2554, 2555};

    public static void a(Throwable th, Throwable th2) {
        m3402(th, C0057.m8978(m3396(), 0, 6, 736));
        m3402(th2, C0006.m1774(m3396(), 6, 9, 2453));
        if (th != th2) {
            m3391(m3398(), th, th2);
        }
    }

    public static HttpUrl b(String str, List list) {
        HttpUrl httpUrlM3400 = m3400(str);
        if (list == null || C0064.m9636(list) == 0) {
            return httpUrlM3400;
        }
        HttpUrl.Builder builderM3392 = m3392(httpUrlM3400);
        Iterator itM3109 = C0013.m3109(list);
        while (C0012.m2962(itM3109)) {
            com.github.catvod.spider.merge-xbpq.u0.a aVar = (com.github.catvod.spider.merge-xbpq.u0.a) C0048.m7949(itM3109);
            if (m3395(aVar)) {
                m3401(builderM3392, m3394(aVar), C0037.m6312(m3397(aVar)));
            } else {
                m3393(builderM3392, m3394(aVar), C0037.m6312(m3397(aVar)));
            }
        }
        return m3399(builderM3392);
    }

    public static String c(String str) {
        return str != null ? C0039.m6565(str, C0057.m8952()) : C0007.m1840();
    }

    public static String d(String str) {
        return C0064.m9640(C0055.m8795(str));
    }

    /* renamed from: ۟ۢ۠۟, reason: not valid java name and contains not printable characters */
    public static void m3391(Object obj, Object obj2, Object obj3) {
        if (C0017.m3633() < 0) {
            ((b) obj).a((Throwable) obj2, (Throwable) obj3);
        }
    }

    /* renamed from: ۣ۟ۢۥۡ, reason: not valid java name and contains not printable characters */
    public static HttpUrl.Builder m3392(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((HttpUrl) obj).newBuilder();
        }
        return null;
    }

    /* renamed from: ۟ۢۧۤۡ, reason: not valid java name and contains not printable characters */
    public static HttpUrl.Builder m3393(Object obj, Object obj2, Object obj3) {
        if (C0016.m3596() < 0) {
            return ((HttpUrl.Builder) obj).addQueryParameter((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۨۢ۟, reason: not valid java name and contains not printable characters */
    public static String m3394(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((com.github.catvod.spider.merge-xbpq.u0.a) obj).a();
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3395(Object obj) {
        if (C0036.m6252() > 0) {
            return ((com.github.catvod.spider.merge-xbpq.u0.a) obj).c();
        }
        return false;
    }

    /* renamed from: ۠ۢۢۦ, reason: not valid java name and contains not printable characters */
    public static short[] m3396() {
        if (C0013.m3167() > 0) {
            return f364short;
        }
        return null;
    }

    /* renamed from: ۣۣۡۢ, reason: not valid java name and contains not printable characters */
    public static Object m3397(Object obj) {
        if (C0003.m1463() < 0) {
            return ((com.github.catvod.spider.merge-xbpq.u0.a) obj).b();
        }
        return null;
    }

    /* renamed from: ۢۡۧۧ, reason: not valid java name and contains not printable characters */
    public static b m3398() {
        if (C0060.m9355() > 0) {
            return c.a;
        }
        return null;
    }

    /* renamed from: ۥۣ۠۠, reason: contains not printable characters */
    public static HttpUrl m3399(Object obj) {
        if (C0050.m8121() < 0) {
            return ((HttpUrl.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۦۣ۟۠, reason: contains not printable characters */
    public static HttpUrl m3400(Object obj) {
        if (C0005.m1599() < 0) {
            return HttpUrl.get((String) obj);
        }
        return null;
    }

    /* renamed from: ۦۣۦۢ, reason: contains not printable characters */
    public static HttpUrl.Builder m3401(Object obj, Object obj2, Object obj3) {
        if (C0029.m5282() >= 0) {
            return ((HttpUrl.Builder) obj).addEncodedQueryParameter((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۨۧۤۧ, reason: not valid java name and contains not printable characters */
    public static void m3402(Object obj, Object obj2) {
        if (C0058.m9131() < 0) {
            f.e(obj, (String) obj2);
        }
    }
}