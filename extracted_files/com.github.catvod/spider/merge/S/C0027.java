package com.github.catvod.spider.merge.S;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.text.PrecomputedText;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import com.github.catvod.spider.HBDmSou;
import com.github.catvod.spider.HBcmsV1;
import com.github.catvod.spider.HBgetapp;
import com.github.catvod.spider.HBleiJing;
import com.github.catvod.spider.HBlingDu;
import com.github.catvod.spider.HBtiantianv3;
import com.github.catvod.spider.HBv1Class;
import com.github.catvod.spider.P123;
import com.github.catvod.spider.Quark;
import com.github.catvod.spider.XPathMac;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.D.f;
import com.github.catvod.spider.merge.E.j;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.E0.c;
import com.github.catvod.spider.merge.E0.h;
import com.github.catvod.spider.merge.E0.k;
import com.github.catvod.spider.merge.E0.o;
import com.github.catvod.spider.merge.E0.t;
import com.github.catvod.spider.merge.F0.AbstractC0152i;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0144a;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I.d;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.n;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.O;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.p;
import com.github.catvod.spider.merge.W.C;
import com.github.catvod.spider.merge.W.D;
import com.github.catvod.spider.merge.W.DialogInterfaceOnClickListenerC0227c;
import com.github.catvod.spider.merge.W.v;
import com.github.catvod.spider.merge.W.w;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnDismissListenerC0243d;
import com.github.catvod.spider.merge.a0.L;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.RunnableC0256q;
import com.github.catvod.spider.merge.a0.S;
import com.github.catvod.spider.merge.a0.T;
import com.github.catvod.spider.merge.a0.U;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d.C0267b;
import com.github.catvod.spider.merge.d.C0268c;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.e.C0276f;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.g;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0314C;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.l0.i;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.w.C0406j;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.y0.InterfaceC0416b;
import com.github.catvod.spider.p000mergexbpq.Q.B;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.l;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.r;
import com.github.catvod.spider.p000mergexbpq.e0.A;
import com.github.catvod.spider.p000mergexbpq.e0.C0126i;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.ZipEntry;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.S.ۦۥۦۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0027 {

    /* renamed from: ۢ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static int f493 = 895;

    /* renamed from: ۟۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static String m4983() {
        if (C0061.m9359() < 0) {
            return "var player_";
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static void m4984(Object obj) {
        if (C0051.m8216() <= 0) {
            ((C0176b) obj).A();
        }
    }

    /* renamed from: ۟۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static void m4985(Object obj, Object obj2) {
        if (C0001.m1164() <= 0) {
            ((h) obj).i((o) obj2);
        }
    }

    /* renamed from: ۟۟ۤۦۤ, reason: not valid java name and contains not printable characters */
    public static String m4986(Object obj, Object obj2, int i) {
        if (C0003.m1463() <= 0) {
            return ((P123) obj).detailContentVodPlayFrom((List) obj2, i);
        }
        return null;
    }

    /* renamed from: ۟۟ۤۦۧ, reason: not valid java name and contains not printable characters */
    public static IInterface m4987(Object obj, Object obj2) {
        if (C0031.m5628() > 0) {
            return ((IBinder) obj).queryLocalInterface((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟۟ۥۥۧ, reason: not valid java name and contains not printable characters */
    public static m m4988(Object obj, Object obj2) {
        if (C0059.m9257() <= 0) {
            return ((L) obj).g((j) obj2);
        }
        return null;
    }

    /* renamed from: ۟۟ۥۨۥ, reason: not valid java name and contains not printable characters */
    public static String m4989() {
        if (C0029.m5282() >= 0) {
            return "演员";
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m4990(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((B) obj).h();
        }
        return 0;
    }

    /* renamed from: ۟۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m4991(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m4992(Object obj, Object obj2, Object obj3) {
        if (C0030.m5375() >= 0) {
            return f.b((String) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟۠ۧۦۤ, reason: not valid java name and contains not printable characters */
    public static InputStream m4993(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((Socket) obj).getInputStream();
        }
        return null;
    }

    /* renamed from: ۟۠ۨۥۥ, reason: not valid java name and contains not printable characters */
    public static int[] m4994(Object obj, int i) {
        if (C0045.m7538() <= 0) {
            return Arrays.copyOf((int[]) obj, i);
        }
        return null;
    }

    /* renamed from: ۟ۡ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static int m4995(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((C0126i) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۡ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static W m4996(Object obj) {
        if (C0004.m1557() < 0) {
            return ((T) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۡۡۢۢ, reason: not valid java name and contains not printable characters */
    public static int m4997(Object obj) {
        if (C0025.m4797() > 0) {
            return ((com.github.catvod.spider.merge.C.b) obj).k;
        }
        return 0;
    }

    /* renamed from: ۟ۡۢ۟۟, reason: not valid java name and contains not printable characters */
    public static String m4998(Object obj) {
        if (C0044.m7508() < 0) {
            return ((com.github.catvod.spider.merge.O.b) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۡۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m4999(Object obj) {
        if (C0016.m3596() < 0) {
            com.github.catvod.spider.merge.N0.b.i(obj);
        }
    }

    /* renamed from: ۟ۡۧۥۨ, reason: not valid java name and contains not printable characters */
    public static void m5000(Object obj, Object obj2) {
        if (C0012.m3024() > 0) {
            ((m) obj).g((String) obj2);
        }
    }

    /* renamed from: ۟ۡۨۧ۠, reason: not valid java name and contains not printable characters */
    public static int m5001(Object obj) {
        if (C0007.m1886() >= 0) {
            return ((c) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۢۢۤۧ, reason: not valid java name and contains not printable characters */
    public static String m5002(Object obj) {
        if (C0029.m5282() > 0) {
            return ((U) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۢۢۦۧ, reason: not valid java name and contains not printable characters */
    public static ExecutorService m5003() {
        if (C0046.m7701() >= 0) {
            return Executors.newSingleThreadExecutor();
        }
        return null;
    }

    /* renamed from: ۟ۢۢۧۦ, reason: not valid java name and contains not printable characters */
    public static Object m5004(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((DialogInterfaceOnClickListenerC0227c) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۢۥۢۤ, reason: not valid java name and contains not printable characters */
    public static CharBuffer m5005(Object obj, Object obj2) {
        if (C0000.m1116() < 0) {
            return ((CharBuffer) obj).put((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢۦۣۤ, reason: not valid java name and contains not printable characters */
    public static String[] m5006() {
        if (C0033.m5872() >= 0) {
            return p.d;
        }
        return null;
    }

    /* renamed from: ۟ۢۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m5007(Object obj) {
        if (C0053.m8389() > 0) {
            return ((C0276f) obj).c;
        }
        return 0;
    }

    /* renamed from: ۟ۢۧۤ۟, reason: not valid java name and contains not printable characters */
    public static int m5008(Object obj) {
        if (C0036.m6252() > 0) {
            return ((k) obj).m;
        }
        return 0;
    }

    /* renamed from: ۣۣ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static int m5009(Object obj) {
        if (C0037.m6350() < 0) {
            return ((A) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m5010(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((HBgetapp) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۥ۠, reason: not valid java name and contains not printable characters */
    public static String m5011(String str) {
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

    /* renamed from: ۟ۤ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static void m5012(Object obj, Object obj2, int i) {
        if (C0038.m6471() >= 0) {
            ((ViewGroup) obj).addView((View) obj2, i);
        }
    }

    /* renamed from: ۣ۟ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static String m5013() {
        if (C0005.m1599() < 0) {
            return "getJsonArray()错误！-->";
        }
        return null;
    }

    /* renamed from: ۟ۤۢۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5014(Object obj) {
        if (C0026.m4977() <= 0) {
            return com.github.catvod.spider.p000mergexbpq.b0.b.c((String) obj);
        }
        return false;
    }

    /* renamed from: ۟ۤۢۧ۟, reason: not valid java name and contains not printable characters */
    public static String m5015(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((com.github.catvod.spider.merge.U.m) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۥۢ, reason: not valid java name and contains not printable characters */
    public static String m5016(Object obj) {
        if (C0008.m1975() >= 0) {
            return com.github.catvod.spider.p000mergexbpq.j.o.e((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۤۤۤ۠, reason: not valid java name and contains not printable characters */
    public static int m5017() {
        return 547 ^ C0001.f154;
    }

    /* renamed from: ۟ۤۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static C0144a m5018(Object obj) {
        if (C0033.m5872() > 0) {
            return ((AbstractC0152i) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۤۦۣۢ, reason: not valid java name and contains not printable characters */
    public static Object[] m5019(Object obj, Object obj2) {
        if (C0015.m3433() >= 0) {
            return ((LinkedList) obj).toArray((Object[]) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۧۨۧ, reason: not valid java name and contains not printable characters */
    public static Transition m5020(Object obj, Object obj2) {
        if (C0006.m1726() < 0) {
            return ((Transition) obj).addListener((Transition.TransitionListener) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static int m5021(Object obj) {
        if (C0015.m3433() > 0) {
            return ((D) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۥ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static Activity m5022(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((C) obj).b();
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static String m5023() {
        if (C0060.m9355() > 0) {
            return v.b;
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5024(Object obj, Object obj2) {
        if (C0023.m4566() <= 0) {
            return ((Locale) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۥۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m5025(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((StringTokenizer) obj).nextToken();
        }
        return null;
    }

    /* renamed from: ۟ۥۥۥۣ, reason: not valid java name and contains not printable characters */
    public static l m5026(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.P.B) obj).h();
        }
        return null;
    }

    /* renamed from: ۟ۥۦۧۢ, reason: not valid java name and contains not printable characters */
    public static void m5027(Object obj) {
        if (C0031.m5628() >= 0) {
            ((com.github.catvod.spider.merge.X0.A) obj).G();
        }
    }

    /* renamed from: ۟ۥۣۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5028(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((O) obj).f();
        }
        return false;
    }

    /* renamed from: ۟ۦۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static m m5029(Object obj, Object obj2, Object obj3) {
        if (C0064.m9659() <= 0) {
            return ((com.github.catvod.spider.merge.G.c) obj).f((com.github.catvod.spider.merge.G.a) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۦۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static List m5030() {
        if (C0036.m6252() > 0) {
            return g.d;
        }
        return null;
    }

    /* renamed from: ۟ۦۢۥۧ, reason: not valid java name and contains not printable characters */
    public static List m5031(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((com.github.catvod.spider.merge.T0.m) obj).z();
        }
        return null;
    }

    /* renamed from: ۟ۦۢۨ, reason: not valid java name and contains not printable characters */
    public static String m5032(Object obj, int i) {
        if (C0039.m6529() < 0) {
            return ((com.github.catvod.spider.merge.E0.v) obj).b(i);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۤ۟, reason: not valid java name and contains not printable characters */
    public static int m5033(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((ShortcutInfo) obj).getDisabledReason();
        }
        return 0;
    }

    /* renamed from: ۟ۦۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.V.a m5034(Object obj) {
        if (C0054.m8557() < 0) {
            return ((HBDmSou) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۦۦۤۡ, reason: not valid java name and contains not printable characters */
    public static String m5035(Object obj) {
        if (C0049.m8038() < 0) {
            return ((XPathMac) obj).f;
        }
        return null;
    }

    /* renamed from: ۟ۦۨۨۦ, reason: not valid java name and contains not printable characters */
    public static int m5036(int i, Object obj) {
        if (C0020.m4210() < 0) {
            return com.github.catvod.spider.p000mergexbpq.N.a.p(i, obj);
        }
        return 0;
    }

    /* renamed from: ۟ۧ۠ۢ۠, reason: not valid java name and contains not printable characters */
    public static long m5037(long j, long j2) {
        if (C0056.m8886() <= 0) {
            return Math.min(j, j2);
        }
        return 0L;
    }

    /* renamed from: ۟ۧۡۤ, reason: not valid java name and contains not printable characters */
    public static void m5038(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0020.m4210() <= 0) {
            com.github.catvod.spider.p000mergexbpq.j.k.A((String) obj, (String) obj2, (String) obj3, (com.github.catvod.spider.p000mergexbpq.j.j) obj4);
        }
    }

    /* renamed from: ۟ۧۡۨۦ, reason: not valid java name and contains not printable characters */
    public static String m5039(Object obj) {
        if (C0032.m5686() < 0) {
            return ((HBv1Class) obj).e;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5040(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((com.github.catvod.spider.merge.B.l) obj).h;
        }
        return false;
    }

    /* renamed from: ۟ۧۦۧۢ, reason: not valid java name and contains not printable characters */
    public static void m5041(Object obj, Object obj2) {
        if (C0054.m8557() <= 0) {
            ((k) obj).c((com.github.catvod.spider.merge.E0.l) obj2);
        }
    }

    /* renamed from: ۠۠۟۟, reason: not valid java name and contains not printable characters */
    public static Object m5042(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((com.github.catvod.spider.merge.b0.h) obj).c;
        }
        return null;
    }

    /* renamed from: ۠۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m5043(Object obj, Object obj2) {
        if (C0018.m3956() > 0) {
            ((WebSettings) obj).setUserAgentString((String) obj2);
        }
    }

    /* renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static n m5044(Object obj) {
        if (C0055.m8740() >= 0) {
            return n.valueOf((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static r m5045(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((r) obj).s();
        }
        return null;
    }

    /* renamed from: ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static StringBuffer m5046(Object obj, int i) {
        if (C0015.m3433() >= 0) {
            return ((StringBuffer) obj).append(i);
        }
        return null;
    }

    /* renamed from: ۠ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static C0259u m5047(Object obj) {
        if (C0052.m8320() > 0) {
            return ((RunnableC0256q) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۤۦۨ, reason: not valid java name and contains not printable characters */
    public static i m5048(Object obj) {
        if (C0056.m8886() < 0) {
            return ((com.github.catvod.spider.merge.l0.k) obj).a;
        }
        return null;
    }

    /* renamed from: ۠ۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m5049(Object obj) throws IOException {
        if (C0041.m6823() <= 0) {
            ((OutputStream) obj).close();
        }
    }

    /* renamed from: ۠ۦۨۥ, reason: not valid java name and contains not printable characters */
    public static void m5050(Object obj) {
        if (C0005.m1599() <= 0) {
            ((com.github.catvod.spider.merge.X0.A) obj).C();
        }
    }

    /* renamed from: ۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static String m5051() {
        if (C0061.m9359() <= 0) {
            return "\\{(.*?)\\}";
        }
        return null;
    }

    /* renamed from: ۡ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static ViewPropertyAnimatorUpdateListener m5052(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((C0406j) obj).a;
        }
        return null;
    }

    /* renamed from: ۡ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static String m5053(Object obj, Object obj2) {
        if (C0061.m9359() <= 0) {
            return URLDecoder.decode((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۡ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static boolean m5054(Object obj, Object obj2) {
        if (C0005.m1599() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.S.i) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۡ۠۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m5055() {
        if (C0046.m7701() >= 0) {
            return "特殊分类url";
        }
        return null;
    }

    /* renamed from: ۡۡۥۨ, reason: not valid java name and contains not printable characters */
    public static int m5056(Object obj) {
        if (C0039.m6529() <= 0) {
            return com.github.catvod.spider.merge.l0.f.a((String) obj);
        }
        return 0;
    }

    /* renamed from: ۣۡ, reason: not valid java name and contains not printable characters */
    public static String m5057(Object obj) {
        if (C0002.m1242() > 0) {
            return ((HBtiantianv3) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۣۡۡ, reason: not valid java name and contains not printable characters */
    public static WindowManager.LayoutParams m5058(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((Window) obj).getAttributes();
        }
        return null;
    }

    /* renamed from: ۡۤۥ۟, reason: not valid java name and contains not printable characters */
    public static String m5059(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((com.github.catvod.spider.merge.F.g) obj).a();
        }
        return null;
    }

    /* renamed from: ۡۥۧۡ, reason: not valid java name and contains not printable characters */
    public static String m5060() {
        if (C0023.m4566() <= 0) {
            return "获取首页资源错误！-->";
        }
        return null;
    }

    /* renamed from: ۡۧۥۥ, reason: not valid java name and contains not printable characters */
    public static String m5061(Object obj) {
        if (C0033.m5872() > 0) {
            return ((M) obj).i();
        }
        return null;
    }

    /* renamed from: ۢ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static void m5063(Object obj, Object obj2) {
        if (m5017() > 0) {
            S.n((String) obj, (String) obj2);
        }
    }

    /* renamed from: ۢ۠ۤۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.P.D m5064(Object obj) {
        if (C0012.m3024() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.T.f) obj).a();
        }
        return null;
    }

    /* renamed from: ۣۢۢۤ, reason: not valid java name and contains not printable characters */
    public static int m5065(Object obj) {
        if (C0039.m6529() < 0) {
            return com.github.catvod.spider.merge.F0.L.l((C0148e) obj);
        }
        return 0;
    }

    /* renamed from: ۢۦ۟, reason: not valid java name and contains not printable characters */
    public static SocketFactory m5066() {
        if (C0018.m3956() > 0) {
            return SSLSocketFactory.getDefault();
        }
        return null;
    }

    /* renamed from: ۢۦۢۤ, reason: not valid java name and contains not printable characters */
    public static String m5067() {
        if (C0017.m3633() <= 0) {
            return "ttp";
        }
        return null;
    }

    /* renamed from: ۢۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5068(Object obj, Object obj2) {
        if (C0064.m9659() <= 0) {
            return ((C0174a) obj).s((char[]) obj2);
        }
        return false;
    }

    /* renamed from: ۣ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static void m5069(Object obj, int i) {
        if (C0059.m9257() < 0) {
            ((WebSettings) obj).setMixedContentMode(i);
        }
    }

    /* renamed from: ۣۡ۟, reason: not valid java name and contains not printable characters */
    public static void m5070(Object obj, float f) {
        if (C0063.m9589() < 0) {
            C0021.m4378((Button) obj, f);
        }
    }

    /* renamed from: ۣۢۢۥ, reason: not valid java name and contains not printable characters */
    public static String m5071() {
        if (C0007.m1886() > 0) {
            return "/proxy?do=seachdanmu&go=senddanmu';\n            const url = `${baseUrl}&username=${encodeURIComponent(username)}&message=${encodeURIComponent(message)}`;\n            \n            // 发送GET请求\n            fetch(url)\n                .then(response => {\n                    if (!response.ok) {\n                        throw new Error('发送失败，状态码: ' + response.status);\n                    }\n                    return response.text();\n                })\n                .then(data => {\n                    // 假设服务器返回成功信息\n                    showMessage(data, 'success');\n                    // 清空文本输入框，保留用户名\n                    messageInput.value = '';\n                })\n                .catch(error => {\n                    showMessage('发送失败: ' + error.message, 'failure');\n                });\n        }\n        \n        // 显示消息提示\n        function showMessage(text, type) {\n            responseMessage.textContent = text;\n            responseMessage.className = `response-message ${type}`;\n            responseMessage.style.display = 'block';\n            \n            // 3秒后隐藏提示\n            setTimeout(() => {\n                responseMessage.style.display = 'none';\n            }, 3000);\n        }     </script></body></html>";
        }
        return null;
    }

    /* renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m5072(Object obj) {
        if (C0001.m1164() <= 0) {
            ((ExecutorService) obj).shutdown();
        }
    }

    /* renamed from: ۣۣۤۨ, reason: not valid java name and contains not printable characters */
    public static String m5073(Object obj) {
        if (C0060.m9355() > 0) {
            return ((ShortcutInfo) obj).getId();
        }
        return null;
    }

    /* renamed from: ۣۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m5074(Object obj) {
        if (C0047.m7837() > 0) {
            return ((C0314C) obj).h;
        }
        return 0;
    }

    /* renamed from: ۣۦۧۢ, reason: not valid java name and contains not printable characters */
    public static int m5075(Object obj, Object obj2, int i) {
        if (C0032.m5686() <= 0) {
            return ((JSONObject) obj).optInt((String) obj2, i);
        }
        return 0;
    }

    /* renamed from: ۣۨۦۥ, reason: not valid java name and contains not printable characters */
    public static C0268c m5076(Object obj, Object obj2) {
        if (C0055.m8740() >= 0) {
            return ((C0267b) obj).c((C0268c) obj2);
        }
        return null;
    }

    /* renamed from: ۤ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static void m5077(Object obj, Object obj2) {
        if (C0019.m4065() <= 0) {
            Collections.sort((List) obj, (Comparator) obj2);
        }
    }

    /* renamed from: ۤۡۥۡ, reason: not valid java name and contains not printable characters */
    public static int m5078(Object obj, Object obj2) {
        if (C0044.m7508() < 0) {
            return ((com.github.catvod.spider.merge.Z0.a) obj).b(obj2);
        }
        return 0;
    }

    /* renamed from: ۤۡۧۦ, reason: not valid java name and contains not printable characters */
    public static String m5079(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((d) obj).a();
        }
        return null;
    }

    /* renamed from: ۣۤۦۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5080(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((C0288g) obj).f;
        }
        return false;
    }

    /* renamed from: ۤۥۦۣ, reason: not valid java name and contains not printable characters */
    public static String m5081(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0003.m1463() <= 0) {
            return ((HBleiJing) obj).searchContent((String) obj2, (String) obj3, z);
        }
        return null;
    }

    /* renamed from: ۤۨۢۡ, reason: not valid java name and contains not printable characters */
    public static Object m5082(Object obj) {
        if (m5017() > 0) {
            return ((c) obj).d;
        }
        return null;
    }

    /* renamed from: ۥ۠۟ۤ, reason: contains not printable characters */
    public static void m5083(Object obj, Object obj2) {
        if (C0036.m6252() >= 0) {
            ((com.github.catvod.spider.merge.l0.d) obj).a((com.github.catvod.spider.merge.l0.a) obj2);
        }
    }

    /* renamed from: ۥ۠ۨۤ, reason: contains not printable characters */
    public static AlertDialog.Builder m5084(Object obj, Object obj2) {
        if (C0016.m3596() < 0) {
            return C0008.m2020((AlertDialog.Builder) obj, (DialogInterfaceOnDismissListenerC0243d) obj2);
        }
        return null;
    }

    /* renamed from: ۥۡ۟ۡ, reason: contains not printable characters */
    public static String m5085() {
        if (C0002.m1242() > 0) {
            return ";post;";
        }
        return null;
    }

    /* renamed from: ۥۨۤۦ, reason: contains not printable characters */
    public static void m5086() {
        if (C0056.m8886() <= 0) {
            C0028.m5135(true);
        }
    }

    /* renamed from: ۦ۟ۡۨ, reason: contains not printable characters */
    public static String m5087(Object obj) {
        if (C0025.m4797() >= 0) {
            return com.github.catvod.spider.merge.a1.g.c((String) obj);
        }
        return null;
    }

    /* renamed from: ۦ۟ۧ۠, reason: contains not printable characters */
    public static t m5088(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((com.github.catvod.spider.merge.E0.f) obj).a;
        }
        return null;
    }

    /* renamed from: ۦۣ۠۟, reason: contains not printable characters */
    public static String m5089(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.g) obj).c();
        }
        return null;
    }

    /* renamed from: ۦ۠ۦۨ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.B.g m5090() {
        if (C0064.m9659() <= 0) {
            return com.github.catvod.spider.merge.B.g.ON_START;
        }
        return null;
    }

    /* renamed from: ۦۣۢۧ, reason: contains not printable characters */
    public static WebView m5091(Object obj) {
        if (C0032.m5686() <= 0) {
            return com.github.catvod.spider.merge.W.B.c((Activity) obj);
        }
        return null;
    }

    /* renamed from: ۦۦ۠ۨ, reason: contains not printable characters */
    public static List m5092(Object obj) {
        if (C0022.m4497() > 0) {
            return ((InterfaceC0416b) obj).getTypeParameters();
        }
        return null;
    }

    /* renamed from: ۦۧ۟ۥ, reason: contains not printable characters */
    public static PackageManager m5093(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((Context) obj).getPackageManager();
        }
        return null;
    }

    /* renamed from: ۧۡۢ, reason: not valid java name and contains not printable characters */
    public static int m5094(Object obj) {
        if (C0031.m5628() > 0) {
            return ((PrecomputedText.Params) obj).getBreakStrategy();
        }
        return 0;
    }

    /* renamed from: ۧۥۥۦ, reason: not valid java name and contains not printable characters */
    public static Object[] m5095(Object obj) {
        if (C0028.m5152() <= 0) {
            return Quark.proxy((Map) obj);
        }
        return null;
    }

    /* renamed from: ۨ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Map m5096(Object obj) {
        if (C0055.m8740() > 0) {
            return HBlingDu.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۨۡۧۢ, reason: not valid java name and contains not printable characters */
    public static int m5097(Object obj, int i) {
        if (C0064.m9659() < 0) {
            return ((com.github.catvod.spider.merge.E0.f) obj).d(i);
        }
        return 0;
    }

    /* renamed from: ۨۤۡ۟, reason: not valid java name and contains not printable characters */
    public static String m5098(Object obj) {
        if (C0025.m4797() > 0) {
            return ((ZipEntry) obj).getName();
        }
        return null;
    }

    /* renamed from: ۨۤۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m5099(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((com.github.catvod.spider.merge.H0.f) obj).b;
        }
        return false;
    }

    /* renamed from: ۨۥۢ۠, reason: not valid java name and contains not printable characters */
    public static String m5100(Object obj) {
        if (C0016.m3596() < 0) {
            return ((w) obj).j;
        }
        return null;
    }

    /* renamed from: ۨۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m5101() {
        if (C0040.m6582() > 0) {
            return HBcmsV1.a();
        }
        return null;
    }

    /* renamed from: ۨۨۡ, reason: not valid java name and contains not printable characters */
    public static String m5102(Object obj) {
        if (C0043.m7332() > 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).m;
        }
        return null;
    }

    /* renamed from: ۡۧۨۢ, reason: not valid java name and contains not printable characters */
    public static String m5062(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}