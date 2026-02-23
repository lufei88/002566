package com.github.catvod.spider.merge.d0;

import android.app.Activity;
import android.net.Uri;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.core.util.Predicate;
import com.github.catvod.spider.HBqTeng;
import com.github.catvod.spider.HBsuipian;
import com.github.catvod.spider.Jable;
import com.github.catvod.spider.KuaKeS;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge-xbpq.Q.q0;
import com.github.catvod.spider.merge.B.g;
import com.github.catvod.spider.merge.B.n;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.AbstractC0152i;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0145b;
import com.github.catvod.spider.merge.F0.L;
import com.github.catvod.spider.merge.F0.d0;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.M.h;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.C0171c;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.l;
import com.github.catvod.spider.merge.U0.B;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.P;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.m;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.s;
import com.github.catvod.spider.merge.W.x;
import com.github.catvod.spider.merge.X0.r;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.Z0.j;
import com.github.catvod.spider.merge.a0.AbstractC0245f;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.e.C0276f;
import com.github.catvod.spider.merge.e.C0281k;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0302e;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.M;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.k0.C0351b;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.v.C0375a;
import com.github.catvod.spider.merge.w0.C0409a;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.x0.C0413c;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.l0;
import com.github.catvod.spider.p000mergexbpq.Q.p0;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.p;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.github.catvod.spider.merge.d0.ۤ۠ۢۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0048 {

    /* renamed from: ۣۢۨۡ, reason: not valid java name and contains not printable characters */
    public static int f769 = -661;

    /* renamed from: ۟۟۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static String m7882() {
        if (C0027.m5017() >= 0) {
            return "playResult";
        }
        return null;
    }

    /* renamed from: ۟۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static Method m7883(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((C0351b) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static String m7884(Object obj, Object obj2) {
        if (C0064.m9659() < 0) {
            return ((com.github.catvod.spider.merge.G.a) obj).l((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟۟ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static TextDirectionHeuristic m7885() {
        if (C0033.m5872() >= 0) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        return null;
    }

    /* renamed from: ۟۟ۥۧۢ, reason: not valid java name and contains not printable characters */
    public static String m7886() {
        if (C0049.m8038() < 0) {
            return "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36";
        }
        return null;
    }

    /* renamed from: ۟۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7887(Object obj, Object obj2) {
        if (C0009.m2047() > 0) {
            return ((Field) obj).getBoolean(obj2);
        }
        return false;
    }

    /* renamed from: ۟۟ۨۦۦ, reason: not valid java name and contains not printable characters */
    public static g m7888(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((n) obj).value();
        }
        return null;
    }

    /* renamed from: ۣ۟۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m7889(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((Uri) obj).getHost();
        }
        return null;
    }

    /* renamed from: ۣ۟۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static Iterator m7890(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((Iterable) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static int m7891(Object obj) {
        if (C0007.m1886() > 0) {
            return ((h) obj).a();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static Predicate m7892(Object obj) {
        if (m7971() > 0) {
            return ((C0375a) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static l0 m7893(Object obj, Object obj2) {
        if (C0031.m5628() > 0) {
            return l0.e((l0) obj, (l0) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static int m7894(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((C0413c) obj).b;
        }
        return 0;
    }

    /* renamed from: ۟ۢ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static Set m7895(Object obj) {
        if (C0062.m9429() > 0) {
            return ((LinkedHashMap) obj).entrySet();
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static q0 m7896(Object obj) {
        if (C0009.m2047() > 0) {
            return ((p0) obj).i;
        }
        return null;
    }

    /* renamed from: ۟ۢۢۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7897(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.c) obj).f();
        }
        return false;
    }

    /* renamed from: ۟ۢۢۤۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.P0.n m7898(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((C0171c) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static void m7899(Object obj, Object obj2) {
        if (C0027.m5017() > 0) {
            ((WebView) obj).loadUrl((String) obj2);
        }
    }

    /* renamed from: ۣ۟۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.H0.f m7900(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((AbstractC0152i) obj).f;
        }
        return null;
    }

    /* renamed from: ۟ۤ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m7901(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((HBsuipian) obj).a();
        }
        return null;
    }

    /* renamed from: ۟ۤۦۣ۟, reason: not valid java name and contains not printable characters */
    public static void m7903(Object obj) {
        if (C0053.m8389() >= 0) {
            C0023.m4544(obj);
        }
    }

    /* renamed from: ۣ۟ۤۧۧ, reason: not valid java name and contains not printable characters */
    public static String m7904() {
        if (C0026.m4977() <= 0) {
            return "未知";
        }
        return null;
    }

    /* renamed from: ۟ۤۨۡۥ, reason: not valid java name and contains not printable characters */
    public static String m7905() {
        if (C0041.m6823() <= 0) {
            return "\\+";
        }
        return null;
    }

    /* renamed from: ۟ۤۨۢۡ, reason: not valid java name and contains not printable characters */
    public static Locale m7906(Object obj) {
        if (C0013.m3167() > 0) {
            return ((TextPaint) obj).getTextLocale();
        }
        return null;
    }

    /* renamed from: ۟ۥۡۢۤ, reason: not valid java name and contains not printable characters */
    public static void m7907(Object obj, int i) {
        if (C0019.m4065() < 0) {
            ((View) obj).setBackgroundColor(i);
        }
    }

    /* renamed from: ۟ۥۡۧۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7908(Object obj) {
        if (C0016.m3596() < 0) {
            return ((com.github.catvod.spider.merge.N0.b) obj).a;
        }
        return false;
    }

    /* renamed from: ۟ۥۣۢ۠, reason: not valid java name and contains not printable characters */
    public static String m7909(Object obj) {
        if (C0021.m4379() > 0) {
            return KuaKeS.c((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۥۥۥ۟, reason: not valid java name and contains not printable characters */
    public static String m7910() {
        if (C0032.m5686() <= 0) {
            return "url=http#;post;#.js";
        }
        return null;
    }

    /* renamed from: ۟ۦۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m7911() {
        if (C0009.m2047() > 0) {
            return C0246g.f();
        }
        return null;
    }

    /* renamed from: ۟ۦۣۡۨ, reason: not valid java name and contains not printable characters */
    public static int m7912(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((m) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۦۢ۠, reason: not valid java name and contains not printable characters */
    public static Object m7913(Object obj, Object obj2) {
        if (C0044.m7508() < 0) {
            return ((Hashtable) obj).get(obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۥۥ, reason: not valid java name and contains not printable characters */
    public static String m7914(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.T.b) obj).c();
        }
        return null;
    }

    /* renamed from: ۟ۦۧۢۦ, reason: not valid java name and contains not printable characters */
    public static Object m7915(Object obj, int i) {
        if (C0003.m1463() < 0) {
            return ((List) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۟ۧ۟ۥ۠, reason: not valid java name and contains not printable characters */
    public static C0302e m7916(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((com.github.catvod.spider.merge.l0.m) obj).g;
        }
        return null;
    }

    /* renamed from: ۟ۧۡۥۥ, reason: not valid java name and contains not printable characters */
    public static ExecutorService m7917(int i, Object obj) {
        if (C0033.m5872() >= 0) {
            return Executors.newFixedThreadPool(i, (ThreadFactory) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7918(Object obj, Object obj2) {
        if (C0024.m4693() <= 0) {
            return ((WindowInsets) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۣ۟ۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m7919(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((HBqTeng) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۧۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m7920(Object obj) {
        if (m7971() > 0) {
            return ((M) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۧۥۣ۟, reason: not valid java name and contains not printable characters */
    public static d0 m7921(Object obj) {
        if (C0056.m8886() < 0) {
            return ((C0145b) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۧۦۡ۠, reason: not valid java name and contains not printable characters */
    public static Object[] m7922(Object obj) {
        if (C0056.m8886() <= 0) {
            return j.e((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۧۦۣۧ, reason: not valid java name and contains not printable characters */
    public static String m7923(Object obj) {
        if (C0030.m5375() > 0) {
            return com.github.catvod.spider.merge.a0.M.t((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۧۦۧۥ, reason: not valid java name and contains not printable characters */
    public static void m7924(Object obj, int i) {
        if (C0023.m4566() < 0) {
            ((ImageView) obj).setImageResource(i);
        }
    }

    /* renamed from: ۟ۧۦۧۨ, reason: not valid java name and contains not printable characters */
    public static void m7925(Object obj, Object obj2) {
        if (m7971() >= 0) {
            s.e((Activity) obj, (String) obj2);
        }
    }

    /* renamed from: ۟ۨۢ۠, reason: not valid java name and contains not printable characters */
    public static String m7926() {
        if (C0023.m4566() < 0) {
            return "{area}";
        }
        return null;
    }

    /* renamed from: ۣ۠۠۟, reason: not valid java name and contains not printable characters */
    public static String m7927(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((com.github.catvod.spider.merge.P.a) obj).toString();
        }
        return null;
    }

    /* renamed from: ۠ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static HashMap m7928() {
        if (C0024.m4693() < 0) {
            return Jable.a();
        }
        return null;
    }

    /* renamed from: ۠ۢۤ۟, reason: not valid java name and contains not printable characters */
    public static String m7929() {
        if (C0043.m7332() >= 0) {
            return "VideoFormat";
        }
        return null;
    }

    /* renamed from: ۠ۥۢ۟, reason: not valid java name and contains not printable characters */
    public static void m7930(Object obj, Object obj2) {
        if (C0018.m3956() > 0) {
            p.e((p) obj, (String) obj2);
        }
    }

    /* renamed from: ۠ۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m7931(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * 10)) ^ i).toString();
            i++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۠ۦۦۦ, reason: not valid java name and contains not printable characters */
    public static int m7932(Object obj) {
        if (C0061.m9359() < 0) {
            return ((C0276f) obj).b;
        }
        return 0;
    }

    /* renamed from: ۡۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.I.j m7933(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((com.github.catvod.spider.merge.I.b) obj).n();
        }
        return null;
    }

    /* renamed from: ۡۢۦۢ, reason: not valid java name and contains not printable characters */
    public static B m7934(Object obj) {
        if (C0000.m1116() < 0) {
            return ((C0176b) obj).l;
        }
        return null;
    }

    /* renamed from: ۣۡۧۦ, reason: not valid java name and contains not printable characters */
    public static int m7935(Object obj, int i) {
        if (C0055.m8740() >= 0) {
            return ((String) obj).indexOf(i);
        }
        return 0;
    }

    /* renamed from: ۡۥۦ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E.m m7936(Object obj) {
        if (C0032.m5686() < 0) {
            return ((com.github.catvod.spider.merge.I.g) obj).b();
        }
        return null;
    }

    /* renamed from: ۡۥۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7937(Object obj) {
        if (C0034.m6048() <= 0) {
            return com.github.catvod.spider.merge.M0.d.a((CharSequence[]) obj);
        }
        return false;
    }

    /* renamed from: ۡۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Object m7938(Object obj, Object obj2) {
        if (C0009.m2047() >= 0) {
            return ((r) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۣۢۦۦ, reason: not valid java name and contains not printable characters */
    public static String m7939() {
        if (C0060.m9355() > 0) {
            return "url=+";
        }
        return null;
    }

    /* renamed from: ۣۢۥۡ, reason: not valid java name and contains not printable characters */
    public static void m7940() {
        if (C0002.m1242() >= 0) {
            Proxy.a();
        }
    }

    /* renamed from: ۣۣۡۢ, reason: not valid java name and contains not printable characters */
    public static Long m7941(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((com.github.catvod.spider.merge.I.b) obj).f();
        }
        return null;
    }

    /* renamed from: ۣۥۤۧ, reason: not valid java name and contains not printable characters */
    public static void m7942(Object obj) {
        if (C0054.m8557() < 0) {
            ((l) obj).a();
        }
    }

    /* renamed from: ۣۧۤۤ, reason: not valid java name and contains not printable characters */
    public static p m7943(Object obj) {
        if (C0058.m9131() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.b.h) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۣۤ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.T0.c m7944(Object obj) {
        if (C0001.m1164() < 0) {
            return ((com.github.catvod.spider.merge.T0.a) obj).c;
        }
        return null;
    }

    /* renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m7945(Object obj, Object obj2) {
        if (C0015.m3433() >= 0) {
            return ((WritableByteChannel) obj).write((ByteBuffer) obj2);
        }
        return 0;
    }

    /* renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static boolean m7946(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((x) obj).g;
        }
        return false;
    }

    /* renamed from: ۥۡ۟ۤ, reason: contains not printable characters */
    public static String m7947(Object obj) {
        if (C0002.m1242() > 0) {
            return ((com.github.catvod.spider.merge.K.a) obj).toString();
        }
        return null;
    }

    /* renamed from: ۥۣ۟ۢ, reason: contains not printable characters */
    public static int[] m7948(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((P) obj).s;
        }
        return null;
    }

    /* renamed from: ۥۥۢۢ, reason: contains not printable characters */
    public static Object m7949(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((Iterator) obj).next();
        }
        return null;
    }

    /* renamed from: ۥۧ۠۟, reason: contains not printable characters */
    public static String m7950() {
        if (C0022.m4497() >= 0) {
            return "/proxy?do=seachdanmu&go=senddanmu&username=${encodeURIComponent(username)}&message=${encodeURIComponent(message)}`;\n        fetch(url)\n            .then(res => res.text())\n            .then(text => {\n                showStatus(text || '弹幕已发送成功！', 'success');\n                messageEl.value = '';\n            })\n            .catch(err => showStatus('弹幕已发送成功！', 'success'));\n    }\n\n    // 更新可聚焦元素列表\n    function updateFocusableElements() {\n        const newFocusable = document.querySelectorAll('a[href], button, input, textarea');\n        focusArray.length = 0;\n        focusArray.push(...Array.from(newFocusable).filter(el => !el.disabled && el.tabIndex !== -1));\n    }\n\n    // 显示状态消息\n    function showStatus(text, type) {\n        statusMessage.textContent = text;\n        statusMessage.className = 'status-message';\n        if (type === 'success') statusMessage.style.backgroundColor = '#006400';\n        else if (type === 'failure') statusMessage.style.backgroundColor = '#c0392b';\n        else if (type === 'info') statusMessage.style.backgroundColor = '#3498db';\n        statusMessage.classList.add('show');\n        setTimeout(() => statusMessage.classList.remove('show'), 3000);\n    }\n</script>\n\n\n</body></html>";
        }
        return null;
    }

    /* renamed from: ۥۧۥۤ, reason: contains not printable characters */
    public static void m7951(Object obj, Object obj2) {
        if (C0051.m8216() <= 0) {
            ((com.github.catvod.spider.merge.F.p) obj).e((String) obj2);
        }
    }

    /* renamed from: ۥۨۥ۠, reason: contains not printable characters */
    public static List m7952(Object obj) {
        if (C0036.m6252() > 0) {
            return ((com.github.catvod.spider.merge.M.e) obj).a();
        }
        return null;
    }

    /* renamed from: ۦۡ۟ۦ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.E0.f m7953(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((L) obj).g;
        }
        return null;
    }

    /* renamed from: ۦۢۡۢ, reason: contains not printable characters */
    public static void m7954(Object obj, Object obj2) {
        if (C0036.m6252() > 0) {
            ((com.github.catvod.spider.merge.M.g) obj).d((Integer) obj2);
        }
    }

    /* renamed from: ۦۤ۟۟, reason: contains not printable characters */
    public static String m7955() {
        if (C0059.m9257() <= 0) {
            return "jx";
        }
        return null;
    }

    /* renamed from: ۦۤۢۡ, reason: contains not printable characters */
    public static String m7956(Object obj) {
        if (C0009.m2047() > 0) {
            return ((com.github.catvod.spider.merge.O.b) obj).a;
        }
        return null;
    }

    /* renamed from: ۦۥۥۤ, reason: contains not printable characters */
    public static String m7957(Object obj) {
        if (C0020.m4210() < 0) {
            return com.github.catvod.spider.merge.B0.a.C((ArrayList) obj);
        }
        return null;
    }

    /* renamed from: ۦۥۨۥ, reason: contains not printable characters */
    public static void m7958(Object obj) {
        if (C0000.m1116() <= 0) {
            ((com.github.catvod.spider.merge.D.f) obj).C();
        }
    }

    /* renamed from: ۦۦۥۥ, reason: contains not printable characters */
    public static char m7959(char c) {
        if (C0012.m3024() >= 0) {
            return Character.toUpperCase(c);
        }
        return (char) 0;
    }

    /* renamed from: ۦۧۨۤ, reason: contains not printable characters */
    public static g m7960() {
        if (C0013.m3167() >= 0) {
            return g.ON_STOP;
        }
        return null;
    }

    /* renamed from: ۦۣۣۨ, reason: contains not printable characters */
    public static int m7961(Object obj) {
        if (C0063.m9589() <= 0) {
            return ((d) obj).e;
        }
        return 0;
    }

    /* renamed from: ۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Charset m7962() {
        if (C0028.m5152() <= 0) {
            return com.github.catvod.spider.p000mergexbpq.j.m.c;
        }
        return null;
    }

    /* renamed from: ۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static C0409a m7963() {
        if (C0039.m6529() < 0) {
            return C0409a.a;
        }
        return null;
    }

    /* renamed from: ۧۢۤ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.I0.c m7964(Object obj, int i) {
        if (C0063.m9589() <= 0) {
            return ((com.github.catvod.spider.merge.E0.p) obj).g(i);
        }
        return null;
    }

    /* renamed from: ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static int m7965(int i, Object obj) {
        if (C0004.m1557() <= 0) {
            return com.github.catvod.spider.merge.l0.e.d(i, (byte[]) obj);
        }
        return 0;
    }

    /* renamed from: ۧۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m7966(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۧۦۡۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.d.e m7967(Object obj, Object obj2) {
        if (C0017.m3633() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.e) obj).i((String) obj2);
        }
        return null;
    }

    /* renamed from: ۧۧۡۦ, reason: not valid java name and contains not printable characters */
    public static void m7968(Object obj, boolean z) {
        if (C0008.m1975() >= 0) {
            ((View) obj).setClickable(z);
        }
    }

    /* renamed from: ۧۨۢۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7969(Object obj, int i) {
        if (C0030.m5375() > 0) {
            return ((com.github.catvod.spider.merge.e1.b) obj).g(i);
        }
        return false;
    }

    /* renamed from: ۨۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static C0246g m7970() {
        if (C0022.m4497() >= 0) {
            return AbstractC0245f.a;
        }
        return null;
    }

    /* renamed from: ۨۥۤ۟, reason: not valid java name and contains not printable characters */
    public static int m7971() {
        return (-83) ^ C0043.f745;
    }

    /* renamed from: ۨۨۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7972(Object obj) {
        if (C0003.m1463() < 0) {
            return ((C0281k) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ۣ۟ۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m7902(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}