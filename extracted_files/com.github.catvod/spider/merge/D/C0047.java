package com.github.catvod.spider.merge.d;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.pm.ShortcutManager;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Process;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.github.catvod.spider.Cloud;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.HBT4;
import com.github.catvod.spider.HBcms10Dou;
import com.github.catvod.spider.HBgetappapi;
import com.github.catvod.spider.HBqiJi;
import com.github.catvod.spider.Jianpian;
import com.github.catvod.spider.KuaKeBa;
import com.github.catvod.spider.Tianyi;
import com.github.catvod.spider.XBPQ;
import com.github.catvod.spider.Youku;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.AbstractC0152i;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0145b;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.C0150g;
import com.github.catvod.spider.merge.F0.Q;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.G.f;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.C0171c;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.N;
import com.github.catvod.spider.merge.U0.O;
import com.github.catvod.spider.merge.U0.P;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.Z0.j;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0253n;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnDismissListenerC0243d;
import com.github.catvod.spider.merge.a0.L;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.a1.g;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.b0.n;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0271a;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.e0.RunnableC0282a;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0300c;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.h0.DialogInterfaceOnClickListenerC0338s;
import com.github.catvod.spider.merge.h0.x;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.q0.AbstractC0362a;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.y0.InterfaceC0416b;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.l0;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.p;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.net.SocketAddress;
import java.security.SecureRandom;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import javax.net.ssl.SSLParameters;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.d.ۣۣۧۤ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0047 {

    /* renamed from: ۟ۢۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int f763 = -389;

    /* renamed from: ۟۟ۥۧۤ, reason: not valid java name and contains not printable characters */
    public static String m7742() {
        if (C0045.m7538() < 0) {
            return g.a();
        }
        return null;
    }

    /* renamed from: ۟۟ۥۨۦ, reason: not valid java name and contains not printable characters */
    public static JSONObject m7743(Object obj, Object obj2, Object obj3) {
        if (C0034.m6048() < 0) {
            return ((JSONObject) obj).put((String) obj2, obj3);
        }
        return null;
    }

    /* renamed from: ۟۟ۦۥۧ, reason: not valid java name and contains not printable characters */
    public static String m7744(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((com.github.catvod.spider.merge.Y0.b) obj).e();
        }
        return null;
    }

    /* renamed from: ۟۟ۨۡ۠, reason: not valid java name and contains not printable characters */
    public static Object m7745(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((Stack) obj).pop();
        }
        return null;
    }

    /* renamed from: ۟۟ۨۤۡ, reason: not valid java name and contains not printable characters */
    public static String m7746(Object obj) {
        if (C0050.m8121() < 0) {
            return com.github.catvod.spider.merge.U.c.a((String) obj);
        }
        return null;
    }

    /* renamed from: ۟۠۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m7747(Object obj, Object obj2) {
        if (C0024.m4693() < 0) {
            ((com.github.catvod.spider.p000mergexbpq.c0.c) obj).e((com.github.catvod.spider.p000mergexbpq.c0.c) obj2);
        }
    }

    /* renamed from: ۟۠ۢۢۦ, reason: not valid java name and contains not printable characters */
    public static String m7748() {
        if (C0038.m6471() > 0) {
            return "简";
        }
        return null;
    }

    /* renamed from: ۟۠ۢۦۤ, reason: not valid java name and contains not printable characters */
    public static String m7749() {
        if (C0043.m7332() > 0) {
            return "J";
        }
        return null;
    }

    /* renamed from: ۟۠ۢۦۥ, reason: not valid java name and contains not printable characters */
    public static HashMap m7750() {
        if (C0060.m9355() > 0) {
            return HBT4.a();
        }
        return null;
    }

    /* renamed from: ۟۠ۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m7751() {
        if (C0056.m8886() < 0) {
            return ".*电脑#";
        }
        return null;
    }

    /* renamed from: ۟۠ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static Date m7752(Object obj, Object obj2) {
        if (C0024.m4693() <= 0) {
            return ((C0171c) obj).b((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static float m7753(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((C0288g) obj).h;
        }
        return 0.0f;
    }

    /* renamed from: ۣ۟ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m7754(Object obj) {
        if (C0011.m2755() > 0) {
            return ((com.github.catvod.spider.merge.I.c) obj).c();
        }
        return null;
    }

    /* renamed from: ۟ۡۢۦۢ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m7755() {
        if (C0022.m4497() > 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        }
        return null;
    }

    /* renamed from: ۟ۡۢۧۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.q0.d m7756() {
        if (C0001.m1164() <= 0) {
            return com.github.catvod.spider.merge.q0.d.a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۥۣ, reason: not valid java name and contains not printable characters */
    public static void m7757(Object obj, Object obj2) {
        if (m7837() >= 0) {
            ((View) obj).setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) obj2);
        }
    }

    /* renamed from: ۟ۡۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m7758(Object obj) {
        if (C0039.m6529() < 0) {
            return ((Jianpian) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۡۦۦۤ, reason: not valid java name and contains not printable characters */
    public static void m7759(Object obj) {
        if (C0017.m3633() <= 0) {
            ((ShortcutManager) obj).removeAllDynamicShortcuts();
        }
    }

    /* renamed from: ۣ۟ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m7760() {
        if (C0046.m7701() >= 0) {
            return "电视剧";
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static Class m7761(Object obj) {
        if (C0003.m1463() < 0) {
            return ((com.github.catvod.spider.merge.w0.d) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m7762(Object obj) {
        if (C0031.m5628() > 0) {
            return ((O) obj).b();
        }
        return null;
    }

    /* renamed from: ۟ۢۡۦ۠, reason: not valid java name and contains not printable characters */
    public static String m7763(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((StringBuilder) obj).toString();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۥ۟, reason: not valid java name and contains not printable characters */
    public static int m7764(Object obj) {
        if (C0040.m6582() > 0) {
            return ((C0174a) obj).g;
        }
        return 0;
    }

    /* renamed from: ۟ۢۦۡۧ, reason: not valid java name and contains not printable characters */
    public static void m7765(Object obj, Object obj2) {
        if (C0061.m9359() <= 0) {
            ((SSLParameters) obj).setApplicationProtocols((String[]) obj2);
        }
    }

    /* renamed from: ۣ۟ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static String m7766() {
        if (C0035.m6140() < 0) {
            return "{letter}";
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static JSONObject m7767(Object obj, Object obj2, Object obj3) {
        if (C0010.m2320() <= 0) {
            return ((FishHxq) obj).p((String) obj2, (JSONObject) obj3);
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7768(Object obj, boolean z) {
        if (C0055.m8740() > 0) {
            return ((com.github.catvod.spider.merge.G.c) obj).i(z);
        }
        return false;
    }

    /* renamed from: ۣۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7769(Object obj) {
        if (C0043.m7332() > 0) {
            return ((AccessibilityNodeInfo) obj).isScreenReaderFocusable();
        }
        return false;
    }

    /* renamed from: ۣ۟ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m7770() {
        if (C0020.m4210() < 0) {
            return "@";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static String m7771() {
        if (C0007.m1886() > 0) {
            return "UserAgent";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۦۥ, reason: not valid java name and contains not printable characters */
    public static Set m7772(Object obj) {
        if (C0021.m4379() > 0) {
            return ((WeakHashMap) obj).keySet();
        }
        return null;
    }

    /* renamed from: ۟ۤ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static String m7773(Object obj) {
        if (C0011.m2755() > 0) {
            return ((C0233B) obj).l;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static N m7774(Object obj) {
        if (C0057.m9017() > 0) {
            return ((P) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۤ۠۟۟, reason: not valid java name and contains not printable characters */
    public static l0 m7775(Object obj, Object obj2) {
        if (C0013.m3167() > 0) {
            return l0.b((l0) obj, (l0) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۢ۠ۤ, reason: not valid java name and contains not printable characters */
    public static C0340u m7776(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((DialogInterfaceOnClickListenerC0338s) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static Class m7777(Object obj) {
        if (C0022.m4497() >= 0) {
            return obj.getClass();
        }
        return null;
    }

    /* renamed from: ۟ۤۤۤ۠, reason: not valid java name and contains not printable characters */
    public static String m7778(Object obj) {
        if (C0064.m9659() < 0) {
            return ((f) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۥۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m7779(Object obj) {
        if (m7837() > 0) {
            ((M) obj).l();
        }
    }

    /* renamed from: ۟ۥۣۡ۠, reason: not valid java name and contains not printable characters */
    public static String m7780() {
        if (C0011.m2755() > 0) {
            return "getFilterData()错误-->";
        }
        return null;
    }

    /* renamed from: ۟ۥۣۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7781(Object obj, Object obj2) {
        if (C0005.m1599() <= 0) {
            return ((Handler) obj).post((Runnable) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۥۤ۟ۦ, reason: not valid java name and contains not printable characters */
    public static Paint.Style m7782() {
        if (C0036.m6252() >= 0) {
            return Paint.Style.FILL;
        }
        return null;
    }

    /* renamed from: ۟ۥۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m7783(Object obj) {
        if (C0061.m9359() <= 0) {
            return com.github.catvod.spider.merge.E.g.u((List) obj);
        }
        return null;
    }

    /* renamed from: ۟ۥۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m7784() {
        if (C0012.m3024() >= 0) {
            return "search_url";
        }
        return null;
    }

    /* renamed from: ۟ۥۥۢۥ, reason: not valid java name and contains not printable characters */
    public static String m7785() {
        if (C0015.m3433() >= 0) {
            return XBPQ.K;
        }
        return null;
    }

    /* renamed from: ۟ۥۨۡ۟, reason: not valid java name and contains not printable characters */
    public static Tianyi m7786(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((Cloud) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static boolean m7787(Object obj) {
        if (m7837() > 0) {
            return ((Q) obj).e();
        }
        return false;
    }

    /* renamed from: ۟ۦۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Object m7788(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((n) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۡۧ, reason: not valid java name and contains not printable characters */
    public static void m7789(Object obj) {
        if (C0011.m2755() >= 0) {
            ((L) obj).b();
        }
    }

    /* renamed from: ۟ۦۤۧۧ, reason: not valid java name and contains not printable characters */
    public static void m7790(Object obj) {
        if (C0005.m1599() < 0) {
            j.f((String) obj);
        }
    }

    /* renamed from: ۟ۦۥۡ۠, reason: not valid java name and contains not printable characters */
    public static OutputStream m7791(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((Process) obj).getOutputStream();
        }
        return null;
    }

    /* renamed from: ۟ۦۥۥۤ, reason: not valid java name and contains not printable characters */
    public static Object m7792(Object obj, int i) {
        if (C0059.m9257() <= 0) {
            return Array.newInstance((Class<?>) obj, i);
        }
        return null;
    }

    /* renamed from: ۟ۦۦۤۡ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0416b m7793(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((com.github.catvod.spider.merge.w0.b) obj).compute();
        }
        return null;
    }

    /* renamed from: ۟ۦۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m7794(Object obj) {
        if (C0011.m2755() > 0) {
            return ((C0246g) obj).t();
        }
        return false;
    }

    /* renamed from: ۟ۦۨۥ۠, reason: not valid java name and contains not printable characters */
    public static void m7795(Object obj, Object obj2) {
        if (C0020.m4210() < 0) {
            ((AccessibilityNodeInfo) obj).setHintText((CharSequence) obj2);
        }
    }

    /* renamed from: ۟ۧ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m7796(Object obj) {
        if (C0010.m2320() < 0) {
            return ((HBgetappapi) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۧ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static void m7797(Object obj) {
        if (C0041.m6823() < 0) {
            ((W) obj).c();
        }
    }

    /* renamed from: ۟ۧۧۢ۠, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m7798(Object obj, Object obj2, Object obj3) {
        if (C0053.m8389() > 0) {
            return ((AlertDialog.Builder) obj).setPositiveButton((CharSequence) obj2, (DialogInterface.OnClickListener) obj3);
        }
        return null;
    }

    /* renamed from: ۠۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static AbstractC0152i m7799(Object obj) {
        if (C0061.m9359() < 0) {
            return ((C0145b) obj).a;
        }
        return null;
    }

    /* renamed from: ۠ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static String m7800() {
        if (C0014.m3353() <= 0) {
            return "{code}";
        }
        return null;
    }

    /* renamed from: ۠ۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m7801(Object obj, boolean z) {
        if (C0017.m3633() <= 0) {
            ((View) obj).setFocusable(z);
        }
    }

    /* renamed from: ۠ۦۦۤ, reason: not valid java name and contains not printable characters */
    public static String[] m7802(Object obj) {
        if (C0013.m3167() > 0) {
            return ((com.github.catvod.spider.merge.T0.n) obj).d;
        }
        return null;
    }

    /* renamed from: ۠ۧۥۡ, reason: not valid java name and contains not printable characters */
    public static HashMap m7803(Object obj, Object obj2, boolean z) {
        if (C0022.m4497() > 0) {
            return ((Youku) obj).a((HashMap) obj2, z);
        }
        return null;
    }

    /* renamed from: ۡ۠ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m7804(Object obj, Object obj2) {
        if (C0018.m3956() > 0) {
            return KuaKeBa.a((String) obj, (Pattern) obj2);
        }
        return null;
    }

    /* renamed from: ۡۥۣۤ, reason: not valid java name and contains not printable characters */
    public static String m7805() {
        if (C0021.m4379() > 0) {
            return ":document.body.innerHTML";
        }
        return null;
    }

    /* renamed from: ۡۧۧۢ, reason: not valid java name and contains not printable characters */
    public static void m7806(Object obj, Object obj2) {
        if (C0021.m4379() > 0) {
            ((p) obj).J((String) obj2);
        }
    }

    /* renamed from: ۡۨۧ۟, reason: not valid java name and contains not printable characters */
    public static Iterator m7807(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((AbstractCollection) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۢ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static String m7808() {
        if (C0035.m6140() <= 0) {
            return "\\.";
        }
        return null;
    }

    /* renamed from: ۢۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m7809(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((com.github.catvod.spider.merge.F.p) obj).d();
        }
        return null;
    }

    /* renamed from: ۢۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m7810(Object obj) {
        if (C0062.m9429() > 0) {
            return ((m) obj).E();
        }
        return 0;
    }

    /* renamed from: ۢۡۤۢ, reason: not valid java name and contains not printable characters */
    public static void m7811(Object obj, Object obj2) throws IOException {
        if (C0017.m3633() <= 0) {
            ((ServerSocket) obj).bind((SocketAddress) obj2);
        }
    }

    /* renamed from: ۢۢۥۧ, reason: not valid java name and contains not printable characters */
    public static void m7812(Object obj, boolean z) {
        if (C0027.m5017() > 0) {
            ((AtomicBoolean) obj).set(z);
        }
    }

    /* renamed from: ۣۢ۠ۧ, reason: not valid java name and contains not printable characters */
    public static SecureRandom m7813() {
        if (C0010.m2320() <= 0) {
            return HBqiJi.c;
        }
        return null;
    }

    /* renamed from: ۢۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static JSONObject m7814(Object obj, Object obj2, Object obj3) {
        if (C0035.m6140() <= 0) {
            return ((FishHxq) obj).c((String) obj2, (JSONObject) obj3);
        }
        return null;
    }

    /* renamed from: ۢۤۢۥ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m7815(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((x) obj).d;
        }
        return null;
    }

    /* renamed from: ۢۤۧۦ, reason: not valid java name and contains not printable characters */
    public static Iterator m7816(Object obj) {
        if (C0017.m3633() < 0) {
            return ((ArrayList) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۢۦۣۢ, reason: not valid java name and contains not printable characters */
    public static String m7817() {
        if (C0033.m5872() >= 0) {
            return "y";
        }
        return null;
    }

    /* renamed from: ۢۧۦۢ, reason: not valid java name and contains not printable characters */
    public static Integer m7818(int i, Object obj) {
        if (C0051.m8216() < 0) {
            return com.github.catvod.spider.merge.B0.a.d(i, (String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7819(Object obj, Object obj2) {
        if (C0007.m1886() > 0) {
            return ((ComponentName) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۣۡۡۧ, reason: not valid java name and contains not printable characters */
    public static float m7820(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((DisplayMetrics) obj).scaledDensity;
        }
        return 0.0f;
    }

    /* renamed from: ۣۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7821(Object obj) {
        if (C0040.m6582() > 0) {
            return ((C0253n) obj).b;
        }
        return false;
    }

    /* renamed from: ۣۣۤۢ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m7822() {
        if (C0010.m2320() <= 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        }
        return null;
    }

    /* renamed from: ۣۣۤۢ, reason: not valid java name and contains not printable characters */
    public static void m7823(int i) {
        if (C0030.m5375() >= 0) {
            Process.killProcess(i);
        }
    }

    /* renamed from: ۣۧۨۧ, reason: not valid java name and contains not printable characters */
    public static String m7824(String str) {
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
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۣۨۧ۟, reason: not valid java name and contains not printable characters */
    public static UUID m7825() {
        if (C0006.m1726() < 0) {
            return C0150g.a;
        }
        return null;
    }

    /* renamed from: ۣۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7826(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((ShortcutManager) obj).isRateLimitingActive();
        }
        return false;
    }

    /* renamed from: ۤ۟۟, reason: not valid java name and contains not printable characters */
    public static int m7827(Object obj) {
        if (m7837() > 0) {
            return ((com.github.catvod.spider.merge.D.g) obj).a;
        }
        return 0;
    }

    /* renamed from: ۤ۟ۥۢ, reason: not valid java name and contains not printable characters */
    public static int m7828(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((C0148e) obj).i;
        }
        return 0;
    }

    /* renamed from: ۤۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray m7829(Object obj) {
        if (C0002.m1242() > 0) {
            return ((com.github.catvod.spider.merge.C.b) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۤۡ۠, reason: not valid java name and contains not printable characters */
    public static int m7830(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۤۡۤۦ, reason: not valid java name and contains not printable characters */
    public static Object m7831(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((DialogInterfaceOnDismissListenerC0243d) obj).b;
        }
        return null;
    }

    /* renamed from: ۤۡۦ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.B.g m7832() {
        if (C0045.m7538() <= 0) {
            return com.github.catvod.spider.merge.B.g.ON_ANY;
        }
        return null;
    }

    /* renamed from: ۣۤۤۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m7834(Object obj, Object obj2) {
        if (C0004.m1557() <= 0) {
            return ((C0233B) obj).o((String) obj2);
        }
        return null;
    }

    /* renamed from: ۤۧۤۨ, reason: not valid java name and contains not printable characters */
    public static void m7835(Object obj, Object obj2) {
        if (C0032.m5686() < 0) {
            ((C0335o) obj).f((String) obj2);
        }
    }

    /* renamed from: ۥۥۥۣ, reason: contains not printable characters */
    public static void m7836(Object obj, int i) {
        if (C0011.m2755() >= 0) {
            ((C0271a) obj).h(i);
        }
    }

    /* renamed from: ۥۣۧۥ, reason: contains not printable characters */
    public static int m7837() {
        return 564 ^ C0022.f465;
    }

    /* renamed from: ۥۧۧۡ, reason: contains not printable characters */
    public static boolean m7838(Object obj) {
        if (C0059.m9257() < 0) {
            return ((StringTokenizer) obj).hasMoreTokens();
        }
        return false;
    }

    /* renamed from: ۦ۠ۢ۠, reason: contains not printable characters */
    public static int m7839(Object obj) {
        if (C0048.m7971() > 0) {
            return ((com.github.catvod.spider.merge.E0.b) obj).c();
        }
        return 0;
    }

    /* renamed from: ۦۣۡۢ, reason: contains not printable characters */
    public static Scroller m7840(Object obj) {
        if (C0008.m1975() > 0) {
            return ((C0300c) obj).a;
        }
        return null;
    }

    /* renamed from: ۦۣۨۥ, reason: contains not printable characters */
    public static String m7841() {
        if (C0000.m1116() <= 0) {
            return "搜索后缀";
        }
        return null;
    }

    /* renamed from: ۦۨ۟, reason: contains not printable characters */
    public static int m7842(Object obj) {
        if (C0013.m3167() > 0) {
            return ((DialogInterfaceOnClickListenerC0338s) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۣۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m7843(Object obj) {
        if (C0037.m6350() < 0) {
            return ((RunnableC0282a) obj).d;
        }
        return null;
    }

    /* renamed from: ۧۤۢ۠, reason: not valid java name and contains not printable characters */
    public static void m7844(Object obj, boolean z) {
        if (C0017.m3633() <= 0) {
            ((AccessibilityNodeInfo) obj).setContextClickable(z);
        }
    }

    /* renamed from: ۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7845(Object obj) {
        if (C0011.m2755() > 0) {
            return ((AbstractC0362a) obj).nextBoolean();
        }
        return false;
    }

    /* renamed from: ۧۧۡۨ, reason: not valid java name and contains not printable characters */
    public static void m7846(Object obj, Object obj2, int i, int i2) {
        if (C0002.m1242() > 0) {
            ((ByteArrayOutputStream) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* renamed from: ۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m7847() {
        if (C0039.m6529() <= 0) {
            return "            background-position: center; /* 背景图水平和垂直方向都居中 */\n            background-size: cover; /* 保持图片比例并覆盖整个容器 */\n            background-repeat: no-repeat; /* 防止图片重复平铺 */\n            background-attachment: fixed; /* 固定背景图，滚动时不跟随移动 */\n            min-height: 100vh;\n            padding: 20px;\n            color: #333;\n            overflow-x: hidden;\n\n        }\n\n        .app-header {\n            text-align: center;\n           margin-bottom: 10px;\n          // background: rgba(255, 255, 255, 0.6);\n            backdrop-filter: blur(1px);\n           border-radius: 20px;\n            padding: 10px;\n        }\n\n        .app-header i {\n            color: #e67e22; /* 橙色 */\n            animation: pulse 2s infinite ease-in-out;\n            filter: drop-shadow(0 2px 4px rgba(0, 0, 0, 0.1));\n        }\n\n        @keyframes pulse {\n            0% {\n                transform: scale(1);\n            }\n            50% {\n                transform: scale(1.08);\n            }\n            100% {\n                transform: scale(1);\n            }\n        }\n\n        .title-group {\n            display: flex;\n            flex-direction: column;\n            text-align: left;\n        }\n        .app-header h1 {\n            text-align: center;\n            font-size: 1.2em;\n            font-weight: 1000;\n            color: #000000; /* 文字设为黑色 */\n            margin-bottom: 8px;\n            /* 白色描边：通过4个方向的白色阴影模拟轮廓（兼容低版本浏览器） */\n            text-shadow:\n                    -1px -1px 0 #ffffff,\n                    1px -1px 0 #ffffff,\n                    -1px  1px 0 #ffffff,\n                    1px  1px 0 #ffffff;\n        }\n\n\n        .app-header .subtitle {\n            text-align: center;\n            font-size: 0.8em;\n           // color: #7f8c8d;\n            margin: 2px 0 0;\n            font-weight: 800;\n            /* 白色描边：通过4个方向的白色阴影模拟轮廓（兼容低版本浏览器） */\n            text-shadow:\n                    -1px -1px 0 #ffffff,\n                    1px -1px 0 #ffffff,\n                    -1px  1px 0 #ffffff,\n                    1px  1px 0 #ffffff;\n        }\n\n        /* 平台色定义（CSS 变量） */\n        :root {\n            --aiqiyi-color: #27ae60;\n            --youku-gradient: linear-gradient(135deg, #ff8c00, #0099ff);\n            --mango-yellow: #fdd000;\n            --sohu-color: #e74c3c;\n            --bilibili-pink: #fb7299;\n            --tencent-gradient: linear-gradient(to right, #FFC300 0%, #00D1B2 70%, #00A0E9 90%);\n            --focus-outline: 3px solid #006400;\n            --focus-shadow: 0 0 8px rgba(0, 100, 0, 0.5);\n        }\n\n        /* 渐变边框标题装饰  */\n        .header-decoration {\n            height: 3px;\n            width: 90%;\n            max-width: 520px;\n            background: linear-gradient(\n                    to right,\n                    var(--aiqiyi-color) 0% 16.666%,\n                    #f39c12 16.666% 33.333%,\n                    #ff8c00 33.333% 50%,\n                    var(--mango-yellow) 50% 66.666%,\n                    var(--sohu-color) 66.666% 83.333%,\n                    var(--bilibili-pink) 83.333% 100%\n            );\n            border-radius: 2px;\n            margin: 8px auto 8px;\n            opacity: 0.8;\n        }\n\n        /* 搜索容器 */\n        .search-container {\n            padding: 8px 0;\n            border-radius: 12px;\n            margin-bottom: 5px;\n        }\n\n        .search-wrapper {\n            position: relative;\n            margin-bottom: 12px;\n            display: flex;\n            gap: 12px;\n            align-items: center;\n            width: 100%;\n        }\n\n        .search-wrapper input[type=\"text\"] {\n            flex: 1;\n            padding: 10px 20px;\n            border: 2px solid #e1e5e9;\n            border-radius: 30px;\n            transition: all 0.3s ease;\n            background: #fff;\n            outline: none;\n            min-width: 0;\n        }\n\n        .search-wrapper input[type=\"text\"]:focus {\n            border-color: #667eea;\n            box-shadow: 0 0 0 3px rgba(102, 126, 234, 0.3);\n            transform: scale(1.02);\n        }\n\n        .search-wrapper button {\n            padding: 10px 20px;\n            background: linear-gradient(45deg, #667eea, #764ba2);\n            color: white;\n            border: none;\n            border-radius: 30px;\n            font-size: 14px;\n            font-weight: 600;\n            cursor: pointer;\n            transition: all 0.3s ease;\n            white-space: nowrap;\n            flex-shrink: 0; /* 防止按钮被压缩 */\n        }\n\n        .search-wrapper button:hover,\n        .search-wrapper button:focus {\n            transform: translateY(-00%) scale(1.05);\n            box-shadow: 0 0 0 2px rgba(0, 191, 255, 0.2);\n        }\n\n        .search-wrapper button i {\n            font-size: 13px;\n        }\n\n        /* 按钮布局 */\n        .button-row {\n            display: grid;\n            grid-template-columns: 1fr 1fr 1fr;\n            gap: 8px;\n            width: 100%;\n        }\n\n        .action-btn.full-btn {\n            flex: 1;\n            min-width: 0;\n            padding: 10px 10px;\n            background: rgba(255, 255, 255, 0.95);\n            color: #667eea;\n            text-decoration: none;\n            border-radius: 20px;\n            font-size: 14px;\n            font-weight: 600;\n            transition: all 0.3s ease;\n            border: 2px solid rgba(102, 126, 234, 0.2);\n            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);\n            text-align: center;\n            white-space: nowrap;\n            overflow: hidden;\n            text-overflow: ellipsis;\n        }\n\n        .action-btn.full-btn i {\n            font-size: 14px;\n            width: 18px;\n            text-align: center;\n        }\n\n        .action-btn.full-btn[data-type=\"search\"] {\n            padding: 10px 8px;\n            font-size: 12px;\n            flex: 1;\n            text-align: center;\n        }\n\n        .action-btn.full-btn[data-type=\"qrcode\"] {\n            padding: 10px 8px;\n            font-size: 12px;\n            flex: 1;\n            text-align: center;\n        }\n\n        .action-btn.full-btn[data-type=\"danmu\"] {\n            padding: 10px 8px;\n            font-size: 12px;\n            flex: 1;\n            text-align: center;\n        }\n\n        .action-btn.full-btn:hover, .action-btn.full-btn:focus {\n            background: #667eea;\n            color: white;\n            transform: translateY(-2px) scale(1.05);\n            box-shadow: 0 6px 12px rgba(102, 126, 234, 0.2);\n            outline: 3px solid rgba(102, 126, 234, 0.5);\n        }\n\n        .movie a:focus {\n            outline: var(--focus-outline);\n            outline-offset: 2px;\n            box-shadow: var(--focus-shadow);\n        }\n\n        /* 视频设计 */\n        .movie {\n            width: 100%;\n            height: 120px;\n            text-align: center;\n            background-color: #fff;\n            border-radius: 8px;\n            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n            overflow: hidden;\n            transition: transform 0.3s ease, box-shadow 0.3s ease;\n            position: relative;\n        }\n\n        .movie a {\n            position: relative;\n            display: block;\n            height: 100%;\n            outline: none;\n        }\n\n        .movie img {\n            width: 100%;\n            height: 78%;\n            object-fit: cover;\n            transition: transform 0.3s ease;\n        }\n\n        .movie a:focus img {\n            transform: scale(1.08);\n        }\n\n        .movie-tag {\n            position: absolute;\n            bottom: 32px;\n            right: 6px;\n            display: flex;\n            align-items: center;\n            gap: 4px;\n            color: #fff;\n            font-size: 9px;\n            padding: 2px 6px;\n            border-radius: 4px;\n            z-index: 2;\n            box-shadow: 0 1px 3px rgba(0, 0, 0, 0.3);\n            white-space: nowrap;\n        }\n\n        .movie-tag.aiqiyi {\n            background-color: var(--aiqiyi-color);\n        }\n\n        .movie-tag.tencent {\n            background: var(--youku-gradient);\n        }\n\n        .movie-tag.sohu {\n            background-color: var(--sohu-color);\n        }\n\n        .movie-tag.bilibili {\n            background-color: var(--bilibili-pink);\n        }\n\n        /*  暗色模式 */\n        .movie-title {\n            color: #333;\n            height: 22%;\n            padding: 4px 6px;\n            font-weight: bold;\n            font-size: 11px;\n            overflow: hidden;\n            white-space: nowrap;\n            text-overflow: ellipsis;\n            background-color: #ffffff;\n            text-shadow: 1px 1px 1px rgba(255, 255, 255, 0.3);\n            position: absolute;\n            bottom: 0;\n            left: 0;\n            width: 100%;\n            z-index: 1;\n            pointer-events: none;\n            transition: background-color 0.3s ease, color 0.3s ease;\n        }\n\n        @media (prefers-color-scheme: dark) {\n            .movie-title {\n                background-color: rgba(0, 0, 0, 0.85);\n                color: #ffffff;\n                text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.9);\n            }\n        }\n\n        .movie a:focus .movie-title {\n            color: #00cc00;\n        }\n\n        /* 剧集列表容器 */\n        .movie-container {\n            display: grid;\n            grid-template-columns: repeat(3, 1fr);\n            gap: 12px;\n            margin: 8px auto 0;\n        }\n\n        /* 移动端排列 */\n        @media (max-width: 768px) {\n            .movie-container {\n                grid-template-columns: repeat(3, 1fr);\n                gap: 10px;\n            }\n\n            .movie {\n                height: 120px;\n            }\n\n            .movie img {\n                height: 90%;\n            }\n\n            .movie-title {\n                font-size: 10px;\n                height: 24%;\n                padding: 3px 6px;\n            }\n\n            .movie-tag {\n                font-size: 8px;\n                padding: 2px 5px;\n            }\n        }\n\n        @media (max-width: 480px) {\n            .movie-container {\n                grid-template-columns: repeat(3, 1fr);\n                gap: 10px;\n            }\n\n            .movie {\n                height: 120px;\n            }\n\n            .movie img {\n                height: 90%;\n            }\n\n            .movie-title {\n                font-size: 9px;\n                height: 24%;\n            }\n        }\n\n        /* 暗色模式适配 */\n        @media (prefers-color-scheme: dark) {\n            body {\n                background: linear-gradient(135deg, #1a1a1a 0%, #2c2c2c 100%);\n                color: #eee;\n            }\n\n            .search-container,\n            #danmuPanel {\n                background: #2a2a2a;\n                border: 1px solid #444;\n            }\n\n            .search-wrapper input[type=\"text\"] {\n                background: #333;\n                color: #fff;\n                border-color: #555;\n            }\n\n            .movie {\n                background-color: #2a2a2a;\n                box-shadow: 0 0 8px rgba(255, 255, 255, 0.05);\n            }\n\n            .movie img {\n                filter: brightness(0.9);\n            }\n\n            .status-message {\n                background-color: #006400 !important;\n            }\n        }\n\n        /* 弹幕输入面板样式 */\n        #danmuPanel {\n            margin-top: 16px;\n            padding: 16px;\n            background: #f8f9fa;\n            border-radius: 8px;\n            border: 1px solid #eee;\n        }\n\n        #danmuPanel textarea,\n        #danmuPanel input {\n            width: 100%;\n            padding: 8px;\n            border: 1px solid #ddd;\n            border-radius: 6px;\n            font-size: 13px;\n            margin-bottom: 10px;\n        }\n\n        #danmuPanel input {\n            padding: 6px 8px;\n        }\n\n        /* 按钮容器：仅用于居中按钮 */\n        .danmu-btn-container {\n            text-align: center; /* 水平居中按钮 */\n            margin-top: 8px; /* 与上方输入框保持间距 */\n        }\n\n        #sendDanmuBtn {\n            padding: 12px 24px;\n            border: none;\n            text-align: center;\n            border-radius: 25px;\n            font-size: 14px;\n            font-weight: 600;\n            cursor: pointer;\n            transition: all 0.3s ease;\n            text-decoration: none;\n            display: inline-block;\n            background: linear-gradient(45deg, #667eea, #764ba2);\n            color: white;\n        }\n        #sendDanmuBtn:hover, #sendDanmuBtn:focus {\n            color: white;\n            transform: translateY(-2px) scale(1.05);\n            outline: 3px solid rgba(102, 126, 234, 0.5);\n        }\n        /* 状态提示 */\n        .status-message {\n            opacity: 0;\n            visibility: hidden;\n            background-color: #006400;\n            color: white;\n            font-size: 14px;\n            padding: 10px 16px;\n            border-radius: 8px;\n            position: fixed;\n            top: 20px;\n            left: 50%;\n            transform: translateX(-50%);\n            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2);\n            transition: opacity 0.3s ease, visibility 0.3s ease;\n            z-index: 1000;\n            max-width: 90%;\n            text-align: center;\n        }\n\n        .status-message.show {\n            opacity: 1;\n            visibility: visible;\n        }\n\n        /* 移动端字体微调 */\n        @media (max-width: 768px) {\n            .search-container {\n                padding: 8px 0px;\n            }\n\n            .button-row {\n                gap: 6px;\n            }\n\n            .action-btn.full-btn {\n                font-size: 13px;\n                padding: 8px 0;\n            }\n\n            .action-btn.full-btn i {\n                font-size: 12px;\n                width: 16px;\n            }\n\n            .app-header h1 {\n                font-size: 1.1em;\n            }\n\n            .app-header .subtitle {\n                font-size: 0.75em;\n            }\n        }\n    </style></head>\n<body><!-- 主页界面-->\n<div class=\"app-header\">\n    <button onclick=\"fetch('";
        }
        return null;
    }

    /* renamed from: ۣۨۡ۟, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m7848(Object obj, Object obj2) {
        if (C0040.m6582() > 0) {
            return ((AlertDialog.Builder) obj).setView((View) obj2);
        }
        return null;
    }

    /* renamed from: ۨۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static View m7849(Object obj) {
        if (C0036.m6252() > 0) {
            return ((View) obj).findFocus();
        }
        return null;
    }

    /* renamed from: ۣۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m7850(Object obj, Object obj2) {
        if (C0030.m5375() >= 0) {
            return ((HBcms10Dou) obj).getUrl((String) obj2);
        }
        return null;
    }

    /* renamed from: ۨۤۨۡ, reason: not valid java name and contains not printable characters */
    public static float m7851(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((Paint) obj).descent();
        }
        return 0.0f;
    }

    /* renamed from: ۤۢۤ, reason: not valid java name and contains not printable characters */
    public static String m7833(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}