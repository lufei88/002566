package com.github.catvod.spider.merge.f;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Insets;
import android.os.LocaleList;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.HBhaiM;
import com.github.catvod.spider.HBv1Class;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.XBPQ;
import com.github.catvod.spider.XBPQPA;
import com.github.catvod.spider.Xb6v;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.E0.o;
import com.github.catvod.spider.merge.E0.s;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I.j;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V0.l;
import com.github.catvod.spider.merge.W.B;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.v;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0232A;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.L;
import com.github.catvod.spider.merge.a0.S;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.b0.RunnableC0263a;
import com.github.catvod.spider.merge.b0.n;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d.C0268c;
import com.github.catvod.spider.merge.d.C0269d;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0271a;
import com.github.catvod.spider.merge.e.C0279i;
import com.github.catvod.spider.merge.f0.C0304g;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.C0306a;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.T;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.x;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.p;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.d0.D;
import com.github.catvod.spider.p000mergexbpq.d0.F;
import com.github.catvod.spider.p000mergexbpq.d0.P;
import com.github.catvod.spider.p000mergexbpq.e0.C0124g;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URLEncoder;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.f.ۥ۠۟ۦ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0051 {

    /* renamed from: ۣ۟ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static int f785 = -589;

    /* renamed from: ۟۟ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8178(Object obj) {
        if (C0003.m1463() < 0) {
            return ((C0174a) obj).k;
        }
        return false;
    }

    /* renamed from: ۣ۟۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static String m8179(Object obj, Object obj2) {
        if (C0060.m9355() >= 0) {
            return ((com.github.catvod.spider.merge.E0.c) obj).b((com.github.catvod.spider.merge.H0.e) obj2);
        }
        return null;
    }

    /* renamed from: ۟۟ۧۦۥ, reason: not valid java name and contains not printable characters */
    public static Object m8180(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((AtomicReference) obj).get();
        }
        return null;
    }

    /* renamed from: ۟۟ۧۨۨ, reason: not valid java name and contains not printable characters */
    public static String m8181(Object obj) {
        if (C0053.m8389() >= 0) {
            return C0233B.s((String) obj);
        }
        return null;
    }

    /* renamed from: ۟۠ۡۤۡ, reason: not valid java name and contains not printable characters */
    public static void m8182(Object obj) {
        if (C0038.m6471() >= 0) {
            AbstractC0296g.b((AbstractC0296g) obj);
        }
    }

    /* renamed from: ۣ۟۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8183(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((C0232A) obj).h;
        }
        return false;
    }

    /* renamed from: ۟۠ۤۨۧ, reason: not valid java name and contains not printable characters */
    public static C0124g m8184(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.h0.d) obj).a();
        }
        return null;
    }

    /* renamed from: ۟۠ۦۨۨ, reason: not valid java name and contains not printable characters */
    public static void m8185(Object obj, Object obj2, Object obj3) {
        if (C0054.m8557() <= 0) {
            ((com.github.catvod.spider.merge.T0.c) obj).k((String) obj2, (String) obj3);
        }
    }

    /* renamed from: ۟۠ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static int m8186(int i, int i2) {
        if (C0036.m6252() >= 0) {
            return Math.min(i, i2);
        }
        return 0;
    }

    /* renamed from: ۣ۟۠ۨۧ, reason: not valid java name and contains not printable characters */
    public static m m8187(Object obj) {
        if (C0027.m5017() > 0) {
            return ((NG.Dt) obj).toVod();
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8188() {
        if (C0048.m7971() >= 0) {
            return B.c;
        }
        return false;
    }

    /* renamed from: ۣ۟ۡۥۧ, reason: not valid java name and contains not printable characters */
    public static View m8189(Object obj, Object obj2) {
        if (C0037.m6350() < 0) {
            return C0304g.e((View) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static String m8190(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * 10)) ^ i).toString();
            i++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* renamed from: ۟ۡۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m8191(Object obj) {
        if (C0013.m3167() > 0) {
            return ((com.github.catvod.spider.merge.l0.e) obj).e;
        }
        return 0;
    }

    /* renamed from: ۟ۡۤۥۦ, reason: not valid java name and contains not printable characters */
    public static int m8192(Object obj) {
        if (C0015.m3433() > 0) {
            return ((T) obj).c;
        }
        return 0;
    }

    /* renamed from: ۟ۡۨ۠۟, reason: not valid java name and contains not printable characters */
    public static String m8193(double d) {
        if (C0044.m7508() < 0) {
            return com.github.catvod.spider.merge.g0.g.j(d);
        }
        return null;
    }

    /* renamed from: ۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static void m8194(Object obj) {
        if (C0060.m9355() > 0) {
            ((com.github.catvod.spider.merge.D.f) obj).D();
        }
    }

    /* renamed from: ۟ۢ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m8195(Object obj) {
        if (C0039.m6529() < 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static Object m8196(Object obj, int i) {
        if (C0034.m6048() < 0) {
            return ((Vector) obj).elementAt(i);
        }
        return null;
    }

    /* renamed from: ۟ۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8197(Object obj, Object obj2) {
        if (C0008.m1975() >= 0) {
            return ((Class) obj).isAssignableFrom((Class) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۢۤۦۡ, reason: not valid java name and contains not printable characters */
    public static void m8198(Object obj, Object obj2) {
        if (C0007.m1886() >= 0) {
            ((Map) obj).putAll((Map) obj2);
        }
    }

    /* renamed from: ۟ۢۨۤۥ, reason: not valid java name and contains not printable characters */
    public static String m8199(Object obj) {
        if (C0027.m5017() > 0) {
            return v.h((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟۟, reason: not valid java name and contains not printable characters */
    public static String m8200(Object obj, Object obj2) {
        if (C0053.m8389() > 0) {
            return ((JSONObject) obj).optString((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۢۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.P.f m8201(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.P.e) obj).d();
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static String m8202(Object obj, Object obj2) {
        if (C0036.m6252() > 0) {
            return URLEncoder.encode((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static C0271a m8203(Object obj) {
        if (C0031.m5628() > 0) {
            return ((C0279i) obj).d;
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۧ۟, reason: not valid java name and contains not printable characters */
    public static String m8204(Object obj) {
        if (C0003.m1463() < 0) {
            return ((r) obj).p();
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۧۥ, reason: not valid java name and contains not printable characters */
    public static int m8205(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((LinkedBlockingQueue) obj).size();
        }
        return 0;
    }

    /* renamed from: ۟ۤ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m8206(Object obj, int i) {
        if (C0007.m1886() > 0) {
            ((View) obj).setMinimumWidth(i);
        }
    }

    /* renamed from: ۟ۤ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.N0.b m8207() {
        if (C0015.m3433() >= 0) {
            return com.github.catvod.spider.merge.N0.a.d;
        }
        return null;
    }

    /* renamed from: ۟ۤ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m8208() {
        if (C0047.m7837() > 0) {
            return "actor";
        }
        return null;
    }

    /* renamed from: ۟ۤۡۥۧ, reason: not valid java name and contains not printable characters */
    public static int m8209(Object obj) {
        if (C0045.m7538() < 0) {
            return ((WindowInsets) obj).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: ۟ۤۡۦ۟, reason: not valid java name and contains not printable characters */
    public static String m8210(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((com.github.catvod.spider.merge.V0.g) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static F m8211(Object obj, Object obj2) {
        if (C0057.m9017() >= 0) {
            return F.l((String) obj, (D) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۥۥۥ, reason: not valid java name and contains not printable characters */
    public static String m8212(Object obj, Object obj2) {
        if (C0040.m6582() > 0) {
            return ((j) obj).a((LinkedHashMap) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥ۠۠۠, reason: not valid java name and contains not printable characters */
    public static String m8213(Object obj) {
        if (C0041.m6823() < 0) {
            return ((C0306a) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۥۡۦۧ, reason: not valid java name and contains not printable characters */
    public static int m8214(Object obj) {
        if (C0044.m7508() < 0) {
            return ((com.github.catvod.spider.merge.G.f) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۥۡۨۤ, reason: not valid java name and contains not printable characters */
    public static void m8215(Object obj) {
        if (C0049.m8038() <= 0) {
            ((com.github.catvod.spider.merge.d0.f) obj).a();
        }
    }

    /* renamed from: ۟ۥۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m8216() {
        return 851 ^ C0047.f763;
    }

    /* renamed from: ۟ۥۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m8217() {
        if (C0054.m8557() < 0) {
            return Proxy.getUrl();
        }
        return null;
    }

    /* renamed from: ۟ۥۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static File m8218(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((p) obj).x();
        }
        return null;
    }

    /* renamed from: ۟ۥۦۥۣ, reason: not valid java name and contains not printable characters */
    public static int m8219(Object obj) {
        if (C0001.m1164() < 0) {
            return ((com.github.catvod.spider.merge.F0.r) obj).g;
        }
        return 0;
    }

    /* renamed from: ۟ۥۦۨ۟, reason: not valid java name and contains not printable characters */
    public static void m8220(Object obj, Object obj2) {
        if (C0005.m1599() <= 0) {
            ((com.github.catvod.spider.p000mergexbpq.T.c) obj).S((x) obj2);
        }
    }

    /* renamed from: ۟ۥۨۡ, reason: not valid java name and contains not printable characters */
    public static HashMap m8221(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((com.github.catvod.spider.merge.l0.e) obj).i;
        }
        return null;
    }

    /* renamed from: ۟ۦۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int m8222(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((NG.VtInfo) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۦۢۤۤ, reason: not valid java name and contains not printable characters */
    public static int m8223(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۟ۦۢۨۢ, reason: not valid java name and contains not printable characters */
    public static List m8224(Object obj) {
        if (C0042.m7147() <= 0) {
            return ((com.github.catvod.spider.merge.D.f) obj).i;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8225(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((WindowInsets) obj).isConsumed();
        }
        return false;
    }

    /* renamed from: ۟ۦۣۦۡ, reason: not valid java name and contains not printable characters */
    public static WindowInsets.Builder m8226(Object obj, Object obj2) {
        if (C0045.m7538() <= 0) {
            return ((WindowInsets.Builder) obj).setMandatorySystemGestureInsets((Insets) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۨ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.F0.F m8227() {
        if (C0040.m6582() > 0) {
            return com.github.catvod.spider.merge.F0.F.b;
        }
        return null;
    }

    /* renamed from: ۟ۧۢۧۥ, reason: not valid java name and contains not printable characters */
    public static int m8228(Object obj) {
        if (C0004.m1557() < 0) {
            return ((com.github.catvod.spider.merge.E0.c) obj).b;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۧۨۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8229(Object obj, Object obj2) {
        if (C0004.m1557() <= 0) {
            return ((XBPQ) obj).isVideoFormat((String) obj2);
        }
        return false;
    }

    /* renamed from: ۣ۟ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m8230(Object obj, char c) {
        if (C0039.m6529() < 0) {
            return ((CharsetEncoder) obj).canEncode(c);
        }
        return false;
    }

    /* renamed from: ۟ۧۦۣ۠, reason: not valid java name and contains not printable characters */
    public static void m8231(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0048.m7971() >= 0) {
            ((com.github.catvod.spider.merge.l0.e) obj).a((BufferedReader) obj2, (HashMap) obj3, (Map) obj4, (Map) obj5);
        }
    }

    /* renamed from: ۟ۧۧۤۥ, reason: not valid java name and contains not printable characters */
    public static void m8232() {
        if (C0029.m5282() >= 0) {
            com.github.catvod.spider.merge.d0.b.d();
        }
    }

    /* renamed from: ۟ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m8233(Object obj) {
        if (C0048.m7971() > 0) {
            return ((l) obj).a;
        }
        return 0;
    }

    /* renamed from: ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m8234(Object obj) {
        if (C0027.m5017() > 0) {
            return ((n) obj).b;
        }
        return 0;
    }

    /* renamed from: ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m8235(Object obj, Object obj2, Object obj3) {
        if (C0021.m4379() > 0) {
            return ((p) obj).F((String[]) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static void m8236(Object obj, Object obj2) {
        if (C0022.m4497() > 0) {
            ((com.github.catvod.spider.p000mergexbpq.P.e) obj).a((CharBuffer) obj2);
        }
    }

    /* renamed from: ۣ۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static View m8237(Object obj, int i) {
        if (C0007.m1886() > 0) {
            return ((ViewGroup) obj).getChildAt(i);
        }
        return null;
    }

    /* renamed from: ۣ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m8238(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((TextPaint) obj).getFontVariationSettings();
        }
        return null;
    }

    /* renamed from: ۠ۥۡۨ, reason: not valid java name and contains not printable characters */
    public static String[] m8239(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((EditorInfo) obj).contentMimeTypes;
        }
        return null;
    }

    /* renamed from: ۠ۥۤۨ, reason: not valid java name and contains not printable characters */
    public static List m8240(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (C0009.m2047() >= 0) {
            return ((L) obj).h((com.github.catvod.spider.merge.E.j) obj2, (ArrayList) obj3, (ArrayList) obj4, (String) obj5, (String) obj6, (Integer) obj7);
        }
        return null;
    }

    /* renamed from: ۠ۧۦۥ, reason: not valid java name and contains not printable characters */
    public static String m8241() {
        if (C0017.m3633() <= 0) {
            return Bili.e;
        }
        return null;
    }

    /* renamed from: ۡۡۧۨ, reason: not valid java name and contains not printable characters */
    public static String m8242(Object obj) {
        if (C0042.m7147() <= 0) {
            return ((Exception) obj).getMessage();
        }
        return null;
    }

    /* renamed from: ۣۡۦۣ, reason: not valid java name and contains not printable characters */
    public static void m8243(Object obj) throws InterruptedException {
        if (C0004.m1557() <= 0) {
            ((CountDownLatch) obj).await();
        }
    }

    /* renamed from: ۡۥۣۡ, reason: not valid java name and contains not printable characters */
    public static int m8244(Object obj, Object obj2) {
        if (C0001.m1164() <= 0) {
            return ((LocaleList) obj).indexOf((Locale) obj2);
        }
        return 0;
    }

    /* renamed from: ۣۡۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c.e m8245(Object obj, Object obj2) {
        if (C0061.m9359() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c.e) obj).b((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m8246(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((P) obj).e();
        }
        return null;
    }

    /* renamed from: ۢۡۦۢ, reason: not valid java name and contains not printable characters */
    public static String m8247(Object obj) {
        if (C0063.m9589() < 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).i0;
        }
        return null;
    }

    /* renamed from: ۢۢۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m8248(Object obj) {
        if (m8216() < 0) {
            return ((C0176b) obj).v;
        }
        return false;
    }

    /* renamed from: ۢۤۥ۟, reason: not valid java name and contains not printable characters */
    public static String m8249(Object obj) {
        if (C0059.m9257() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.h.d) obj).a();
        }
        return null;
    }

    /* renamed from: ۢۥۡۤ, reason: not valid java name and contains not printable characters */
    public static String m8250(Object obj) {
        if (C0005.m1599() < 0) {
            return ((HBhaiM) obj).h;
        }
        return null;
    }

    /* renamed from: ۢۦۣۤ, reason: not valid java name and contains not printable characters */
    public static StringBuffer m8251(Object obj, Object obj2) {
        if (C0020.m4210() < 0) {
            return ((StringBuffer) obj).append((String) obj2);
        }
        return null;
    }

    /* renamed from: ۢۦۤ۠, reason: not valid java name and contains not printable characters */
    public static void m8252(Object obj) {
        if (C0044.m7508() <= 0) {
            ((S) obj).l();
        }
    }

    /* renamed from: ۣ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static int m8253(Object obj, Object obj2) {
        if (C0016.m3596() <= 0) {
            return ((ViewGroup) obj).indexOfChild((View) obj2);
        }
        return 0;
    }

    /* renamed from: ۣۡۥ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.CollectionInfo m8254(int i, int i2, boolean z) {
        if (C0020.m4210() <= 0) {
            return AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z);
        }
        return null;
    }

    /* renamed from: ۣۡۨۨ, reason: not valid java name and contains not printable characters */
    public static String m8255(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).H;
        }
        return null;
    }

    /* renamed from: ۣۢ۟, reason: not valid java name and contains not printable characters */
    public static C0268c m8256(Object obj) {
        if (C0050.m8121() < 0) {
            return ((C0269d) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Class m8257() {
        if (C0038.m6471() > 0) {
            return Void.TYPE;
        }
        return null;
    }

    /* renamed from: ۣۥۧ, reason: not valid java name and contains not printable characters */
    public static int m8258(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((com.github.catvod.spider.merge.P0.l) obj).b;
        }
        return 0;
    }

    /* renamed from: ۣۧۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m8260(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((com.github.catvod.spider.merge.d0.f) obj).b;
        }
        return false;
    }

    /* renamed from: ۣۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.B.g m8261() {
        if (C0058.m9131() < 0) {
            return com.github.catvod.spider.merge.B.g.ON_PAUSE;
        }
        return null;
    }

    /* renamed from: ۤۢۨ۟, reason: not valid java name and contains not printable characters */
    public static String m8262() {
        if (C0016.m3596() <= 0) {
            return "搜索模式0";
        }
        return null;
    }

    /* renamed from: ۤۨۢۥ, reason: not valid java name and contains not printable characters */
    public static int m8263(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((com.github.catvod.spider.merge.T.d) obj).a;
        }
        return 0;
    }

    /* renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public static int m8264(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((RunnableC0263a) obj).a;
        }
        return 0;
    }

    /* renamed from: ۥۣۢۨ, reason: contains not printable characters */
    public static long m8265(Object obj, long j) {
        if (C0050.m8121() < 0) {
            return ((TimeUnit) obj).toNanos(j);
        }
        return 0L;
    }

    /* renamed from: ۥۣۣۦ, reason: contains not printable characters */
    public static boolean m8266(Object obj, Object obj2) {
        if (C0038.m6471() >= 0) {
            return ((HashSet) obj).add(obj2);
        }
        return false;
    }

    /* renamed from: ۥۣۥۥ, reason: contains not printable characters */
    public static void m8267(Object obj, Object obj2) {
        if (C0047.m7837() >= 0) {
            ((com.github.catvod.spider.merge.E0.h) obj).k((o) obj2);
        }
    }

    /* renamed from: ۦ۠ۤۤ, reason: contains not printable characters */
    public static boolean m8268(Object obj) {
        if (C0013.m3167() > 0) {
            return ((AccessibilityNodeInfo) obj).isDismissable();
        }
        return false;
    }

    /* renamed from: ۦۥۧ۠, reason: contains not printable characters */
    public static String m8269(long j) {
        if (C0000.m1116() < 0) {
            return com.github.catvod.spider.merge.g0.e.j(j);
        }
        return null;
    }

    /* renamed from: ۦۨۦۡ, reason: contains not printable characters */
    public static String m8270() {
        if (C0006.m1726() < 0) {
            return "\\]\\.";
        }
        return null;
    }

    /* renamed from: ۧۤۨ, reason: not valid java name and contains not printable characters */
    public static Object m8271(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((com.github.catvod.spider.merge.a0.P) obj).b;
        }
        return null;
    }

    /* renamed from: ۧۦۥۢ, reason: not valid java name and contains not printable characters */
    public static String m8272(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0022.m4497() > 0) {
            return ((XBPQPA) obj).playerContent((String) obj2, (String) obj3, (List) obj4);
        }
        return null;
    }

    /* renamed from: ۧۧۧ۟, reason: not valid java name and contains not printable characters */
    public static HashMap m8273() {
        if (C0024.m4693() < 0) {
            return Xb6v.c();
        }
        return null;
    }

    /* renamed from: ۨ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static String m8274(Object obj) {
        if (C0043.m7332() > 0) {
            return ((com.github.catvod.spider.merge.F.a) obj).b();
        }
        return null;
    }

    /* renamed from: ۨۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m8275(Object obj) {
        if (C0012.m3024() > 0) {
            ((com.github.catvod.spider.merge.D.f) obj).c();
        }
    }

    /* renamed from: ۨۢۨ, reason: not valid java name and contains not printable characters */
    public static void m8276(Object obj, Object obj2) {
        if (C0002.m1242() > 0) {
            ((Dialog) obj).setOnShowListener((DialogInterface.OnShowListener) obj2);
        }
    }

    /* renamed from: ۣۨۤۧ, reason: not valid java name and contains not printable characters */
    public static void m8277(Object obj, Object obj2) {
        if (C0005.m1599() < 0) {
            ((HBv1Class) obj).getConfig((String) obj2);
        }
    }

    /* renamed from: ۨۤۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.G0.d[] m8278(Object obj) {
        if (C0000.m1116() < 0) {
            return ((com.github.catvod.spider.merge.G0.d) obj).c;
        }
        return null;
    }

    /* renamed from: ۨۧۨ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.r m8279(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((s) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۦ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m8259(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}