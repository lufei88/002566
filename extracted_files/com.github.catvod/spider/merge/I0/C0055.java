package com.github.catvod.spider.merge.i0;

import android.app.Activity;
import android.app.Notification;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Switch;
import android.widget.TextView;
import androidx.core.view.DragStartHelper;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.HB360;
import com.github.catvod.spider.HBCupfox;
import com.github.catvod.spider.HBmoou;
import com.github.catvod.spider.HBoFun;
import com.github.catvod.spider.HBrren;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.XBPQb;
import com.github.catvod.spider.merge.D.f;
import com.github.catvod.spider.merge.E.l;
import com.github.catvod.spider.merge.E0.h;
import com.github.catvod.spider.merge.E0.o;
import com.github.catvod.spider.merge.E0.p;
import com.github.catvod.spider.merge.E0.q;
import com.github.catvod.spider.merge.E0.s;
import com.github.catvod.spider.merge.F0.AbstractC0152i;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0144a;
import com.github.catvod.spider.merge.F0.C0145b;
import com.github.catvod.spider.merge.F0.C0147d;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.C0150g;
import com.github.catvod.spider.merge.F0.C0163u;
import com.github.catvod.spider.merge.F0.Q;
import com.github.catvod.spider.merge.F0.c0;
import com.github.catvod.spider.merge.F0.r;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I.j;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.O.b;
import com.github.catvod.spider.merge.O.c;
import com.github.catvod.spider.merge.P0.AbstractC0169a;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.C0171c;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.N;
import com.github.catvod.spider.merge.U0.O;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.t;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.AbstractC0252m;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0232A;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.a0.J;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.RunnableC0261w;
import com.github.catvod.spider.merge.a0.ViewOnClickListenerC0260v;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.a1.i;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c.ThreadFactoryC0265b;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d0.d;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e0.C0285d;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f0.C0302e;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.g;
import com.github.catvod.spider.merge.h0.C0314C;
import com.github.catvod.spider.merge.h0.DialogInterfaceOnClickListenerC0319H;
import com.github.catvod.spider.merge.l0.e;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.w.ViewOnLongClickListenerC0398b;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.w;
import com.github.catvod.spider.p000mergexbpq.P.y;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.S;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.d0.P;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonObject;
import java.io.ByteArrayOutputStream;
import java.io.Reader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.nio.channels.Pipe;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.i0.ۣ۟۟ۡ۟, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0055 {

    /* renamed from: ۟ۦۤۦۡ, reason: not valid java name and contains not printable characters */
    public static int f825 = 340;

    /* renamed from: ۟۟۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static String m8696() {
        if (C0006.m1726() <= 0) {
            return ".*Jb?\\d+.*";
        }
        return null;
    }

    /* renamed from: ۟۟ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m8697(Object obj) {
        if (C0063.m9589() < 0) {
            return ((m) obj).J();
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static String m8698(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).L;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static String m8699() {
        if (C0006.m1726() < 0) {
            return "\\$sub\\:";
        }
        return null;
    }

    /* renamed from: ۟۟ۦۡۤ, reason: not valid java name and contains not printable characters */
    public static String m8700(Object obj) {
        if (C0045.m7538() < 0) {
            return ((b) obj).e;
        }
        return null;
    }

    /* renamed from: ۟۟ۦۤۥ, reason: not valid java name and contains not printable characters */
    public static String m8701(Object obj) {
        if (C0041.m6823() <= 0) {
            return HBCupfox.c((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static String m8702(Object obj) {
        if (C0008.m1975() > 0) {
            return ((O) obj).a;
        }
        return null;
    }

    /* renamed from: ۟۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m8703() {
        if (C0064.m9659() <= 0) {
            return f.A();
        }
        return null;
    }

    /* renamed from: ۟۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static int m8704(Object obj) {
        if (C0018.m3956() > 0) {
            return ((AbstractC0152i) obj).b;
        }
        return 0;
    }

    /* renamed from: ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m8705(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((com.github.catvod.spider.merge.N0.b) obj).l;
        }
        return null;
    }

    /* renamed from: ۟ۡ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static Charset m8706(Object obj) {
        if (C0050.m8121() <= 0) {
            return Charset.forName((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۡۡۤ۟, reason: not valid java name and contains not printable characters */
    public static String m8707(Object obj, Object obj2) {
        if (C0061.m9359() <= 0) {
            return ((com.github.catvod.spider.merge.X.a) obj).a((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۡۥ۟, reason: not valid java name and contains not printable characters */
    public static String m8708(Object obj, Object obj2) {
        if (C0058.m9131() < 0) {
            return ((C0233B) obj).n((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۡۦ۠, reason: not valid java name and contains not printable characters */
    public static C0254o m8709() {
        if (C0026.m4977() < 0) {
            return AbstractC0252m.a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static String m8710() {
        if (C0015.m3433() >= 0) {
            return "###";
        }
        return null;
    }

    /* renamed from: ۟ۡۤ۠۠, reason: not valid java name and contains not printable characters */
    public static HashMap m8711() {
        if (C0038.m6471() >= 0) {
            return HB360.a();
        }
        return null;
    }

    /* renamed from: ۟ۡۧ۠, reason: not valid java name and contains not printable characters */
    public static void m8712(Object obj) {
        if (C0042.m7147() <= 0) {
            ((N) obj).f();
        }
    }

    /* renamed from: ۟ۡۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static UUID m8713() {
        if (C0038.m6471() > 0) {
            return UUID.randomUUID();
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m8714(Object obj) {
        if (C0041.m6823() <= 0) {
            return Arrays.toString((Object[]) obj);
        }
        return null;
    }

    /* renamed from: ۟ۢ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m8715(Object obj, Object obj2) {
        if (C0047.m7837() > 0) {
            ((f) obj).d((String) obj2);
        }
    }

    /* renamed from: ۟ۢۢۧۢ, reason: not valid java name and contains not printable characters */
    public static Object m8716(Object obj, int i, Object obj2) {
        if (C0006.m1726() < 0) {
            return ((ArrayList) obj).set(i, obj2);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static String m8717(Object obj) {
        if (C0033.m5872() > 0) {
            return g.a((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۢۦۣۦ, reason: not valid java name and contains not printable characters */
    public static Pattern m8718(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).p;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static int m8719(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((c0) obj).b;
        }
        return 0;
    }

    /* renamed from: ۣ۟۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static LinkedList m8720(Object obj, Object obj2) {
        if (C0004.m1557() < 0) {
            return ((C0163u) obj).f((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static int m8721(Object obj) {
        if (m8740() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.P.f) obj).h();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۢۦۧ, reason: not valid java name and contains not printable characters */
    public static InetAddress m8722(Object obj) {
        if (C0052.m8320() > 0) {
            return ((Socket) obj).getInetAddress();
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۢۢ, reason: not valid java name and contains not printable characters */
    public static int m8723(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((d) obj).c;
        }
        return 0;
    }

    /* renamed from: ۟ۤ۟ۢۥ, reason: not valid java name and contains not printable characters */
    public static String m8724(String str) {
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

    /* renamed from: ۟ۤ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static String m8725(Object obj) {
        if (C0000.m1116() < 0) {
            return ((HBmoou) obj).h;
        }
        return null;
    }

    /* renamed from: ۟ۤۡۢۧ, reason: not valid java name and contains not printable characters */
    public static String m8726() {
        if (C0051.m8216() <= 0) {
            return "\\";
        }
        return null;
    }

    /* renamed from: ۟ۤۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m8727(Object obj) {
        if (C0015.m3433() > 0) {
            return ((Calendar) obj).getWeekYear();
        }
        return 0;
    }

    /* renamed from: ۟ۤۤۨۧ, reason: not valid java name and contains not printable characters */
    public static M m8728(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((J) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۤۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m8729() {
        if (C0035.m6140() < 0) {
            return i.a();
        }
        return null;
    }

    /* renamed from: ۟ۤۥۣ۟, reason: not valid java name and contains not printable characters */
    public static Locale m8730() {
        if (C0064.m9659() <= 0) {
            return Locale.ROOT;
        }
        return null;
    }

    /* renamed from: ۟ۤۥۥۦ, reason: not valid java name and contains not printable characters */
    public static String m8731() {
        if (C0002.m1242() > 0) {
            return Environment.DIRECTORY_DOWNLOADS;
        }
        return null;
    }

    /* renamed from: ۟ۤۦ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m8732(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0045.m7538() <= 0) {
            com.github.catvod.spider.merge.B0.a.x((String) obj, (String) obj2, (String) obj3, (String) obj4, (ArrayList) obj5);
        }
    }

    /* renamed from: ۟ۤۦۨۧ, reason: not valid java name and contains not printable characters */
    public static void m8733(Object obj, Object obj2, Object obj3, int i, int i2, int i3, Object obj4) {
        if (C0005.m1599() <= 0) {
            ((y) obj).d((w) obj2, (com.github.catvod.spider.p000mergexbpq.R.b) obj3, i, i2, i3, (com.github.catvod.spider.p000mergexbpq.Q.f) obj4);
        }
    }

    /* renamed from: ۟ۤۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m8734(Object obj, Object obj2) {
        if (C0043.m7332() > 0) {
            return ((ShortcutManager) obj).setDynamicShortcuts((List) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۤۨۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8735(Object obj) {
        if (C0027.m5017() > 0) {
            return ((com.github.catvod.spider.merge.G0.d) obj).g;
        }
        return false;
    }

    /* renamed from: ۟ۥ۟۟, reason: not valid java name and contains not printable characters */
    public static String m8736(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((f) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥۣۣ۠, reason: not valid java name and contains not printable characters */
    public static C0144a m8737(Object obj, Object obj2) {
        if (C0004.m1557() <= 0) {
            return ((C0150g) obj).b((char[]) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8738(Object obj) {
        if (C0021.m4379() > 0) {
            return ((ShortcutInfo) obj).isEnabled();
        }
        return false;
    }

    /* renamed from: ۟ۥۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8739(Object obj) {
        if (C0007.m1886() > 0) {
            return ((com.github.catvod.spider.merge.g1.d) obj).g;
        }
        return false;
    }

    /* renamed from: ۟ۦۡۨۡ, reason: not valid java name and contains not printable characters */
    public static int m8740() {
        return (-74) ^ C0035.f685;
    }

    /* renamed from: ۟ۦۢۢۨ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.RangeInfo m8741(Object obj) {
        if (C0022.m4497() > 0) {
            return ((AccessibilityNodeInfo) obj).getRangeInfo();
        }
        return null;
    }

    /* renamed from: ۟ۦۣۦ, reason: not valid java name and contains not printable characters */
    public static c m8742(Object obj) {
        if (C0035.m6140() < 0) {
            return ((com.github.catvod.spider.merge.O.a) obj).a();
        }
        return null;
    }

    /* renamed from: ۟ۦۣۤۢ, reason: not valid java name and contains not printable characters */
    public static C0147d m8743(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((C0148e) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۦۤۥ۟, reason: not valid java name and contains not printable characters */
    public static JsonObject m8744(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((f) obj).j;
        }
        return null;
    }

    /* renamed from: ۟ۦۥۧۨ, reason: not valid java name and contains not printable characters */
    public static int m8745(Object obj, Object obj2) {
        if (C0018.m3956() > 0) {
            return ((com.github.catvod.spider.merge.T0.c) obj).h((String) obj2);
        }
        return 0;
    }

    /* renamed from: ۟ۦۦۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8746(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((com.github.catvod.spider.merge.H0.a) obj).c;
        }
        return false;
    }

    /* renamed from: ۟ۧ۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static Handler m8747(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((t) obj).h;
        }
        return null;
    }

    /* renamed from: ۟ۧۡۧ۟, reason: not valid java name and contains not printable characters */
    public static int m8748(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۟ۧۢۢۤ, reason: not valid java name and contains not printable characters */
    public static DragStartHelper m8749(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((ViewOnLongClickListenerC0398b) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۧۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static TextView m8750(Object obj, int i, Object obj2) {
        if (C0037.m6350() <= 0) {
            return C0302e.b((Activity) obj, i, (ViewGroup.LayoutParams) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static C0171c m8751() {
        if (C0056.m8886() < 0) {
            return AbstractC0169a.a;
        }
        return null;
    }

    /* renamed from: ۟ۨۧ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.l0.i m8752() {
        if (C0047.m7837() > 0) {
            return com.github.catvod.spider.merge.l0.i.e;
        }
        return null;
    }

    /* renamed from: ۣ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m8753(Object obj, Object obj2) {
        if (C0063.m9589() < 0) {
            com.github.catvod.spider.merge.w0.g.c(obj, (String) obj2);
        }
    }

    /* renamed from: ۠۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.g1.d m8754(Object obj) {
        if (C0038.m6471() > 0) {
            return ((com.github.catvod.spider.merge.f1.c) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۡۢۤ, reason: not valid java name and contains not printable characters */
    public static String m8755(Object obj) {
        if (C0042.m7147() < 0) {
            return ((com.github.catvod.spider.merge.l0.i) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static String m8756(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((HBoFun) obj).a;
        }
        return null;
    }

    /* renamed from: ۠ۡۦۣ, reason: not valid java name and contains not printable characters */
    public static void m8757(Object obj) {
        if (C0025.m4797() >= 0) {
            ((l) obj).i();
        }
    }

    /* renamed from: ۠ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static String[] m8758() {
        if (C0047.m7837() > 0) {
            return C0176b.B;
        }
        return null;
    }

    /* renamed from: ۠ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static String m8759() {
        if (C0002.m1242() >= 0) {
            return "万与丑专业丛东丝丢两严丧个丬丰临为丽举么义乌乐乔习乡书买乱争于亏云亘亚产亩亲亵亸亿仅从仑仓仪们价众优伙会伛伞伟传伤伥伦伧伪伫体余佣佥侠侣侥侦侧侨侩侪侬俣俦俨俩俪俭债倾偬偻偾偿傥傧储傩儿兑兖党兰关兴兹养兽冁内冈册写军农冢冯冲决况冻净凄凉凌减凑凛几凤凫凭凯击凼凿刍划刘则刚创删别刬刭刽刿剀剂剐剑剥剧劝办务劢动励劲劳势勋勐勚匀匦匮区医华协单卖卢卤卧卫却卺厂厅历厉压厌厍厕厢厣厦厨厩厮县参叆叇双发变叙叠叶号叹叽吁后吓吕吗吣吨听启吴呒呓呕呖呗员呙呛呜咏咔咙咛咝咤咴咸哌响哑哒哓哔哕哗哙哜哝哟唛唝唠唡唢唣唤唿啧啬啭啮啰啴啸喷喽喾嗫呵嗳嘘嘤嘱噜噼嚣嚯团园囱围囵国图圆圣圹场坂坏块坚坛坜坝坞坟坠垄垅垆垒垦垧垩垫垭垯垱垲垴埘埙埚埝埯堑堕塆墙壮声壳壶壸处备复够头夸夹夺奁奂奋奖奥妆妇妈妩妪妫姗娄娅娆娇娈娱娲娴婳婴婵婶媪嫒嫔嫱嬷孙学孪宁宝实宠审宪宫宽宾寝对寻导寿将尔尘尧尴尸尽层屃屉届属屡屦屿岁岂岖岗岘岙岚岛岭岽岿峃峄峡峣峤峥峦崂崃崄崭嵘嵚嵛嵝嵴巅巩巯币帅师帏帐帘帜带帧帮帱帻帼幂幞干并广庄庆庐庑库应庙庞废庼廪开异弃张弥弪弯弹强归当录彟彦彻径徕御忆忏忧忾怀态怂怃怄怅怆怜总怼怿恋恳恶恸恹恺恻恼恽悦悫悬悭悯惊惧惨惩惫惬惭惮惯愍愠愤愦愿慑慭憷懑懒懔戆戋戏戗战戬户扎扑扦执扩扪扫扬扰抚抛抟抠抡抢护报担拟拢拣拥拦拧拨择挂挚挛挜挝挞挟挠挡挢挣挤挥挦捞损捡换捣据捻掳掴掷掸掺掼揸揽揿搀搁搂搅携摄摅摆摇摈摊撄撑撵撷撸撺擞攒敌敛数斋斓斗斩断无旧时旷旸昙昼昽显晋晒晓晔晕晖暂暧札术朴机杀杂权条来杨杩杰极构枞枢枣枥枧枨枪枫枭柜柠柽栀栅标栈栉栊栋栌栎栏树栖样栾桊桠桡桢档桤桥桦桧桨桩梦梼梾检棂椁椟椠椤椭楼榄榇榈榉槚槛槟槠横樯樱橥橱橹橼檐檩欢欤欧歼殁殇残殒殓殚殡殴毁毂毕毙毡毵氇气氢氩氲汇汉污汤汹沓沟没沣沤沥沦沧沨沩沪沵泞泪泶泷泸泺泻泼泽泾洁洒洼浃浅浆浇浈浉浊测浍济浏浐浑浒浓浔浕涂涌涛涝涞涟涠涡涢涣涤润涧涨涩淀渊渌渍渎渐渑渔渖渗温游湾湿溃溅溆溇滗滚滞滟滠满滢滤滥滦滨滩滪潆潇潋潍潜潴澜濑濒灏灭灯灵灾灿炀炉炖炜炝点炼炽烁烂烃烛烟烦烧烨烩烫烬热焕焖焘煅煳熘爱爷牍牦牵牺犊强状犷犸犹狈狍狝狞独狭狮狯狰狱狲猃猎猕猡猪猫猬献獭玑玙玚玛玮环现玱玺珉珏珐珑珰珲琎琏琐琼瑶瑷璇璎瓒瓮瓯电画畅畲畴疖疗疟疠疡疬疮疯疱疴痈痉痒痖痨痪痫痴瘅瘆瘗瘘瘪瘫瘾瘿癞癣癫癯皑皱皲盏盐监盖盗盘眍眦眬着睁睐睑瞒瞩矫矶矾矿砀码砖砗砚砜砺砻砾础硁硅硕硖硗硙硚确硷碍碛碜碱碹磙礼祎祢祯祷祸禀禄禅离秃秆种积称秽秾稆税稣稳穑穷窃窍窑窜窝窥窦窭竖竞笃笋笔笕笺笼笾筑筚筛筜筝筹签简箓箦箧箨箩箪箫篑篓篮篱簖籁籴类籼粜粝粤粪粮糁糇紧絷纟纠纡红纣纤纥约级纨纩纪纫纬纭纮纯纰纱纲纳纴纵纶纷纸纹纺纻纼纽纾线绀绁绂练组绅细织终绉绊绋绌绍绎经绐绑绒结绔绕绖绗绘给绚绛络绝绞统绠绡绢绣绤绥绦继绨绩绪绫绬续绮绯绰绱绲绳维绵绶绷绸绹绺绻综绽绾绿缀缁缂缃缄缅缆缇缈缉缊缋缌缍缎缏缐缑缒缓缔缕编缗缘缙缚缛缜缝缞缟缠缡缢缣缤缥缦缧缨缩缪缫缬缭缮缯缰缱缲缳缴缵罂网罗罚罢罴羁羟羡翘翙翚耢耧耸耻聂聋职聍联聩聪肃肠肤肷肾肿胀胁胆胜胧胨胪胫胶脉脍脏脐脑脓脔脚脱脶脸腊腌腘腭腻腼腽腾膑臜舆舣舰舱舻艰艳艹艺节芈芗芜芦苁苇苈苋苌苍苎苏苘苹茎茏茑茔茕茧荆荐荙荚荛荜荞荟荠荡荣荤荥荦荧荨荩荪荫荬荭荮药莅莜莱莲莳莴莶获莸莹莺莼萚萝萤营萦萧萨葱蒇蒉蒋蒌蓝蓟蓠蓣蓥蓦蔷蔹蔺蔼蕲蕴薮藁藓虏虑虚虫虬虮虽虾虿蚀蚁蚂蚕蚝蚬蛊蛎蛏蛮蛰蛱蛲蛳蛴蜕蜗蜡蝇蝈蝉蝎蝼蝾螀螨蟏衅衔补衬衮袄袅袆袜袭袯装裆裈裢裣裤裥褛褴襁襕见观觃规觅视觇览觉觊觋觌觍觎觏觐觑觞触觯詟誉誊讠计订讣认讥讦讧讨让讪讫训议讯记讱讲讳讴讵讶讷许讹论讻讼讽设访诀证诂诃评诅识诇诈诉诊诋诌词诎诏诐译诒诓诔试诖诗诘诙诚诛诜话诞诟诠诡询诣诤该详诧诨诩诪诫诬语诮误诰诱诲诳说诵诶请诸诹诺读诼诽课诿谀谁谂调谄谅谆谇谈谊谋谌谍谎谏谐谑谒谓谔谕谖谗谘谙谚谛谜谝谞谟谠谡谢谣谤谥谦谧谨谩谪谫谬谭谮谯谰谱谲谳谴谵谶谷豮贝贞负贠贡财责贤败账货质贩贪贫贬购贮贯贰贱贲贳贴贵贶贷贸费贺贻贼贽贾贿赀赁赂赃资赅赆赇赈赉赊赋赌赍赎赏赐赑赒赓赔赕赖赗赘赙赚赛赜赝赞赟赠赡赢赣赪赵赶趋趱趸跃跄跖跞践跶跷跸跹跻踊踌踪踬踯蹑蹒蹰蹿躏躜躯车轧轨轩轪轫转轭轮软轰轱轲轳轴轵轶轷轸轹轺轻轼载轾轿辀辁辂较辄辅辆辇辈辉辊辋辌辍辎辏辐辑辒输辔辕辖辗辘辙辚辞辩辫边辽达迁过迈运还这进远违连迟迩迳迹适选逊递逦逻遗遥邓邝邬邮邹邺邻郁郄郏郐郑郓郦郧郸酝酦酱酽酾酿释里鉅鉴銮錾钆钇针钉钊钋钌钍钎钏钐钑钒钓钔钕钖钗钘钙钚钛钝钞钟钠钡钢钣钤钥钦钧钨钩钪钫钬钭钮钯钰钱钲钳钴钵钶钷钸钹钺钻钼钽钾钿铀铁铂铃铄铅铆铈铉铊铋铍铎铏铐铑铒铕铗铘铙铚铛铜铝铞铟铠铡铢铣铤铥铦铧铨铪铫铬铭铮铯铰铱铲铳铴铵银铷铸铹铺铻铼铽链铿销锁锂锃锄锅锆锇锈锉锊锋锌锍锎锏锐锑锒锓锔锕锖锗错锚锜锞锟锠锡锢锣锤锥锦锨锩锫锬锭键锯锰锱锲锳锴锵锶锷锸锹锺锻锼锽锾锿镀镁镂镃镆镇镈镉镊镌镍镎镏镐镑镒镕镖镗镙镚镛镜镝镞镟镠镡镢镣镤镥镦镧镨镩镪镫镬镭镮镯镰镱镲镳镴镶长门闩闪闫闬闭问闯闰闱闲闳间闵闶闷闸闹闺闻闼闽闾闿阀阁阂阃阄阅阆阇阈阉阊阋阌阍阎阏阐阑阒阓阔阕阖阗阘阙阚阛队阳阴阵阶际陆陇陈陉陕陧陨险随隐隶隽难雏雠雳雾霁霉霭靓静靥鞑鞒鞯鞴韦韧韨韩韪韫韬韵页顶顷顸项顺须顼顽顾顿颀颁颂颃预颅领颇颈颉颊颋颌颍颎颏颐频颒颓颔颕颖颗题颙颚颛颜额颞颟颠颡颢颣颤颥颦颧风飏飐飑飒飓飔飕飖飗飘飙飚飞飨餍饤饥饦饧饨饩饪饫饬饭饮饯饰饱饲饳饴饵饶饷饸饹饺饻饼饽饾饿馀馁馂馃馄馅馆馇馈馉馊馋馌馍馎馏馐馑馒馓馔馕马驭驮驯驰驱驲驳驴驵驶驷驸驹驺驻驼驽驾驿骀骁骂骃骄骅骆骇骈骉骊骋验骍骎骏骐骑骒骓骔骕骖骗骘骙骚骛骜骝骞骟骠骡骢骣骤骥骦骧髅髋髌鬓魇魉鱼鱽鱾鱿鲀鲁鲂鲄鲅鲆鲇鲈鲉鲊鲋鲌鲍鲎鲏鲐鲑鲒鲓鲔鲕鲖鲗鲘鲙鲚鲛鲜鲝鲞鲟鲠鲡鲢鲣鲤鲥鲦鲧鲨鲩鲪鲫鲬鲭鲮鲯鲰鲱鲲鲳鲴鲵鲶鲷鲸鲹鲺鲻鲼鲽鲾鲿鳀鳁鳂鳃鳄鳅鳆鳇鳈鳉鳊鳋鳌鳍鳎鳏鳐鳑鳒鳓鳔鳕鳖鳗鳘鳙鳛鳜鳝鳞鳟鳠鳡鳢鳣鸟鸠鸡鸢鸣鸤鸥鸦鸧鸨鸩鸪鸫鸬鸭鸮鸯鸰鸱鸲鸳鸴鸵鸶鸷鸸鸹鸺鸻鸼鸽鸾鸿鹀鹁鹂鹃鹄鹅鹆鹇鹈鹉鹊鹋鹌鹍鹎鹏鹐鹑鹒鹓鹔鹕鹖鹗鹘鹚鹛鹜鹝鹞鹟鹠鹡鹢鹣鹤鹥鹦鹧鹨鹩鹪鹫鹬鹭鹯鹰鹱鹲鹳鹴鹾麦麸黄黉黡黩黪黾鼋鼌鼍鼗鼹齄齐齑齿龀龁龂龃龄龅龆龇龈龉龊龋龌龙龚龛龟志制咨范松冇尝尝闹准钟彆闲干尽脏拼作";
        }
        return null;
    }

    /* renamed from: ۠ۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m8760(Object obj, Object obj2) {
        if (C0040.m6582() > 0) {
            e.b((String) obj, (Map) obj2);
        }
    }

    /* renamed from: ۠ۦۣۥ, reason: not valid java name and contains not printable characters */
    public static void m8761(Object obj, Object obj2) {
        if (C0024.m4693() < 0) {
            ((com.github.catvod.spider.merge.Q.a) obj).f((String) obj2);
        }
    }

    /* renamed from: ۠ۦۨۤ, reason: not valid java name and contains not printable characters */
    public static j m8762(Object obj) {
        if (C0053.m8389() > 0) {
            return ((Bili) obj).d;
        }
        return null;
    }

    /* renamed from: ۠ۧۤۧ, reason: not valid java name and contains not printable characters */
    public static String m8763(char c) {
        if (C0031.m5628() > 0) {
            return String.valueOf(c);
        }
        return null;
    }

    /* renamed from: ۠ۨ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.Y0.a m8764(Object obj) {
        if (C0049.m8038() < 0) {
            return ((com.github.catvod.spider.merge.Y0.c) obj).a();
        }
        return null;
    }

    /* renamed from: ۠ۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static AtomicInteger m8765(Object obj) {
        if (m8740() > 0) {
            return ((ThreadFactoryC0265b) obj).a;
        }
        return null;
    }

    /* renamed from: ۡ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static C0285d m8766(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((C0288g) obj).b;
        }
        return null;
    }

    /* renamed from: ۡۡۡۤ, reason: not valid java name and contains not printable characters */
    public static Pipe m8767() {
        if (C0058.m9131() <= 0) {
            return Pipe.open();
        }
        return null;
    }

    /* renamed from: ۣۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m8768(Object obj, Object obj2) {
        if (C0030.m5375() > 0) {
            ((C0259u) obj).m((String) obj2);
        }
    }

    /* renamed from: ۡۥۣۢ, reason: not valid java name and contains not printable characters */
    public static String m8769(Object obj) {
        if (C0038.m6471() > 0) {
            return ((C) obj).h;
        }
        return null;
    }

    /* renamed from: ۡۦۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8770(Object obj, Object obj2) {
        if (C0016.m3596() <= 0) {
            return ((C0147d) obj).contains(obj2);
        }
        return false;
    }

    /* renamed from: ۢۡ۟۟, reason: not valid java name and contains not printable characters */
    public static String m8771(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.g) obj).b();
        }
        return null;
    }

    /* renamed from: ۣۢۥۦ, reason: not valid java name and contains not printable characters */
    public static int[] m8772() {
        if (C0012.m3024() >= 0) {
            return com.github.catvod.spider.merge.H0.d.c;
        }
        return null;
    }

    /* renamed from: ۢۤ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m8773(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((RunnableC0261w) obj).a;
        }
        return 0;
    }

    /* renamed from: ۢۤۦ۠, reason: not valid java name and contains not printable characters */
    public static String m8774(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((XBPQb) obj).d;
        }
        return null;
    }

    /* renamed from: ۢۥۡۦ, reason: not valid java name and contains not printable characters */
    public static String m8775(Object obj) {
        if (C0030.m5375() > 0) {
            return com.github.catvod.spider.merge.E.g.g((String) obj);
        }
        return null;
    }

    /* renamed from: ۢۥۤۤ, reason: not valid java name and contains not printable characters */
    public static Object[] m8776(Object obj) {
        if (C0020.m4210() < 0) {
            return FishHxq.proxy((Map) obj);
        }
        return null;
    }

    /* renamed from: ۢۧ۠۠, reason: not valid java name and contains not printable characters */
    public static Q m8777(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((C0145b) obj).c;
        }
        return null;
    }

    /* renamed from: ۢۨۢ, reason: not valid java name and contains not printable characters */
    public static String m8778(Object obj) {
        if (C0057.m9017() > 0) {
            return ((m) obj).Q();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8779(Object obj, Object obj2) {
        if (C0036.m6252() > 0) {
            return ((C0176b) obj).D((N) obj2);
        }
        return false;
    }

    /* renamed from: ۣۣ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m8780(Object obj) {
        if (C0063.m9589() <= 0) {
            ((TextView) obj).setSingleLine();
        }
    }

    /* renamed from: ۣۣۨۥ, reason: not valid java name and contains not printable characters */
    public static Parcelable.Creator m8781() {
        if (C0053.m8389() > 0) {
            return Notification.CREATOR;
        }
        return null;
    }

    /* renamed from: ۣۣۨۤ, reason: not valid java name and contains not printable characters */
    public static String m8782(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((URL) obj).getQuery();
        }
        return null;
    }

    /* renamed from: ۤ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.d.g m8783(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.g) obj).a();
        }
        return null;
    }

    /* renamed from: ۤ۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m8784(Object obj, Object obj2) {
        if (C0004.m1557() < 0) {
            return com.github.catvod.spider.merge.Z0.c.a((Iterator) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۤۢۦۣ, reason: not valid java name and contains not printable characters */
    public static int m8785(Object obj) {
        if (C0039.m6529() < 0) {
            return ((ViewOnClickListenerC0260v) obj).a;
        }
        return 0;
    }

    /* renamed from: ۤۤ۟۟, reason: not valid java name and contains not printable characters */
    public static void m8786(Object obj) {
        if (C0014.m3353() <= 0) {
            ((com.github.catvod.spider.merge.H.b) obj).a();
        }
    }

    /* renamed from: ۣۤۤۤ, reason: not valid java name and contains not printable characters */
    public static int m8787(Object obj) {
        if (C0052.m8320() > 0) {
            return ((com.github.catvod.spider.merge.V0.i) obj).a;
        }
        return 0;
    }

    /* renamed from: ۤۥۤۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8788(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((AccessibilityNodeInfo) obj).isTextEntryKey();
        }
        return false;
    }

    /* renamed from: ۤۦۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m8789(Object obj) {
        if (C0057.m9017() > 0) {
            return ((C0314C) obj).c;
        }
        return false;
    }

    /* renamed from: ۤۧۦۨ, reason: not valid java name and contains not printable characters */
    public static AsyncTask m8790(Object obj, Object obj2) {
        if (C0031.m5628() > 0) {
            return ((AsyncTask) obj).execute((Object[]) obj2);
        }
        return null;
    }

    /* renamed from: ۥ۟ۥۤ, reason: contains not printable characters */
    public static void m8791(Object obj) {
        if (C0014.m3353() < 0) {
            Collections.sort((List) obj);
        }
    }

    /* renamed from: ۥ۟ۨۥ, reason: contains not printable characters */
    public static List m8792(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((NG.Rst) obj).getList();
        }
        return null;
    }

    /* renamed from: ۥۡۥۧ, reason: contains not printable characters */
    public static boolean m8793(Object obj, Object obj2) {
        if (C0047.m7837() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.c) obj).m((String) obj2);
        }
        return false;
    }

    /* renamed from: ۥۢ۠ۡ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.e1.b m8794() {
        if (C0056.m8886() <= 0) {
            return com.github.catvod.spider.merge.d1.a.d;
        }
        return null;
    }

    /* renamed from: ۥۢۦۣ, reason: contains not printable characters */
    public static String m8795(Object obj) {
        if (C0049.m8038() < 0) {
            return com.github.catvod.spider.p000mergexbpq.x.a.c((String) obj);
        }
        return null;
    }

    /* renamed from: ۥۣۦۢ, reason: contains not printable characters */
    public static boolean m8796(Object obj) {
        if (C0035.m6140() < 0) {
            return ((ShortcutInfo) obj).isDynamic();
        }
        return false;
    }

    /* renamed from: ۥۣۨ۠, reason: contains not printable characters */
    public static long m8797(Object obj, long j) {
        if (C0022.m4497() >= 0) {
            return ((Reader) obj).skip(j);
        }
        return 0L;
    }

    /* renamed from: ۥۦۦۡ, reason: contains not printable characters */
    public static boolean m8798(Object obj) {
        if (C0029.m5282() > 0) {
            return ((P) obj).i();
        }
        return false;
    }

    /* renamed from: ۦۢۢۢ, reason: contains not printable characters */
    public static boolean m8799(char c) {
        if (C0013.m3167() > 0) {
            return Character.isLetter(c);
        }
        return false;
    }

    /* renamed from: ۦۤۤۦ, reason: contains not printable characters */
    public static void m8800(Object obj, Object obj2, Object obj3, int i, int i2, Object obj4, Object obj5) {
        if (C0053.m8389() >= 0) {
            ((com.github.catvod.spider.merge.E0.g) obj).d((s) obj2, obj3, i, i2, (String) obj4, (q) obj5);
        }
    }

    /* renamed from: ۦۥۤۢ, reason: contains not printable characters */
    public static Map m8801(Object obj) {
        if (C0013.m3167() > 0) {
            return ((HBrren) obj).getHeaderss();
        }
        return null;
    }

    /* renamed from: ۦۨۨۨ, reason: contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.S.j m8802(int i, int i2) {
        if (C0023.m4566() <= 0) {
            return com.github.catvod.spider.p000mergexbpq.S.j.g(i, i2);
        }
        return null;
    }

    /* renamed from: ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Pattern m8803() {
        if (C0060.m9355() > 0) {
            return com.github.catvod.spider.merge.V.b.b;
        }
        return null;
    }

    /* renamed from: ۧ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m8804(Object obj, int i, int i2) {
        if (C0011.m2755() >= 0) {
            return ((StringBuilder) obj).delete(i, i2);
        }
        return null;
    }

    /* renamed from: ۧ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8805() {
        if (C0048.m7971() >= 0) {
            return S.k;
        }
        return false;
    }

    /* renamed from: ۧۡۦۢ, reason: not valid java name and contains not printable characters */
    public static String m8806(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((C0232A) obj).c;
        }
        return null;
    }

    /* renamed from: ۧۤۤۦ, reason: not valid java name and contains not printable characters */
    public static void m8807(Object obj, Object obj2) {
        if (C0056.m8886() < 0) {
            ((com.github.catvod.spider.merge.a.c) obj).cancelAll((String) obj2);
        }
    }

    /* renamed from: ۧۦۤۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.H0.f m8808(Object obj, int i, Object obj2) {
        if (C0035.m6140() < 0) {
            return ((C0144a) obj).b(i, (p) obj2);
        }
        return null;
    }

    /* renamed from: ۧۨۦۣ, reason: not valid java name and contains not printable characters */
    public static boolean m8809(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((r) obj).h;
        }
        return false;
    }

    /* renamed from: ۣۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.d m8810(Object obj, Object obj2) {
        if (C0007.m1886() > 0) {
            return ((h) obj).j((o) obj2);
        }
        return null;
    }

    /* renamed from: ۨ۠۠, reason: not valid java name and contains not printable characters */
    public static void m8811(Object obj, Object obj2) {
        if (C0005.m1599() < 0) {
            ((AccessibilityNodeInfo) obj).setRangeInfo((AccessibilityNodeInfo.RangeInfo) obj2);
        }
    }

    /* renamed from: ۣۨۢ۟, reason: not valid java name and contains not printable characters */
    public static String m8812(Object obj) {
        if (C0000.m1116() < 0) {
            return ((com.github.catvod.spider.merge.E.j) obj).c;
        }
        return null;
    }

    /* renamed from: ۨۦۣۧ, reason: not valid java name and contains not printable characters */
    public static Switch m8813(Object obj) {
        if (C0034.m6048() < 0) {
            return ((DialogInterfaceOnClickListenerC0319H) obj).d;
        }
        return null;
    }

    /* renamed from: ۨۨۨۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m8815(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0003.m1463() < 0) {
            return ((C0233B) obj).g((String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6);
        }
        return null;
    }

    /* renamed from: ۣۨۨۧ, reason: not valid java name and contains not printable characters */
    public static String m8814(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}