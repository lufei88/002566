package com.github.catvod.spider.merge.b;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.location.GnssStatus;
import android.net.Uri;
import android.os.LocaleList;
import android.os.Parcel;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.Base64;
import android.util.SparseLongArray;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.catvod.debug.testActivity;
import com.github.catvod.spider.Ali;
import com.github.catvod.spider.BilibiliLive;
import com.github.catvod.spider.Douban;
import com.github.catvod.spider.HBAppfox;
import com.github.catvod.spider.HBcms10Dou;
import com.github.catvod.spider.HBlingDu;
import com.github.catvod.spider.HBmoou;
import com.github.catvod.spider.HBrenren;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.merge.A0.h;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F.o;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0144a;
import com.github.catvod.spider.merge.F0.C0147d;
import com.github.catvod.spider.merge.F0.C0154k;
import com.github.catvod.spider.merge.F0.P;
import com.github.catvod.spider.merge.F0.e0;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.G0.b;
import com.github.catvod.spider.merge.H0.f;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.K0.d;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.A;
import com.github.catvod.spider.merge.P0.B;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.n;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.U.i;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.k;
import com.github.catvod.spider.merge.W.s;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0253n;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.RunnableC0244e;
import com.github.catvod.spider.merge.a0.S;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.a1.g;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0266a;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.e.C0273c;
import com.github.catvod.spider.merge.e.C0281k;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.AbstractC0323c;
import com.github.catvod.spider.merge.h0.C0314C;
import com.github.catvod.spider.merge.h0.C0333m;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.w.C0406j;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.D;
import com.github.catvod.spider.p000mergexbpq.P.G;
import com.github.catvod.spider.p000mergexbpq.P.w;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.e;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.S.j;
import com.github.catvod.spider.p000mergexbpq.S.l;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.p;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.d.c;
import com.github.catvod.spider.p000mergexbpq.d0.C0067a;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.nio.CharBuffer;
import java.security.KeyManagementException;
import java.security.SecureRandom;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.json.JSONArray;

/* renamed from: com.github.catvod.spider.merge.b.ۣ۟ۧۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0044 {

    /* renamed from: ۟ۡۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static int f746 = 344;

    /* renamed from: ۟۟۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m7378(Object obj, boolean z) {
        if (C0005.m1599() < 0) {
            ((View) obj).setEnabled(z);
        }
    }

    /* renamed from: ۟۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static f m7379(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((e0) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۟ۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7380(Object obj, Object obj2) {
        if (C0043.m7332() > 0) {
            return ((o) obj).a((String) obj2);
        }
        return false;
    }

    /* renamed from: ۣ۟۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7381(Object obj) {
        if (C0041.m6823() < 0) {
            return ((b) obj).e;
        }
        return false;
    }

    /* renamed from: ۟۟ۨۦۣ, reason: not valid java name and contains not printable characters */
    public static char[] m7382() {
        if (C0011.m2755() > 0) {
            return d.a;
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static String m7383(Object obj) {
        if (C0026.m4977() < 0) {
            return ((com.github.catvod.spider.merge.G.d) obj).a();
        }
        return null;
    }

    /* renamed from: ۟۠ۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m7384(Object obj) {
        if (C0025.m4797() > 0) {
            return h.e((String) obj);
        }
        return null;
    }

    /* renamed from: ۟۠ۥ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m7385() {
        if (C0040.m6582() >= 0) {
            return WindowInsets.Type.systemGestures();
        }
        return 0;
    }

    /* renamed from: ۟ۡ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m7386(Object obj) {
        if (C0008.m1975() > 0) {
            return ((com.github.catvod.spider.merge.b0.d) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۡ۠۟۟, reason: not valid java name and contains not printable characters */
    public static String m7387(Object obj) {
        if (C0013.m3167() > 0) {
            return g.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۡ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static S m7388() {
        if (C0007.m1886() > 0) {
            return AbstractC0323c.a;
        }
        return null;
    }

    /* renamed from: ۟ۡۡۤۤ, reason: not valid java name and contains not printable characters */
    public static int m7389(Object obj, Object obj2, int i) {
        if (C0008.m1975() >= 0) {
            return ((com.github.catvod.spider.merge.P0.h) obj).c((n) obj2, i);
        }
        return 0;
    }

    /* renamed from: ۟ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static String m7390() {
        if (C0007.m1886() >= 0) {
            return "playerContent(flag=";
        }
        return null;
    }

    /* renamed from: ۟ۡۢۥۨ, reason: not valid java name and contains not printable characters */
    public static String m7391(Object obj, Object obj2, Object obj3) {
        if (m7508() <= 0) {
            return ((C0246g) obj).e((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۡۤۤۢ, reason: not valid java name and contains not printable characters */
    public static TimeZone m7392(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((B) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۡۥۡۨ, reason: not valid java name and contains not printable characters */
    public static String m7393(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((C0253n) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۡۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m7394() {
        if (C0048.m7971() > 0) {
            return "32";
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۨۨ, reason: not valid java name and contains not printable characters */
    public static r m7395(Object obj) {
        if (C0015.m3433() > 0) {
            return ((r) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۡۨۥۦ, reason: not valid java name and contains not printable characters */
    public static void m7396(Object obj) {
        if (C0005.m1599() <= 0) {
            ((WebView) obj).stopLoading();
        }
    }

    /* renamed from: ۟ۡۨۨۨ, reason: not valid java name and contains not printable characters */
    public static Insets m7397(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((WindowInsets) obj).getSystemGestureInsets();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static int m7398(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((com.github.catvod.spider.merge.F0.B) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۢۡۧ۟, reason: not valid java name and contains not printable characters */
    public static TimeZone m7399(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((n) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۢۢۢۦ, reason: not valid java name and contains not printable characters */
    public static void m7400(Object obj, Object obj2) {
        if (C0028.m5152() <= 0) {
            ((ImageView) obj).setImageDrawable((Drawable) obj2);
        }
    }

    /* renamed from: ۟ۢۢۤ۟, reason: not valid java name and contains not printable characters */
    public static void m7401(Object obj, long j) {
        if (C0039.m6529() <= 0) {
            ((Animation) obj).setDuration(j);
        }
    }

    /* renamed from: ۟ۢۤۢۦ, reason: not valid java name and contains not printable characters */
    public static String m7402() {
        if (C0030.m5375() >= 0) {
            return "导演";
        }
        return null;
    }

    /* renamed from: ۟ۢۥۥۦ, reason: not valid java name and contains not printable characters */
    public static String m7403() {
        if (C0032.m5686() <= 0) {
            return "/ajax/";
        }
        return null;
    }

    /* renamed from: ۟ۢۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7404(Object obj) {
        if (C0018.m3956() > 0) {
            return com.github.catvod.spider.merge.d0.b.a((String) obj);
        }
        return false;
    }

    /* renamed from: ۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m7405(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.P.f) obj).g();
        }
        return 0;
    }

    /* renamed from: ۣۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static int m7406(Object obj) {
        if (C0028.m5152() < 0) {
            return ((C0333m) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣ۟۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static String m7407(Object obj) {
        if (C0055.m8740() > 0) {
            return ((URL) obj).getHost();
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static int m7408(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((Insets) obj).right;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۢۧۡ, reason: not valid java name and contains not printable characters */
    public static D m7409(Object obj, int i) {
        if (C0032.m5686() < 0) {
            return ((w) obj).s(i);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static r m7410(Object obj) {
        if (C0035.m6140() < 0) {
            return ((r) obj).i();
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m7411() {
        if (C0055.m8740() >= 0) {
            return HBrenren.a();
        }
        return null;
    }

    /* renamed from: ۟ۤ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m7412(Object obj) {
        if (C0030.m5375() > 0) {
            return ((com.github.catvod.spider.merge.F.h) obj).j();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static D m7413(Object obj, int i) {
        if (C0051.m8216() < 0) {
            return ((G) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۟ۤۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static List m7414() {
        if (C0001.m1164() < 0) {
            return m.h;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static c m7415(Object obj) {
        if (C0017.m3633() <= 0) {
            return c.g((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۤ۟, reason: not valid java name and contains not printable characters */
    public static void m7416(Object obj, boolean z) {
        if (C0019.m4065() <= 0) {
            ((WebSettings) obj).setJavaScriptEnabled(z);
        }
    }

    /* renamed from: ۟ۤۥۧ۠, reason: not valid java name and contains not printable characters */
    public static void m7417(Object obj) {
        if (C0053.m8389() > 0) {
            ((CookieManager) obj).flush();
        }
    }

    /* renamed from: ۟ۤۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static List m7418(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((com.github.catvod.spider.merge.F.h) obj).e();
        }
        return null;
    }

    /* renamed from: ۟ۤۨۦ۠, reason: not valid java name and contains not printable characters */
    public static String m7419() {
        if (C0010.m2320() < 0) {
            return ", pg=";
        }
        return null;
    }

    /* renamed from: ۟ۥ۟۟۠, reason: not valid java name and contains not printable characters */
    public static TextDirectionHeuristic m7420() {
        if (C0022.m4497() >= 0) {
            return TextDirectionHeuristics.LOCALE;
        }
        return null;
    }

    /* renamed from: ۟ۥ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m7421(Object obj) {
        if (C0054.m8557() < 0) {
            return ((C0340u) obj).g;
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static Object[][] m7422(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((C0147d) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥۡۡۦ, reason: not valid java name and contains not printable characters */
    public static String m7423(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((com.github.catvod.spider.merge.H.a) obj).toString();
        }
        return null;
    }

    /* renamed from: ۟ۥۡۡۨ, reason: not valid java name and contains not printable characters */
    public static int m7424(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((C0067a) obj).E();
        }
        return 0;
    }

    /* renamed from: ۟ۥۣۢۤ, reason: not valid java name and contains not printable characters */
    public static Object m7425(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0011.m2755() >= 0) {
            return com.github.catvod.spider.merge.B0.a.f(obj, (Map.Entry) obj2, (HashMap) obj3, obj4);
        }
        return null;
    }

    /* renamed from: ۟ۥۣۣۤ, reason: not valid java name and contains not printable characters */
    public static String m7426(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((com.github.catvod.spider.merge.I.c) obj).i();
        }
        return null;
    }

    /* renamed from: ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static String m7427() {
        if (C0041.m6823() < 0) {
            return "shouye";
        }
        return null;
    }

    /* renamed from: ۟ۥۥۣۤ, reason: not valid java name and contains not printable characters */
    public static Paint m7428(Object obj) {
        if (C0016.m3596() < 0) {
            return ((C0314C) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7429(Object obj) {
        if (C0023.m4566() < 0) {
            return com.github.catvod.spider.p000mergexbpq.j.o.d((String) obj);
        }
        return false;
    }

    /* renamed from: ۟ۥۣۧۦ, reason: not valid java name and contains not printable characters */
    public static String m7430(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((Parcel) obj).readString();
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static String m7431() {
        if (C0006.m1726() < 0) {
            return "\\]";
        }
        return null;
    }

    /* renamed from: ۟ۦ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m7432(Object obj) {
        if (C0032.m5686() < 0) {
            return ((HBlingDu) obj).gettk();
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static ComponentName m7433(Object obj) {
        if (C0008.m1975() > 0) {
            return ((Activity) obj).getComponentName();
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static r m7434(Object obj, Object obj2) {
        if (C0056.m8886() < 0) {
            return ((r) obj).h((r) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۦۢۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.T0.h m7435(Object obj) {
        if (C0058.m9131() < 0) {
            return ((C0176b) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۦۦۥۥ, reason: not valid java name and contains not printable characters */
    public static void m7436() {
        if (C0014.m3353() < 0) {
            s.f();
        }
    }

    /* renamed from: ۟ۦۦۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7437(Object obj, Object obj2) {
        if (C0059.m9257() < 0) {
            return ((LocaleList) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۦۨۦۨ, reason: not valid java name and contains not printable characters */
    public static StringBuffer m7438(Object obj, float f) {
        if (C0026.m4977() < 0) {
            return ((StringBuffer) obj).append(f);
        }
        return null;
    }

    /* renamed from: ۟ۧ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static String m7439(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0012.m3024() >= 0) {
            return ((Douban) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۧۢۤۤ, reason: not valid java name and contains not printable characters */
    public static void m7440(Object obj, int i) {
        if (C0061.m9359() <= 0) {
            ((TextView) obj).setMinWidth(i);
        }
    }

    /* renamed from: ۣ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static Serializable m7441(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((C0246g) obj).g;
        }
        return null;
    }

    /* renamed from: ۟ۧۥۢ۟, reason: not valid java name and contains not printable characters */
    public static HashMap m7442(Object obj) {
        if (C0031.m5628() > 0) {
            return ((C0266a) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۧۥۥۡ, reason: not valid java name and contains not printable characters */
    public static long m7443(Object obj) {
        if (C0001.m1164() < 0) {
            return ((com.github.catvod.spider.merge.d0.d) obj).i;
        }
        return 0L;
    }

    /* renamed from: ۟ۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m7444(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((P) obj).b;
        }
        return 0;
    }

    /* renamed from: ۠۠۠۠, reason: not valid java name and contains not printable characters */
    public static boolean m7445(Object obj) {
        if (C0054.m8557() < 0) {
            return ((e) obj).g;
        }
        return false;
    }

    /* renamed from: ۠۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7446(Object obj) {
        if (C0035.m6140() < 0) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ۠ۡ۟۠, reason: not valid java name and contains not printable characters */
    public static Pattern m7447(Object obj) {
        if (C0016.m3596() < 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).q0;
        }
        return null;
    }

    /* renamed from: ۣ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static HashMap m7448(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((HBAppfox) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۢۡ۠, reason: not valid java name and contains not printable characters */
    public static void m7449(Object obj, Object obj2) {
        if (C0061.m9359() <= 0) {
            ((com.github.catvod.spider.merge.E.m) obj).m((String) obj2);
        }
    }

    /* renamed from: ۠ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static String m7450(Object obj, Object obj2) {
        if (C0027.m5017() > 0) {
            return com.github.catvod.spider.p000mergexbpq.b0.b.e((Collection) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۥ۟۠, reason: not valid java name and contains not printable characters */
    public static String m7451() {
        if (C0038.m6471() > 0) {
            return "筛选地区名称";
        }
        return null;
    }

    /* renamed from: ۠ۦۡۡ, reason: not valid java name and contains not printable characters */
    public static int m7452(Object obj, int i) {
        if (C0057.m9017() > 0) {
            return ((SparseLongArray) obj).indexOfKey(i);
        }
        return 0;
    }

    /* renamed from: ۠ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static View m7453(Object obj) {
        if (C0001.m1164() < 0) {
            return ((C0406j) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۨۡ۠, reason: not valid java name and contains not printable characters */
    public static ProviderInfo m7454(Object obj, Object obj2, int i) {
        if (C0064.m9659() < 0) {
            return ((PackageManager) obj).resolveContentProvider((String) obj2, i);
        }
        return null;
    }

    /* renamed from: ۡ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static int m7455(Object obj) {
        if (C0023.m4566() < 0) {
            return ((GnssStatus) obj).getSatelliteCount();
        }
        return 0;
    }

    /* renamed from: ۡۢۢۨ, reason: not valid java name and contains not printable characters */
    public static String m7456() {
        if (C0022.m4497() >= 0) {
            return "        <button class=\"episode-card\" data-url=\"http://";
        }
        return null;
    }

    /* renamed from: ۣۡۨۦ, reason: not valid java name and contains not printable characters */
    public static void m7457(Object obj) {
        if (C0039.m6529() <= 0) {
            ((HBmoou) obj).b();
        }
    }

    /* renamed from: ۡۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m7458() {
        if (C0042.m7147() <= 0) {
            return "整页";
        }
        return null;
    }

    /* renamed from: ۡۤۤۡ, reason: not valid java name and contains not printable characters */
    public static JSONArray m7459(Object obj, Object obj2) {
        if (C0009.m2047() >= 0) {
            return ((JSONArray) obj).put(obj2);
        }
        return null;
    }

    /* renamed from: ۣۡۧۨ, reason: not valid java name and contains not printable characters */
    public static String m7460() {
        if (C0058.m9131() <= 0) {
            return "请输入验证码";
        }
        return null;
    }

    /* renamed from: ۡۨۤ۟, reason: not valid java name and contains not printable characters */
    public static void m7461(Object obj, Object obj2) {
        if (C0061.m9359() < 0) {
            ((com.github.catvod.spider.merge.E0.a) obj).b((CharBuffer) obj2);
        }
    }

    /* renamed from: ۣۢۢۨ, reason: not valid java name and contains not printable characters */
    public static p m7462(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.b.a) obj).c;
        }
        return null;
    }

    /* renamed from: ۢۦۥۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.B.h[] m7463() {
        if (C0025.m4797() > 0) {
            return com.github.catvod.spider.merge.B.h.values();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7464(Object obj) {
        if (C0043.m7332() > 0) {
            return ((com.github.catvod.spider.merge.y0.e) obj).isOperator();
        }
        return false;
    }

    /* renamed from: ۣۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Pattern m7465() {
        if (C0033.m5872() > 0) {
            return com.github.catvod.spider.merge.l0.b.e;
        }
        return null;
    }

    /* renamed from: ۣۤ۠, reason: not valid java name and contains not printable characters */
    public static void m7466(Object obj) {
        if (C0033.m5872() >= 0) {
            ((C0254o) obj).r();
        }
    }

    /* renamed from: ۣۧۨۤ, reason: not valid java name and contains not printable characters */
    public static String m7467() {
        if (C0002.m1242() > 0) {
            return "调试->getJsonArray出错：";
        }
        return null;
    }

    /* renamed from: ۣۣۨ۟, reason: not valid java name and contains not printable characters */
    public static Object m7468(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((k) obj).c;
        }
        return null;
    }

    /* renamed from: ۣۨۢۤ, reason: not valid java name and contains not printable characters */
    public static String m7469() {
        if (C0036.m6252() > 0) {
            return "荐";
        }
        return null;
    }

    /* renamed from: ۣۤۡۢ, reason: not valid java name and contains not printable characters */
    public static String m7470(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).Z;
        }
        return null;
    }

    /* renamed from: ۤۢۤۥ, reason: not valid java name and contains not printable characters */
    public static ProgressDialog m7471(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((Market) obj).a;
        }
        return null;
    }

    /* renamed from: ۤۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m7472(Object obj, int i) {
        if (C0030.m5375() > 0) {
            B.a((StringBuilder) obj, i);
        }
    }

    /* renamed from: ۤۤۦۢ, reason: not valid java name and contains not printable characters */
    public static String m7473(Object obj, Object obj2) {
        if (C0020.m4210() < 0) {
            return com.github.catvod.spider.p000mergexbpq.k.g.g((String) obj, (Map) obj2);
        }
        return null;
    }

    /* renamed from: ۤۥۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.F0.r m7474(Object obj, int i) {
        if (C0026.m4977() <= 0) {
            return ((C0144a) obj).a(i);
        }
        return null;
    }

    /* renamed from: ۤۥۧ۠, reason: not valid java name and contains not printable characters */
    public static int m7475(Object obj) {
        if (C0063.m9589() < 0) {
            return ((C0273c) obj).c;
        }
        return 0;
    }

    /* renamed from: ۣۤۧۥ, reason: not valid java name and contains not printable characters */
    public static String m7476(Object obj) {
        if (C0046.m7701() >= 0) {
            return com.github.catvod.spider.merge.a1.c.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static Uri m7477(Object obj) {
        if (C0028.m5152() < 0) {
            return ((Uri.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۥۣ۟ۤ, reason: contains not printable characters */
    public static int m7478(Object obj, int i, Object obj2) {
        if (C0019.m4065() < 0) {
            return ((C0281k) obj).c(i, obj2);
        }
        return 0;
    }

    /* renamed from: ۥۣ۠ۥ, reason: contains not printable characters */
    public static void m7479(Object obj) {
        if (C0049.m8038() <= 0) {
            ((com.github.catvod.spider.merge.l0.c) obj).a();
        }
    }

    /* renamed from: ۥ۠ۨ, reason: contains not printable characters */
    public static int m7480(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۥۤۦۢ, reason: contains not printable characters */
    public static int m7481(Object obj) {
        if (C0064.m9659() < 0) {
            return ((C0154k) obj).b;
        }
        return 0;
    }

    /* renamed from: ۥۥۡۡ, reason: contains not printable characters */
    public static String[] m7482(Object obj) {
        if (m7508() < 0) {
            return ((DateFormatSymbols) obj).getMonths();
        }
        return null;
    }

    /* renamed from: ۥۥۣۧ, reason: contains not printable characters */
    public static byte[] m7483(Object obj, int i) {
        if (C0031.m5628() > 0) {
            return Base64.decode((byte[]) obj, i);
        }
        return null;
    }

    /* renamed from: ۥۧ۠ۡ, reason: contains not printable characters */
    public static String m7484() {
        if (C0064.m9659() < 0) {
            return "sousuoqian";
        }
        return null;
    }

    /* renamed from: ۦ۠۟ۡ, reason: contains not printable characters */
    public static char m7485(Object obj) {
        if (C0013.m3167() > 0) {
            return ((C0174a) obj).l();
        }
        return (char) 0;
    }

    /* renamed from: ۦۣۡ۟, reason: contains not printable characters */
    public static Pattern m7486() {
        if (C0043.m7332() > 0) {
            return Ali.a;
        }
        return null;
    }

    /* renamed from: ۦۣۢ۟, reason: contains not printable characters */
    public static Pattern m7487(Object obj) {
        if (C0023.m4566() < 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).d0;
        }
        return null;
    }

    /* renamed from: ۦۣۣۦ, reason: contains not printable characters */
    public static String m7488(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((NG.Rst) obj).getMsg();
        }
        return null;
    }

    /* renamed from: ۦۥ۟ۥ, reason: contains not printable characters */
    public static Object m7489(Object obj) {
        if (C0026.m4977() < 0) {
            return ((l) obj).c;
        }
        return null;
    }

    /* renamed from: ۦۦ۟ۡ, reason: contains not printable characters */
    public static int m7490(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((RunnableC0244e) obj).a;
        }
        return 0;
    }

    /* renamed from: ۦۦۦ۟, reason: contains not printable characters */
    public static HashMap m7491() {
        if (C0028.m5152() < 0) {
            return BilibiliLive.c();
        }
        return null;
    }

    /* renamed from: ۦۨۨۢ, reason: contains not printable characters */
    public static ClassLoader m7492(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((com.github.catvod.spider.merge.e1.c) obj).a;
        }
        return null;
    }

    /* renamed from: ۧۡۢۤ, reason: not valid java name and contains not printable characters */
    public static testActivity m7493(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((com.github.catvod.spider.merge.T.c) obj).b;
        }
        return null;
    }

    /* renamed from: ۧۡۢۦ, reason: not valid java name and contains not printable characters */
    public static String m7494(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((i) obj).a;
        }
        return null;
    }

    /* renamed from: ۧۢ, reason: not valid java name and contains not printable characters */
    public static void m7495(Object obj) {
        if (C0035.m6140() < 0) {
            ((j) obj).h();
        }
    }

    /* renamed from: ۣۧۢ۠, reason: not valid java name and contains not printable characters */
    public static String m7496() {
        if (C0039.m6529() <= 0) {
            return ">超清<";
        }
        return null;
    }

    /* renamed from: ۧۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String[] m7497(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((HBcms10Dou) obj).c;
        }
        return null;
    }

    /* renamed from: ۣۣۧۢ, reason: not valid java name and contains not printable characters */
    public static void m7498(Object obj, Object obj2, int i) {
        if (C0008.m1975() > 0) {
            ((A) obj).b((StringBuilder) obj2, i);
        }
    }

    /* renamed from: ۧۢۥۢ, reason: not valid java name and contains not printable characters */
    public static void m7499(Object obj, Object obj2, Object obj3, Object obj4) throws KeyManagementException {
        if (C0007.m1886() >= 0) {
            ((SSLContext) obj).init((KeyManager[]) obj2, (TrustManager[]) obj3, (SecureRandom) obj4);
        }
    }

    /* renamed from: ۧۥۡۢ, reason: not valid java name and contains not printable characters */
    public static WindowInsets.Builder m7500(Object obj, Object obj2) {
        if (C0053.m8389() >= 0) {
            return ((WindowInsets.Builder) obj).setTappableElementInsets((Insets) obj2);
        }
        return null;
    }

    /* renamed from: ۧۦۣۣ, reason: not valid java name and contains not printable characters */
    public static Pattern m7501() {
        if (C0018.m3956() > 0) {
            return com.github.catvod.spider.merge.g0.g.b;
        }
        return null;
    }

    /* renamed from: ۧۧۢ, reason: not valid java name and contains not printable characters */
    public static C0147d m7502(Object obj) {
        if (C0025.m4797() > 0) {
            return ((com.github.catvod.spider.merge.H0.a) obj).d;
        }
        return null;
    }

    /* renamed from: ۨ۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m7503(Object obj) {
        if (C0029.m5282() >= 0) {
            ((com.github.catvod.spider.merge.N.b) obj).a();
        }
    }

    /* renamed from: ۣۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m7504() {
        if (C0020.m4210() < 0) {
            return "^";
        }
        return null;
    }

    /* renamed from: ۨ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m7505(int i, int i2) {
        if (C0052.m8320() > 0) {
            return com.github.catvod.spider.p000mergexbpq.N.a.b(i, i2);
        }
        return 0;
    }

    /* renamed from: ۨ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static void m7506(Object obj, Object obj2) {
        if (C0052.m8320() >= 0) {
            i.a((i) obj, (ArrayList) obj2);
        }
    }

    /* renamed from: ۨۢۧۧ, reason: not valid java name and contains not printable characters */
    public static List m7507(Object obj) {
        if (C0059.m9257() <= 0) {
            return Collections.synchronizedList((List) obj);
        }
        return null;
    }

    /* renamed from: ۣۨۧۥ, reason: not valid java name and contains not printable characters */
    public static int m7508() {
        return (-985) ^ C0016.f368;
    }

    /* renamed from: ۨۦۥۢ, reason: not valid java name and contains not printable characters */
    public static String m7510(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((WebView) obj).getUrl();
        }
        return null;
    }

    /* renamed from: ۨۦۦۣ, reason: not valid java name and contains not printable characters */
    public static char m7511(Object obj, int i) {
        if (C0039.m6529() <= 0) {
            return ((CharSequence) obj).charAt(i);
        }
        return (char) 0;
    }

    /* renamed from: ۨۦۧۦ, reason: not valid java name and contains not printable characters */
    public static String m7512(String str) {
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
        String str3 = "a";
        while (str3.length() > 0) {
            str3 = "";
            if ("".length() == 0) {
                str3 = "a";
            }
        }
        int length = str3.length();
        int length2 = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۣۨۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m7513(Object obj, Object obj2) {
        if (C0063.m9589() <= 0) {
            return ((com.github.catvod.spider.merge.X0.c) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۨۨۢۢ, reason: not valid java name and contains not printable characters */
    public static float m7514(Object obj) {
        if (C0039.m6529() < 0) {
            return ((com.github.catvod.spider.merge.A.a) obj).b;
        }
        return 0.0f;
    }

    /* renamed from: ۨۥۧ۟, reason: not valid java name and contains not printable characters */
    public static String m7509(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}