package com.github.catvod.spider.p000mergexbpq.c;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Region;
import android.graphics.drawable.GradientDrawable;
import android.text.PrecomputedText;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.util.Predicate;
import com.github.catvod.spider.Baidu;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Cloud;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.DianYingYunJi;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.HBgetapp;
import com.github.catvod.spider.HBleiJing;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.W55Movie;
import com.github.catvod.spider.Wogg;
import com.github.catvod.spider.merge.B.l;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E0.a;
import com.github.catvod.spider.merge.E0.d;
import com.github.catvod.spider.merge.E0.k;
import com.github.catvod.spider.merge.E0.o;
import com.github.catvod.spider.merge.F0.AbstractC0151h;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.InterfaceC0167y;
import com.github.catvod.spider.merge.F0.T;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I.c;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.M.b;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.m;
import com.github.catvod.spider.merge.P0.y;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.i;
import com.github.catvod.spider.merge.U0.B;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.I;
import com.github.catvod.spider.merge.U0.M;
import com.github.catvod.spider.merge.U0.N;
import com.github.catvod.spider.merge.U0.P;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0228d;
import com.github.catvod.spider.merge.W.n;
import com.github.catvod.spider.merge.W.s;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.X0.r;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnClickListenerC0257s;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0277g;
import com.github.catvod.spider.merge.e.C0279i;
import com.github.catvod.spider.merge.e.C0281k;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f0.C0300c;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.e;
import com.github.catvod.spider.merge.g0.g;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.DialogInterfaceOnClickListenerC0318G;
import com.github.catvod.spider.merge.h0.DialogInterfaceOnClickListenerC0329i;
import com.github.catvod.spider.merge.h0.ViewOnFocusChangeListenerC0326f;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.p0.C0358a;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.AbstractC0376b;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.f;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.U.h;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.p;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.CharBuffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge-xbpq.c.ۥ۠ۢۨ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0009 {

    /* renamed from: ۡۢۢۤ, reason: not valid java name and contains not printable characters */
    public static int f178 = -149;

    /* renamed from: ۟۟۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m2035(Object obj, Object obj2, boolean z) {
        if (C0033.m5872() > 0) {
            return ((SharedPreferences.Editor) obj).putBoolean((String) obj2, z);
        }
        return null;
    }

    /* renamed from: ۟۟۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static String m2036() {
        if (C0048.m7971() >= 0) {
            return "\\d+";
        }
        return null;
    }

    /* renamed from: ۟۟ۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m2038() {
        if (C0052.m8320() >= 0) {
            return e.r();
        }
        return null;
    }

    /* renamed from: ۟۟ۢۧۨ, reason: not valid java name and contains not printable characters */
    public static String m2039() {
        if (C0053.m8389() >= 0) {
            return "vod_area";
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m2040(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((C0335o) obj).e;
        }
        return null;
    }

    /* renamed from: ۟۟ۥۡۤ, reason: not valid java name and contains not printable characters */
    public static void m2041(Object obj, Object obj2) {
        if (C0039.m6529() <= 0) {
            ((InterfaceC0167y) obj).a((k) obj2);
        }
    }

    /* renamed from: ۟۟ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static String m2042() {
        if (C0048.m7971() > 0) {
            return "dtArea";
        }
        return null;
    }

    /* renamed from: ۟۟ۥۤ۟, reason: not valid java name and contains not printable characters */
    public static List m2043(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((W) obj).i;
        }
        return null;
    }

    /* renamed from: ۟۟ۦۥۨ, reason: not valid java name and contains not printable characters */
    public static void m2044(Object obj, Object obj2) {
        if (C0013.m3167() >= 0) {
            ((a) obj).a((CharBuffer) obj2);
        }
    }

    /* renamed from: ۟۟ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static void m2045(Object obj) {
        if (C0010.m2320() <= 0) {
            s.c((Activity) obj);
        }
    }

    /* renamed from: ۟۠ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static CharSequence m2046(Object obj) {
        if (C0036.m6252() > 0) {
            return ((AccessibilityNodeInfo) obj).getHintText();
        }
        return null;
    }

    /* renamed from: ۟۠ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static int m2047() {
        return 2 ^ C0010.f195;
    }

    /* renamed from: ۣ۟۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static Class m2048(Object obj, Object obj2) {
        if (C0045.m7538() < 0) {
            return ((com.github.catvod.spider.merge.C.a) obj).b((Class) obj2);
        }
        return null;
    }

    /* renamed from: ۟۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static GradientDrawable m2049(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((ViewOnFocusChangeListenerC0326f) obj).c;
        }
        return null;
    }

    /* renamed from: ۟۠ۨۤۡ, reason: not valid java name and contains not printable characters */
    public static String m2050() {
        if (C0000.m1116() < 0) {
            return ".username";
        }
        return null;
    }

    /* renamed from: ۟۠ۨۨ۠, reason: not valid java name and contains not printable characters */
    public static List m2051(Object obj) {
        if (C0000.m1116() < 0) {
            return b.a((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m2052(Object obj, Object obj2) {
        if (C0020.m4210() < 0) {
            ((TextView) obj).setHint((CharSequence) obj2);
        }
    }

    /* renamed from: ۟ۡۢۡۤ, reason: not valid java name and contains not printable characters */
    public static void m2053(Object obj, int i, Object obj2) {
        if (C0064.m9659() < 0) {
            ((com.github.catvod.spider.p000mergexbpq.R.b) obj).c(i, (com.github.catvod.spider.p000mergexbpq.R.e) obj2);
        }
    }

    /* renamed from: ۣ۟ۡۢۨ, reason: not valid java name and contains not printable characters */
    public static String m2054(Object obj, Object obj2, Object obj3) {
        if (C0054.m8557() <= 0) {
            return ((JSONObject) obj).optString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2055(Object obj, Object obj2) {
        if (C0028.m5152() < 0) {
            return ((i) obj).A((String) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۡۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m2056(Object obj) {
        if (C0061.m9359() <= 0) {
            return g.r((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۡۧۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2057(Object obj, Object obj2, Object obj3) {
        if (C0035.m6140() < 0) {
            return ((B) obj).c((N) obj2, (C0176b) obj3);
        }
        return false;
    }

    /* renamed from: ۟ۢ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2058(Object obj) {
        if (C0043.m7332() > 0) {
            return ((com.github.catvod.spider.merge.X.a) obj).e;
        }
        return false;
    }

    /* renamed from: ۟ۢ۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static p m2059(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.b.i) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۢۢۤۨ, reason: not valid java name and contains not printable characters */
    public static int m2060(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((a) obj).e;
        }
        return 0;
    }

    /* renamed from: ۟ۢۤۢۤ, reason: not valid java name and contains not printable characters */
    public static String m2061(Object obj) {
        if (C0001.m1164() < 0) {
            return ((com.github.catvod.spider.merge.N.a) obj).toString();
        }
        return null;
    }

    /* renamed from: ۟ۢۤۨۥ, reason: not valid java name and contains not printable characters */
    public static Display m2062(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((WindowManager) obj).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: ۟ۢۦۣۧ, reason: not valid java name and contains not printable characters */
    public static String m2063() {
        if (C0002.m1242() > 0) {
            return "searchContent(key=";
        }
        return null;
    }

    /* renamed from: ۟ۢۨ۟, reason: not valid java name and contains not printable characters */
    public static d m2064(Object obj) {
        if (C0031.m5628() > 0) {
            return ((r) obj).e;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static LinkedList[] m2065(Object obj) {
        if (C0039.m6529() < 0) {
            return ((T) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m2066(Object obj, Object obj2) {
        if (C0049.m8038() < 0) {
            return Bili.a((c) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m2067(Object obj, Object obj2) {
        if (C0061.m9359() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.c) obj).j((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static void m2068(Object obj, Object obj2) {
        if (C0020.m4210() <= 0) {
            p.b((p) obj, (com.github.catvod.spider.p000mergexbpq.d.c) obj2);
        }
    }

    /* renamed from: ۣۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static String m2069(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((com.github.catvod.spider.merge.L.b) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۦۦ, reason: not valid java name and contains not printable characters */
    public static String m2070(Object obj) {
        if (C0031.m5628() > 0) {
            return ((Config) obj).g;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۡۧ, reason: not valid java name and contains not printable characters */
    public static String m2071(Object obj) {
        if (C0056.m8886() < 0) {
            return ((com.github.catvod.spider.merge.g1.c) obj).b();
        }
        return null;
    }

    /* renamed from: ۟ۤۡۤۤ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m2072(Object obj) {
        if (C0035.m6140() < 0) {
            return ((I) obj).e;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m2073(Object obj) {
        if (C0037.m6350() < 0) {
            return ((l) obj).d;
        }
        return 0;
    }

    /* renamed from: ۟ۤۥۤ۟, reason: not valid java name and contains not printable characters */
    public static String m2074() {
        if (C0052.m8320() >= 0) {
            return "21";
        }
        return null;
    }

    /* renamed from: ۟ۤۥۧۨ, reason: not valid java name and contains not printable characters */
    public static int m2075(Object obj) {
        if (C0033.m5872() > 0) {
            return ((f) obj).f;
        }
        return 0;
    }

    /* renamed from: ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m2076(Object obj) {
        if (C0058.m9131() < 0) {
            return ((C0246g) obj).g();
        }
        return null;
    }

    /* renamed from: ۟ۤۦۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m2077(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((View) obj).willNotDraw();
        }
        return false;
    }

    /* renamed from: ۟ۤۦۦۣ, reason: not valid java name and contains not printable characters */
    public static C0335o m2078(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((DialogInterfaceOnClickListenerC0329i) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥ۟۠۟, reason: not valid java name and contains not printable characters */
    public static void m2079(Object obj, Object obj2) {
        if (C0055.m8740() >= 0) {
            ((C0176b) obj).x((com.github.catvod.spider.merge.T0.r) obj2);
        }
    }

    /* renamed from: ۟ۥ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static String m2080() {
        if (C0055.m8740() > 0) {
            return n.b;
        }
        return null;
    }

    /* renamed from: ۟ۥۣۡۨ, reason: not valid java name and contains not printable characters */
    public static String m2081(Object obj) {
        if (C0058.m9131() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.c) obj).e();
        }
        return null;
    }

    /* renamed from: ۟ۥۨ۠۟, reason: not valid java name and contains not printable characters */
    public static String m2082() {
        if (C0014.m3353() <= 0) {
            return "<div class=\"episode-section\">    <div class=\"section-title\">\n        <span>";
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m2083(Object obj) {
        if (C0017.m3633() < 0) {
            return g.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۢۥۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2084(Object obj) {
        if (C0002.m1242() > 0) {
            return h.c((CharSequence) obj);
        }
        return false;
    }

    /* renamed from: ۟ۦۤۧۧ, reason: not valid java name and contains not printable characters */
    public static int[] m2085(Object obj) {
        if (C0037.m6350() < 0) {
            return ((com.github.catvod.spider.merge.H0.d) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۦۥۤۡ, reason: not valid java name and contains not printable characters */
    public static String m2086(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((com.github.catvod.spider.merge.F.h) obj).c();
        }
        return null;
    }

    /* renamed from: ۟ۦۦۦ, reason: not valid java name and contains not printable characters */
    public static String m2087(Object obj) {
        if (C0042.m7147() < 0) {
            return ((P) obj).o;
        }
        return null;
    }

    /* renamed from: ۟ۦۦۦ۟, reason: not valid java name and contains not printable characters */
    public static Object m2088(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((C0279i) obj).getKey();
        }
        return null;
    }

    /* renamed from: ۟ۧ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static HBleiJing m2089(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((com.github.catvod.spider.merge.b0.g) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۧۢۢۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m2090() {
        if (C0041.m6823() <= 0) {
            return W55Movie.a();
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۧۢ, reason: not valid java name and contains not printable characters */
    public static HashMap m2091(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((m) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۥۤ, reason: not valid java name and contains not printable characters */
    public static String m2092() {
        if (C0021.m4379() >= 0) {
            return "\">\n\n      <div class=\"movie-tag platform360\">\n        ";
        }
        return null;
    }

    /* renamed from: ۟ۧۥۣۢ, reason: not valid java name and contains not printable characters */
    public static List m2093(Object obj) {
        if (C0056.m8886() < 0) {
            return ((ExecutorService) obj).shutdownNow();
        }
        return null;
    }

    /* renamed from: ۟ۧۥۧۨ, reason: not valid java name and contains not printable characters */
    public static f m2094(Object obj) {
        if (C0044.m7508() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.R.e) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۧۦۣۨ, reason: not valid java name and contains not printable characters */
    public static int m2095(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((AbstractCollection) obj).size();
        }
        return 0;
    }

    /* renamed from: ۠ۡۤ۟, reason: not valid java name and contains not printable characters */
    public static String m2096(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((HBgetapp) obj).c;
        }
        return null;
    }

    /* renamed from: ۠ۡۧۧ, reason: not valid java name and contains not printable characters */
    public static SeekBar m2097(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((C0228d) obj).a;
        }
        return null;
    }

    /* renamed from: ۠ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static void m2098(Object obj, int i) {
        if (C0037.m6350() <= 0) {
            ((View) obj).setId(i);
        }
    }

    /* renamed from: ۠ۥۦۣ, reason: not valid java name and contains not printable characters */
    public static long m2099() {
        if (C0012.m3024() > 0) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    /* renamed from: ۠ۥۨ۠, reason: not valid java name and contains not printable characters */
    public static int m2100(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((DialogInterfaceOnClickListenerC0318G) obj).a;
        }
        return 0;
    }

    /* renamed from: ۡ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static List m2101(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((b) obj).b();
        }
        return null;
    }

    /* renamed from: ۡ۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E.m m2102(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((com.github.catvod.spider.merge.J.c) obj).b();
        }
        return null;
    }

    /* renamed from: ۡۥۨ, reason: not valid java name and contains not printable characters */
    public static String m2103() {
        if (C0007.m1886() >= 0) {
            return "(.*),.*";
        }
        return null;
    }

    /* renamed from: ۢ۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m2104(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0054.m8557() < 0) {
            FishHxq.a((LinkedHashMap) obj, (String) obj2, (ArrayList) obj3, (ArrayList) obj4);
        }
    }

    /* renamed from: ۢۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m2105(Object obj) {
        if (C0000.m1116() < 0) {
            return ((PrecomputedText.Params) obj).getHyphenationFrequency();
        }
        return 0;
    }

    /* renamed from: ۣۢ۟, reason: not valid java name and contains not printable characters */
    public static void m2106(Object obj) {
        if (C0042.m7147() <= 0) {
            ((ConcurrentHashMap) obj).clear();
        }
    }

    /* renamed from: ۢۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m2107(Object obj) {
        if (C0016.m3596() < 0) {
            ((com.github.catvod.spider.merge.Y0.b) obj).g();
        }
    }

    /* renamed from: ۢۥۨۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2108(Object obj) {
        if (m2047() >= 0) {
            return ((y) obj).a;
        }
        return false;
    }

    /* renamed from: ۣۣۤۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m2109() {
        if (C0001.m1164() < 0) {
            return com.github.catvod.spider.merge.K0.a.k;
        }
        return null;
    }

    /* renamed from: ۣۥۣۧ, reason: not valid java name and contains not printable characters */
    public static String m2110() {
        if (C0004.m1557() <= 0) {
            return "</span>\n            <div style=\"position: absolute; top: 0; left: 0; right: 0; bottom: 0; background: linear-gradient(45deg, transparent 30%, rgba(255, 255, 255, 0.1) 50%, transparent 70%); transform: translateX(-100%); transition: transform 0.6s ease;\"></div>\n        </div>\n        <div class=\"episode-container\" id=\"episodeContainer\">\n";
        }
        return null;
    }

    /* renamed from: ۣۦۦ, reason: not valid java name and contains not printable characters */
    public static String m2111(Object obj) {
        if (C0052.m8320() > 0) {
            return W.m((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۧۧۤ, reason: not valid java name and contains not printable characters */
    public static void m2112(Object obj, Object obj2) {
        if (C0002.m1242() >= 0) {
            ((View) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* renamed from: ۣۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static WindowInsets.Builder m2113(Object obj, Object obj2) {
        if (C0017.m3633() <= 0) {
            return ((WindowInsets.Builder) obj).setSystemGestureInsets((Insets) obj2);
        }
        return null;
    }

    /* renamed from: ۤۡۢ۟, reason: not valid java name and contains not printable characters */
    public static void m2114(Object obj, int i) {
        if (C0054.m8557() < 0) {
            ((Paint) obj).setAlpha(i);
        }
    }

    /* renamed from: ۤۢۡۧ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo m2115(Object obj, Object obj2) {
        if (C0027.m5017() >= 0) {
            return ((AccessibilityNodeInfo.TouchDelegateInfo) obj).getTargetForRegion((Region) obj2);
        }
        return null;
    }

    /* renamed from: ۤۧۨۢ, reason: not valid java name and contains not printable characters */
    public static String m2116() {
        if (C0019.m4065() < 0) {
            return "c";
        }
        return null;
    }

    /* renamed from: ۤۨۥۦ, reason: not valid java name and contains not printable characters */
    public static Predicate m2117(Object obj) {
        if (C0064.m9659() < 0) {
            return AbstractC0376b.b((Predicate) obj);
        }
        return null;
    }

    /* renamed from: ۥ۟ۢۡ, reason: contains not printable characters */
    public static void m2118(Object obj, Object obj2) {
        if (C0007.m1886() > 0) {
            ((Market) obj).b((String) obj2);
        }
    }

    /* renamed from: ۥ۠ۥۨ, reason: contains not printable characters */
    public static int m2119(Object obj) {
        if (C0007.m1886() > 0) {
            return ((C0277g) obj).b;
        }
        return 0;
    }

    /* renamed from: ۥۢ۟ۡ, reason: contains not printable characters */
    public static String m2120(Object obj) {
        if (C0025.m4797() > 0) {
            return ((com.github.catvod.spider.merge.U.e) obj).a;
        }
        return null;
    }

    /* renamed from: ۥۣۢۢ, reason: contains not printable characters */
    public static int m2121(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((com.github.catvod.spider.merge.C.b) obj).g;
        }
        return 0;
    }

    /* renamed from: ۥۣۤ۠, reason: contains not printable characters */
    public static String m2122() {
        if (C0032.m5686() <= 0) {
            return "h";
        }
        return null;
    }

    /* renamed from: ۥۣۤۢ, reason: contains not printable characters */
    public static void m2123(Object obj, Object obj2) {
        if (C0023.m4566() <= 0) {
            ((C0148e) obj).b((AbstractC0151h) obj2);
        }
    }

    /* renamed from: ۥۦۣ۠, reason: contains not printable characters */
    public static Object m2124(Object obj) {
        if (C0012.m3024() > 0) {
            return ((DialogInterfaceOnClickListenerC0257s) obj).d;
        }
        return null;
    }

    /* renamed from: ۥۦۢۡ, reason: contains not printable characters */
    public static String m2125(String str) {
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

    /* renamed from: ۥۧ۠ۦ, reason: contains not printable characters */
    public static Object[] m2126(Object obj) {
        if (C0022.m4497() > 0) {
            return ((C0281k) obj).b;
        }
        return null;
    }

    /* renamed from: ۦۡ۠ۧ, reason: contains not printable characters */
    public static String[] m2127(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((com.github.catvod.spider.merge.Z.f) obj).b;
        }
        return null;
    }

    /* renamed from: ۦۡۤۤ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.T0.n m2128(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((com.github.catvod.spider.merge.T0.g) obj).a;
        }
        return null;
    }

    /* renamed from: ۦۦ۠ۦ, reason: contains not printable characters */
    public static int m2129(Object obj) {
        if (C0043.m7332() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.b.i) obj).c;
        }
        return 0;
    }

    /* renamed from: ۦۦۣ۠, reason: contains not printable characters */
    public static int m2130(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۦۧۡۢ, reason: contains not printable characters */
    public static int m2131(Object obj) {
        if (C0049.m8038() < 0) {
            return ((C0300c) obj).b;
        }
        return 0;
    }

    /* renamed from: ۦۧۧۦ, reason: contains not printable characters */
    public static void m2132(Object obj, int i) {
        if (C0015.m3433() > 0) {
            ((ImageView) obj).setColorFilter(i);
        }
    }

    /* renamed from: ۦۨۥۤ, reason: contains not printable characters */
    public static Baidu m2133(Object obj) {
        if (C0046.m7701() >= 0) {
            return ((Cloud) obj).d;
        }
        return null;
    }

    /* renamed from: ۦۨۦۣ, reason: contains not printable characters */
    public static String m2134(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((Wogg) obj).g;
        }
        return null;
    }

    /* renamed from: ۦۨۦۤ, reason: contains not printable characters */
    public static void m2135(Object obj, int i) {
        if (C0031.m5628() > 0) {
            ((BufferedInputStream) obj).mark(i);
        }
    }

    /* renamed from: ۣۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Object m2136(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((C0358a) obj).b;
        }
        return null;
    }

    /* renamed from: ۧۡ۠۟, reason: not valid java name and contains not printable characters */
    public static String m2137() {
        if (C0018.m3956() > 0) {
            return "_ua";
        }
        return null;
    }

    /* renamed from: ۧۥۥۨ, reason: not valid java name and contains not printable characters */
    public static void m2138(Object obj) {
        if (C0028.m5152() <= 0) {
            ((A) obj).E();
        }
    }

    /* renamed from: ۧۦۨ, reason: not valid java name and contains not printable characters */
    public static int m2139(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((ArrayList) obj).size();
        }
        return 0;
    }

    /* renamed from: ۧۧۢۡ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.H0.d m2140(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((o) obj).f;
        }
        return null;
    }

    /* renamed from: ۨۡۡ۟, reason: not valid java name and contains not printable characters */
    public static void m2141(Object obj, Object obj2) {
        if (C0015.m3433() >= 0) {
            ((M) obj).n((String) obj2);
        }
    }

    /* renamed from: ۨۦۣ۟, reason: not valid java name and contains not printable characters */
    public static String m2142(Object obj) {
        if (C0027.m5017() > 0) {
            return DianYingYunJi.c((String) obj);
        }
        return null;
    }

    /* renamed from: ۨۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m2143(Object obj, Object obj2) {
        if (C0012.m3024() >= 0) {
            ((com.github.catvod.spider.merge.U.m) obj).c((Map) obj2);
        }
    }

    /* renamed from: ۣ۟۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m2037(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}