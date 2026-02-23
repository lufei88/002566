package com.github.catvod.spider.p000mergexbpq.e0;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.content.pm.ShortcutManager;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.util.Range;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.HBNT4;
import com.github.catvod.spider.HBcms10Dou;
import com.github.catvod.spider.HBheiHu;
import com.github.catvod.spider.HBqwKan;
import com.github.catvod.spider.HBxLei8;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.MYzhiqiu;
import com.github.catvod.spider.Mogg;
import com.github.catvod.spider.merge.B.g;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.D.f;
import com.github.catvod.spider.merge.E0.o;
import com.github.catvod.spider.merge.E0.q;
import com.github.catvod.spider.merge.F.b;
import com.github.catvod.spider.merge.F.h;
import com.github.catvod.spider.merge.F.i;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.E;
import com.github.catvod.spider.merge.F0.Q;
import com.github.catvod.spider.merge.F0.S;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.B;
import com.github.catvod.spider.merge.P0.t;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.C0229e;
import com.github.catvod.spider.merge.W.v;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnCancelListenerC0242c;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.AbstractC0274d;
import com.github.catvod.spider.merge.e.C0271a;
import com.github.catvod.spider.merge.e.C0272b;
import com.github.catvod.spider.merge.f.AbstractC0296g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.a;
import com.github.catvod.spider.merge.g1.d;
import com.github.catvod.spider.merge.g1.e;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.ViewOnClickListenerC0330j;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.l0.l;
import com.github.catvod.spider.merge.l0.m;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.w.ViewOnUnhandledKeyEventListenerC0404h;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.D;
import com.github.catvod.spider.p000mergexbpq.P.InterfaceC0066d;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.۠ۨ۟ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0011 {

    /* renamed from: ۟ۤۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static int f344 = 41;

    /* renamed from: ۟۟۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static t[] m2743(Object obj) {
        if (C0049.m8038() < 0) {
            return ((B) obj).d;
        }
        return null;
    }

    /* renamed from: ۟۟ۡۥۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m2744() {
        if (C0060.m9355() > 0) {
            return HBheiHu.a();
        }
        return null;
    }

    /* renamed from: ۟۟ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static a m2745(Object obj) {
        if (C0061.m9359() < 0) {
            return ((d) obj).e;
        }
        return null;
    }

    /* renamed from: ۟۟ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static String m2746(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((Uri) obj).getLastPathSegment();
        }
        return null;
    }

    /* renamed from: ۟۠ۡۥۧ, reason: not valid java name and contains not printable characters */
    public static void m2747(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0050.m8121() < 0) {
            com.github.catvod.spider.merge.B0.a.z((StringBuilder) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
    }

    /* renamed from: ۟۠ۥۣۤ, reason: not valid java name and contains not printable characters */
    public static String m2748() {
        if (C0032.m5686() < 0) {
            return File.separator;
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static void m2749(Object obj, int i) {
        if (C0025.m4797() > 0) {
            ((WindowInsetsController) obj).hide(i);
        }
    }

    /* renamed from: ۣ۟۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m2750(Object obj, Object obj2, int i) {
        if (C0043.m7332() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.Q.B) obj).i((InterfaceC0066d) obj2, i);
        }
        return 0;
    }

    /* renamed from: ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m2751(int i) {
        if (C0062.m9429() >= 0) {
            return Color.red(i);
        }
        return 0;
    }

    /* renamed from: ۟ۡ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static Annotation m2752(Object obj, Object obj2) {
        if (C0018.m3956() >= 0) {
            return ((Method) obj).getAnnotation((Class) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m2753(String str) {
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

    /* renamed from: ۟ۡۤۨ۠, reason: not valid java name and contains not printable characters */
    public static String m2754(Object obj) {
        if (C0019.m4065() < 0) {
            return ((h) obj).h();
        }
        return null;
    }

    /* renamed from: ۟ۡۨ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m2755() {
        return (-182) ^ C0037.f691;
    }

    /* renamed from: ۟ۢۤۤۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.d m2756(Object obj) {
        if (C0046.m7701() > 0) {
            return ((q) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۢۥۤ, reason: not valid java name and contains not printable characters */
    public static Object m2757(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((b) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۢۥۤۧ, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m2758(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((e) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static void m2759(Object obj) {
        if (C0044.m7508() <= 0) {
            ((A) obj).s();
        }
    }

    /* renamed from: ۣ۟۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static Pattern m2760(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((HBNT4) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m2761(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((Notification) obj).category;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static OutputStream m2762(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((Socket) obj).getOutputStream();
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۣۣ, reason: not valid java name and contains not printable characters */
    public static Object m2763(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((ViewOnClickListenerC0330j) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟ۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m2764(Object obj) {
        if (C0044.m7508() < 0) {
            return ((i) obj).b();
        }
        return null;
    }

    /* renamed from: ۟ۤ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static int m2765(Object obj) {
        if (C0055.m8740() > 0) {
            return ((C0128k) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۤ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m2766(Object obj, int i, int i2, int i3, int i4) {
        if (C0023.m4566() <= 0) {
            return ((WindowInsets) obj).replaceSystemWindowInsets(i, i2, i3, i4);
        }
        return null;
    }

    /* renamed from: ۟ۤ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static int m2767(int i, int i2) {
        if (C0033.m5872() >= 0) {
            return View.MeasureSpec.makeMeasureSpec(i, i2);
        }
        return 0;
    }

    /* renamed from: ۣ۟ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m2768(Object obj) {
        if (C0034.m6048() < 0) {
            return Mogg.b((com.github.catvod.spider.merge.T0.h) obj);
        }
        return null;
    }

    /* renamed from: ۟ۤۢۢۦ, reason: not valid java name and contains not printable characters */
    public static g m2769() {
        if (C0056.m8886() <= 0) {
            return g.ON_DESTROY;
        }
        return null;
    }

    /* renamed from: ۟ۤۥۣۥ, reason: not valid java name and contains not printable characters */
    public static Object[] m2770() {
        if (C0050.m8121() <= 0) {
            return AbstractC0274d.b;
        }
        return null;
    }

    /* renamed from: ۟ۤۥۣۤ, reason: not valid java name and contains not printable characters */
    public static Q m2771(Object obj, Object obj2, Object obj3) {
        if (C0037.m6350() < 0) {
            return Q.b((Q) obj, (S) obj2, (IdentityHashMap) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۤۧ۟, reason: not valid java name and contains not printable characters */
    public static int m2772(Object obj) {
        if (C0049.m8038() < 0) {
            return ((DialogInterfaceOnCancelListenerC0242c) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۤۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m2773(Object obj) {
        if (C0005.m1599() < 0) {
            return ((com.github.catvod.spider.merge.G.e) obj).b();
        }
        return null;
    }

    /* renamed from: ۟ۤۧۢۦ, reason: not valid java name and contains not printable characters */
    public static String m2774(Object obj) {
        if (C0020.m4210() < 0) {
            return ((CharSequence) obj).toString();
        }
        return null;
    }

    /* renamed from: ۟ۥۢۥۧ, reason: not valid java name and contains not printable characters */
    public static String m2775(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((HBxLei8) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۥۢۨ۠, reason: not valid java name and contains not printable characters */
    public static Comparable m2776(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((Range) obj).getLower();
        }
        return null;
    }

    /* renamed from: ۟ۥۥۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2777(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((o) obj).h;
        }
        return false;
    }

    /* renamed from: ۟ۦۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static View m2778(Object obj, int i) {
        if (C0034.m6048() < 0) {
            return ((Activity) obj).findViewById(i);
        }
        return null;
    }

    /* renamed from: ۟ۦۢۥۥ, reason: not valid java name and contains not printable characters */
    public static char m2779(Object obj) {
        if (C0019.m4065() < 0) {
            return ((Character) obj).charValue();
        }
        return (char) 0;
    }

    /* renamed from: ۟ۦۤ۟۠, reason: not valid java name and contains not printable characters */
    public static String m2780() {
        if (C0060.m9355() >= 0) {
            return "\\$\\$\\$";
        }
        return null;
    }

    /* renamed from: ۟ۦۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m2781(Object obj, Object obj2) {
        if (C0049.m8038() < 0) {
            return ((Context) obj).getSystemService((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۥۡ۟, reason: not valid java name and contains not printable characters */
    public static String m2782() {
        if (C0025.m4797() >= 0) {
            return "动画片";
        }
        return null;
    }

    /* renamed from: ۟ۦۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Socket m2783(Object obj) {
        if (C0058.m9131() < 0) {
            return ((ServerSocket) obj).accept();
        }
        return null;
    }

    /* renamed from: ۟ۦۨ۠, reason: not valid java name and contains not printable characters */
    public static String m2784(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((Config) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۦۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m2785(long j) throws InterruptedException {
        if (C0059.m9257() <= 0) {
            Thread.sleep(j);
        }
    }

    /* renamed from: ۣ۟ۧۦۥ, reason: not valid java name and contains not printable characters */
    public static void m2786(Object obj, Object obj2) {
        if (m2755() >= 0) {
            ((Handler) obj).removeCallbacksAndMessages(obj2);
        }
    }

    /* renamed from: ۣ۟ۧۧۦ, reason: not valid java name and contains not printable characters */
    public static int m2787(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((D) obj).e();
        }
        return 0;
    }

    /* renamed from: ۟ۧۤ۠۠, reason: not valid java name and contains not printable characters */
    public static int m2788(Object obj) {
        if (C0002.m1242() > 0) {
            return ((l) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۧۤۡ, reason: not valid java name and contains not printable characters */
    public static String m2789() {
        if (C0023.m4566() < 0) {
            return f.j();
        }
        return null;
    }

    /* renamed from: ۟ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2790(Object obj, Object obj2, Object obj3) {
        if (C0057.m9017() >= 0) {
            return ((ViewCompat.OnUnhandledKeyEventListenerCompat) obj).onUnhandledKeyEvent((View) obj2, (KeyEvent) obj3);
        }
        return false;
    }

    /* renamed from: ۣ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m2791(Object obj) {
        if (C0060.m9355() > 0) {
            return ((HBqwKan) obj).c();
        }
        return false;
    }

    /* renamed from: ۠ۦۧۥ, reason: not valid java name and contains not printable characters */
    public static String m2792() {
        if (C0014.m3353() <= 0) {
            return "\\&";
        }
        return null;
    }

    /* renamed from: ۡ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static Rect m2793(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((Drawable) obj).getDirtyBounds();
        }
        return null;
    }

    /* renamed from: ۡ۟ۦۡ, reason: not valid java name and contains not printable characters */
    public static String m2794() {
        if (C0006.m1726() < 0) {
            return "正在使用代理get--> ";
        }
        return null;
    }

    /* renamed from: ۡۢۡۥ, reason: not valid java name and contains not printable characters */
    public static C0271a m2795(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((C0272b) obj).h;
        }
        return null;
    }

    /* renamed from: ۣۡۢۤ, reason: not valid java name and contains not printable characters */
    public static String m2796(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).d;
        }
        return null;
    }

    /* renamed from: ۢ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static ViewCompat.OnUnhandledKeyEventListenerCompat m2797(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((ViewOnUnhandledKeyEventListenerC0404h) obj).a;
        }
        return null;
    }

    /* renamed from: ۢۦۤۧ, reason: not valid java name and contains not printable characters */
    public static void m2798(Object obj) throws IOException {
        if (m2755() > 0) {
            ((FileInputStream) obj).close();
        }
    }

    /* renamed from: ۣۡۥۡ, reason: not valid java name and contains not printable characters */
    public static int m2799(Object obj, float f) {
        if (C0062.m9429() > 0) {
            return com.github.catvod.spider.merge.a1.l.c((Context) obj, f);
        }
        return 0;
    }

    /* renamed from: ۣۡۨۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c.e m2800(Object obj, Object obj2) {
        if (C0001.m1164() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c.e) obj).a((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣۢۨ, reason: not valid java name and contains not printable characters */
    public static Object m2801() {
        if (C0007.m1886() >= 0) {
            return com.github.catvod.spider.merge.w0.b.NO_RECEIVER;
        }
        return null;
    }

    /* renamed from: ۣۨۢ, reason: not valid java name and contains not printable characters */
    public static String m2802(Object obj) {
        if (C0033.m5872() > 0) {
            return ((com.github.catvod.spider.merge.Q.a) obj).c();
        }
        return null;
    }

    /* renamed from: ۣۨۧۢ, reason: not valid java name and contains not printable characters */
    public static int m2803(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((ShortcutManager) obj).getMaxShortcutCountPerActivity();
        }
        return 0;
    }

    /* renamed from: ۤ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static void m2804(Object obj) {
        if (C0000.m1116() < 0) {
            Init.init((Context) obj);
        }
    }

    /* renamed from: ۤۥۤ۠, reason: not valid java name and contains not printable characters */
    public static Pattern m2806() {
        if (C0026.m4977() <= 0) {
            return com.github.catvod.spider.merge.T0.a.f;
        }
        return null;
    }

    /* renamed from: ۤۧۢۡ, reason: not valid java name and contains not printable characters */
    public static String m2807(Object obj) {
        if (C0006.m1726() < 0) {
            return ((C0335o) obj).l;
        }
        return null;
    }

    /* renamed from: ۤۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Integer m2808(int i) {
        if (C0057.m9017() > 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    /* renamed from: ۤۨۢۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m2809() {
        if (C0030.m5375() > 0) {
            return HBcms10Dou.a();
        }
        return null;
    }

    /* renamed from: ۥۣ۟ۧ, reason: contains not printable characters */
    public static Class m2810() {
        if (C0051.m8216() < 0) {
            return Boolean.TYPE;
        }
        return null;
    }

    /* renamed from: ۥۢۥۢ, reason: contains not printable characters */
    public static Object m2811(Object obj) {
        if (C0060.m9355() > 0) {
            return ((LinkedList) obj).remove();
        }
        return null;
    }

    /* renamed from: ۥۢۥۦ, reason: contains not printable characters */
    public static int m2812(Object obj) {
        if (C0042.m7147() < 0) {
            return ((E) obj).a;
        }
        return 0;
    }

    /* renamed from: ۥۥۤۡ, reason: contains not printable characters */
    public static String m2813(Object obj) {
        if (C0052.m8320() > 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).R;
        }
        return null;
    }

    /* renamed from: ۥۦۡ۠, reason: contains not printable characters */
    public static JSONObject m2814(Object obj, Object obj2, Object obj3) {
        if (C0041.m6823() < 0) {
            return ((MYzhiqiu) obj).g((String) obj2, (JSONObject) obj3);
        }
        return null;
    }

    /* renamed from: ۥۦۥۦ, reason: contains not printable characters */
    public static Object m2815() {
        if (C0043.m7332() > 0) {
            return AbstractC0296g.g;
        }
        return null;
    }

    /* renamed from: ۥۧ۟ۦ, reason: contains not printable characters */
    public static void m2816(Object obj, Object obj2) {
        if (C0000.m1116() <= 0) {
            ((C0176b) obj).w((r) obj2);
        }
    }

    /* renamed from: ۦ۟۠ۥ, reason: contains not printable characters */
    public static WebView m2817() {
        if (C0032.m5686() <= 0) {
            return v.a;
        }
        return null;
    }

    /* renamed from: ۦ۟ۦۥ, reason: contains not printable characters */
    public static boolean m2818(Object obj, Object obj2, int i) {
        if (C0005.m1599() <= 0) {
            return ((AccessibilityNodeInfo) obj).removeChild((View) obj2, i);
        }
        return false;
    }

    /* renamed from: ۦ۠ۧۦ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.W.h m2819(Object obj) {
        if (C0022.m4497() > 0) {
            return ((C0229e) obj).e;
        }
        return null;
    }

    /* renamed from: ۦۣۣۡ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.W.h m2820() {
        if (C0033.m5872() > 0) {
            return com.github.catvod.spider.merge.W.g.a;
        }
        return null;
    }

    /* renamed from: ۦۧۡۧ, reason: contains not printable characters */
    public static void m2821(Object obj, int i) {
        if (C0004.m1557() < 0) {
            ((TextView) obj).setLines(i);
        }
    }

    /* renamed from: ۧۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m2822(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((Class) obj).isPrimitive();
        }
        return false;
    }

    /* renamed from: ۧۥۢۨ, reason: not valid java name and contains not printable characters */
    public static m m2823(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((com.github.catvod.spider.merge.l0.a) obj).c;
        }
        return null;
    }

    /* renamed from: ۧۦۦ, reason: not valid java name and contains not printable characters */
    public static int[] m2824() {
        if (C0010.m2320() <= 0) {
            return com.github.catvod.spider.merge.B.f.a;
        }
        return null;
    }

    /* renamed from: ۧۦۣۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m2825() {
        if (C0004.m1557() < 0) {
            return Mogg.a();
        }
        return null;
    }

    /* renamed from: ۨ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.l0.i m2826() {
        if (C0047.m7837() > 0) {
            return com.github.catvod.spider.merge.l0.i.d;
        }
        return null;
    }

    /* renamed from: ۣۨۤۧ, reason: not valid java name and contains not printable characters */
    public static String m2827(Object obj, Object obj2, Object obj3) {
        if (C0005.m1599() < 0) {
            return com.github.catvod.spider.merge.g0.g.h((String) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۨۦ۠, reason: not valid java name and contains not printable characters */
    public static void m2828(Object obj, Object obj2) {
        if (C0048.m7971() > 0) {
            ((com.github.catvod.spider.merge.E.m) obj).i((String) obj2);
        }
    }

    /* renamed from: ۨۧۡۨ, reason: not valid java name and contains not printable characters */
    public static void m2829(Object obj, Object obj2, boolean z) {
        if (C0042.m7147() < 0) {
            ((CookieManager) obj).setAcceptThirdPartyCookies((WebView) obj2, z);
        }
    }

    /* renamed from: ۨۧۦۤ, reason: not valid java name and contains not printable characters */
    public static int m2830(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۤۤۦۥ, reason: not valid java name and contains not printable characters */
    public static String m2805(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}