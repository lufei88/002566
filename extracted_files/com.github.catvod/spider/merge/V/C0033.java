package com.github.catvod.spider.merge.V;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.content.pm.ShortcutInfo;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.location.GnssStatus;
import android.net.Uri;
import android.os.Parcel;
import android.os.PersistableBundle;
import android.util.Size;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.webkit.WebSettings;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.github.catvod.spider.Cupfox;
import com.github.catvod.spider.Ddrk;
import com.github.catvod.spider.HBQG;
import com.github.catvod.spider.HBdiDuan;
import com.github.catvod.spider.HBmp4;
import com.github.catvod.spider.HBrren;
import com.github.catvod.spider.HBtiantian;
import com.github.catvod.spider.Local;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.Symx;
import com.github.catvod.spider.Wcai;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.D.f;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F.o;
import com.github.catvod.spider.merge.F0.X;
import com.github.catvod.spider.merge.F0.h0;
import com.github.catvod.spider.merge.F0.i0;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.E;
import com.github.catvod.spider.merge.P0.n;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.U.i;
import com.github.catvod.spider.merge.U.k;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.t;
import com.github.catvod.spider.merge.W.w;
import com.github.catvod.spider.merge.W.x;
import com.github.catvod.spider.merge.X0.u;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0232A;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.a0.DialogInterfaceOnDismissListenerC0243d;
import com.github.catvod.spider.merge.a0.L;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.RunnableC0239H;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.a1.h;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d0.d;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0277g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f.C0293d;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0314C;
import com.github.catvod.spider.merge.h0.O;
import com.github.catvod.spider.merge.h0.P;
import com.github.catvod.spider.merge.h0.Q;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.l0.e;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.D;
import com.github.catvod.spider.p000mergexbpq.P.G;
import com.github.catvod.spider.p000mergexbpq.P.s;
import com.github.catvod.spider.p000mergexbpq.Q.B;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.p0;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.d0.F;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.nio.IntBuffer;
import java.nio.channels.Pipe;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Pattern;
import okhttp3.OkHttpClient;

/* renamed from: com.github.catvod.spider.merge.V.ۧۡۢۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0033 {

    /* renamed from: ۦۢۤ۟, reason: contains not printable characters */
    public static int f631 = -899;

    /* renamed from: ۟۟۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m5781(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0025.m4797() > 0) {
            return ((Symx) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟۟ۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m5782(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((d) obj).q;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static String m5783() {
        if (C0047.m7837() > 0) {
            return "filter";
        }
        return null;
    }

    /* renamed from: ۟۟ۧۨۦ, reason: not valid java name and contains not printable characters */
    public static Serializable m5784(Object obj) {
        if (C0052.m8320() > 0) {
            return ((C0254o) obj).p;
        }
        return null;
    }

    /* renamed from: ۟۠۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static Uri.Builder m5785(Object obj, Object obj2) {
        if (C0009.m2047() >= 0) {
            return ((Uri.Builder) obj).scheme((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m5786(Object obj, Object obj2, int i) {
        if (C0049.m8038() < 0) {
            ((Activity) obj).requestPermissions((String[]) obj2, i);
        }
    }

    /* renamed from: ۟۠ۢۢۥ, reason: not valid java name and contains not printable characters */
    public static String m5787() {
        if (C0011.m2755() > 0) {
            return "$1";
        }
        return null;
    }

    /* renamed from: ۟۠ۢۦۨ, reason: not valid java name and contains not printable characters */
    public static String m5788() {
        if (C0052.m8320() > 0) {
            return h.a();
        }
        return null;
    }

    /* renamed from: ۣ۟۠۠, reason: not valid java name and contains not printable characters */
    public static int m5789(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((AccessibilityNodeInfo.RangeInfo) obj).getType();
        }
        return 0;
    }

    /* renamed from: ۣ۟۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static l m5790(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((l) obj).S();
        }
        return null;
    }

    /* renamed from: ۟۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static l m5791(Object obj) {
        if (m5872() > 0) {
            return ((l) obj).b0();
        }
        return null;
    }

    /* renamed from: ۟۠ۦۡۧ, reason: not valid java name and contains not printable characters */
    public static String m5792(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((O) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۡۢۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5793(Object obj) {
        if (C0026.m4977() < 0) {
            return ((InetAddress) obj).isAnyLocalAddress();
        }
        return false;
    }

    /* renamed from: ۟ۡۢۧۡ, reason: not valid java name and contains not printable characters */
    public static Charset m5794(Object obj) {
        if (C0056.m8886() < 0) {
            return ((CharsetEncoder) obj).charset();
        }
        return null;
    }

    /* renamed from: ۟ۡۤۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m5795(Object obj, char c) {
        if (C0034.m6048() < 0) {
            return ((C0174a) obj).r(c);
        }
        return false;
    }

    /* renamed from: ۟ۡۥۤۦ, reason: not valid java name and contains not printable characters */
    public static String m5796(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((HBmp4) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۡۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static SecurityManager m5797() {
        if (C0050.m8121() <= 0) {
            return System.getSecurityManager();
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۧۢ, reason: not valid java name and contains not printable characters */
    public static Pattern m5798(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((Ddrk) obj).g;
        }
        return null;
    }

    /* renamed from: ۟ۡۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m5799(Object obj) {
        if (C0048.m7971() > 0) {
            return ((C0232A) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Path.Op m5800() {
        if (C0002.m1242() > 0) {
            return Path.Op.UNION;
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static boolean m5801(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((p0) obj).j;
        }
        return false;
    }

    /* renamed from: ۟ۢۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static CharSequence m5802(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((ShortcutInfo) obj).getLongLabel();
        }
        return null;
    }

    /* renamed from: ۟ۢۢۢۦ, reason: not valid java name and contains not printable characters */
    public static int m5803(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((com.github.catvod.spider.merge.X0.d) obj).e;
        }
        return 0;
    }

    /* renamed from: ۟ۢۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Pattern m5804(Object obj) {
        if (C0053.m8389() > 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).r;
        }
        return null;
    }

    /* renamed from: ۟ۢۥۢۥ, reason: not valid java name and contains not printable characters */
    public static int m5805(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۟ۢۦۧۥ, reason: not valid java name and contains not printable characters */
    public static String m5806(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((com.github.catvod.spider.merge.E.l) obj).toString();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static void m5807(Object obj, boolean z) {
        if (C0064.m9659() <= 0) {
            ((WebSettings) obj).setBlockNetworkImage(z);
        }
    }

    /* renamed from: ۟ۢۨۥۤ, reason: not valid java name and contains not printable characters */
    public static ImageButton m5808(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((t) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۢۨۨۤ, reason: not valid java name and contains not printable characters */
    public static InetAddress m5809() {
        if (C0032.m5686() <= 0) {
            return InetAddress.getLocalHost();
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static String m5810() {
        if (C0057.m9017() >= 0) {
            return "输入验证码";
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.F.b m5811(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((C0314C) obj).j;
        }
        return null;
    }

    /* renamed from: ۣ۟ۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m5812() {
        if (C0017.m3633() <= 0) {
            return "play_header";
        }
        return null;
    }

    /* renamed from: ۣۣۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static AtomicReference m5813(Object obj) {
        if (C0046.m7701() >= 0) {
            return ((k) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۤ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static int m5814(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((GnssStatus) obj).hashCode();
        }
        return 0;
    }

    /* renamed from: ۟ۤ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static int m5815(Object obj) {
        if (C0031.m5628() > 0) {
            return ((B) obj).g();
        }
        return 0;
    }

    /* renamed from: ۟ۤۤۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5816(Object obj) {
        if (C0020.m4210() < 0) {
            return ((File) obj).createNewFile();
        }
        return false;
    }

    /* renamed from: ۟ۤۥۢۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m5817() {
        if (C0036.m6252() >= 0) {
            return w.k;
        }
        return null;
    }

    /* renamed from: ۟ۤۧۨۨ, reason: not valid java name and contains not printable characters */
    public static void m5818(Object obj, int i) {
        if (C0042.m7147() < 0) {
            ((Parcel) obj).writeInt(i);
        }
    }

    /* renamed from: ۟ۥ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static String m5819(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((m) obj).a();
        }
        return null;
    }

    /* renamed from: ۟ۥۣۡۧ, reason: not valid java name and contains not printable characters */
    public static int m5820(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((Size) obj).getWidth();
        }
        return 0;
    }

    /* renamed from: ۟ۥۣۤۥ, reason: not valid java name and contains not printable characters */
    public static void m5821(Object obj, Object obj2) {
        if (C0061.m9359() <= 0) {
            ((TextView) obj).setTextColor((ColorStateList) obj2);
        }
    }

    /* renamed from: ۟ۥۥۤ۟, reason: not valid java name and contains not printable characters */
    public static int m5822(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((X) obj).b;
        }
        return 0;
    }

    /* renamed from: ۟ۥۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m5823(Object obj, Object obj2) {
        if (C0003.m1463() < 0) {
            return C0259u.c((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۨۨۡ, reason: not valid java name and contains not printable characters */
    public static M m5824(Object obj) {
        if (C0063.m9589() < 0) {
            return ((RunnableC0239H) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static ImageButton m5825(Object obj) {
        if (C0036.m6252() > 0) {
            return ((x) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5826(Object obj, Object obj2) {
        if (C0062.m9429() >= 0) {
            return ((PersistableBundle) obj).containsKey((String) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۦۢۢ۠, reason: not valid java name and contains not printable characters */
    public static void m5827(Object obj) {
        if (C0036.m6252() >= 0) {
            ((C0233B) obj).c();
        }
    }

    /* renamed from: ۟ۦۣۢۤ, reason: not valid java name and contains not printable characters */
    public static String m5828(Object obj) {
        if (C0047.m7837() > 0) {
            return ((g) obj).toString();
        }
        return null;
    }

    /* renamed from: ۟ۦۤ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m5829(Object obj) {
        if (C0025.m4797() >= 0) {
            return ((com.github.catvod.spider.merge.I.b) obj).j();
        }
        return null;
    }

    /* renamed from: ۟ۦۣۤ۟, reason: not valid java name and contains not printable characters */
    public static String m5830(Object obj) {
        if (C0031.m5628() > 0) {
            return ((o) obj).b();
        }
        return null;
    }

    /* renamed from: ۟ۦۥۨ۟, reason: not valid java name and contains not printable characters */
    public static String m5831(Object obj) {
        if (m5872() >= 0) {
            return ((l) obj).e();
        }
        return null;
    }

    /* renamed from: ۟ۦۨۤ۠, reason: not valid java name and contains not printable characters */
    public static void m5832(Object obj, Object obj2, int i, Object obj3, Object obj4) {
        if (C0064.m9659() <= 0) {
            ((com.github.catvod.spider.merge.a.c) obj).notify((String) obj2, i, (String) obj3, (Notification) obj4);
        }
    }

    /* renamed from: ۟ۦۨۦۤ, reason: not valid java name and contains not printable characters */
    public static List m5833(Object obj) {
        if (C0020.m4210() <= 0) {
            return f.I((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۧ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static Uri.Builder m5834(Object obj, Object obj2) {
        if (C0009.m2047() >= 0) {
            return ((Uri.Builder) obj).appendEncodedPath((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static String m5835() {
        if (C0021.m4379() > 0) {
            return "发出post请求...";
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m5836(Object obj) {
        if (C0048.m7971() > 0) {
            return ((Wcai) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۧۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m5837(Object obj) {
        if (C0045.m7538() <= 0) {
            ((x) obj).a();
        }
    }

    /* renamed from: ۟ۧۡۧ۠, reason: not valid java name and contains not printable characters */
    public static Object m5838(Object obj) {
        if (C0026.m4977() < 0) {
            return ((Enumeration) obj).nextElement();
        }
        return null;
    }

    /* renamed from: ۟ۧۢۦ, reason: not valid java name and contains not printable characters */
    public static String m5839() {
        if (C0046.m7701() > 0) {
            return "介绍";
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static CharSequence m5840(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel();
        }
        return null;
    }

    /* renamed from: ۟ۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m5841(Object obj) {
        if (C0023.m4566() < 0) {
            return ((com.github.catvod.spider.merge.I.c) obj).f();
        }
        return null;
    }

    /* renamed from: ۠۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static String m5842(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((E) obj).b;
        }
        return null;
    }

    /* renamed from: ۠۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static String m5843(Object obj, Object obj2) {
        if (C0054.m8557() < 0) {
            return ((HBdiDuan) obj).getPlayUrl((String) obj2);
        }
        return null;
    }

    /* renamed from: ۠۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m5844(Object obj, Object obj2) {
        if (C0025.m4797() > 0) {
            ((AccessibilityNodeInfo) obj).setTraversalAfter((View) obj2);
        }
    }

    /* renamed from: ۣ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static AtomicReferenceFieldUpdater m5845(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((C0293d) obj).c;
        }
        return null;
    }

    /* renamed from: ۠۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static void m5846(Object obj, boolean z) {
        if (C0016.m3596() <= 0) {
            ((Animation) obj).setFillAfter(z);
        }
    }

    /* renamed from: ۣ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static String m5847(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((NG.VtInfo) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۦۨۧ, reason: not valid java name and contains not printable characters */
    public static Q m5848() {
        if (C0035.m6140() < 0) {
            return P.a;
        }
        return null;
    }

    /* renamed from: ۡۡۢۤ, reason: not valid java name and contains not printable characters */
    public static D m5849(Object obj, int i) {
        if (C0038.m6471() >= 0) {
            return ((G) obj).e(i);
        }
        return null;
    }

    /* renamed from: ۡۢۡۢ, reason: not valid java name and contains not printable characters */
    public static String m5850(Object obj) {
        if (C0008.m1975() > 0) {
            return ((Enum) obj).name();
        }
        return null;
    }

    /* renamed from: ۡۥۢۤ, reason: not valid java name and contains not printable characters */
    public static void m5851(Object obj, Object obj2, float f, float f2, Object obj3) {
        if (C0011.m2755() >= 0) {
            ((Canvas) obj).drawText((String) obj2, f, f2, (Paint) obj3);
        }
    }

    /* renamed from: ۣۢۡ۟, reason: not valid java name and contains not printable characters */
    public static void m5853(Object obj, int i) {
        if (C0059.m9257() < 0) {
            ((AccessibilityNodeInfo) obj).setDrawingOrder(i);
        }
    }

    /* renamed from: ۢۡۧ۟, reason: not valid java name and contains not printable characters */
    public static String m5854(Object obj, Object obj2, Object obj3) {
        if (C0045.m7538() < 0) {
            return g.p((ArrayList) obj, (ArrayList) obj2, (LinkedHashMap) obj3);
        }
        return null;
    }

    /* renamed from: ۢۤ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m5855(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0025.m4797() >= 0) {
            return ((Cupfox) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۢۤۦۣ, reason: not valid java name and contains not printable characters */
    public static Object m5856(Object obj, Object obj2) {
        if (C0050.m8121() <= 0) {
            return com.github.catvod.spider.merge.B0.a.g((String) obj, (Class) obj2);
        }
        return null;
    }

    /* renamed from: ۢۥۦۨ, reason: not valid java name and contains not printable characters */
    public static String m5857() {
        if (C0005.m1599() < 0) {
            return "调试->getFilterData出错：";
        }
        return null;
    }

    /* renamed from: ۢۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m5858(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((L) obj).f;
        }
        return null;
    }

    /* renamed from: ۢۨۤ۠, reason: not valid java name and contains not printable characters */
    public static Object m5859(Object obj, Object obj2) {
        if (C0057.m9017() > 0) {
            return ((u) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۣۡۡۡ, reason: not valid java name and contains not printable characters */
    public static String m5860() {
        if (C0011.m2755() > 0) {
            return "header";
        }
        return null;
    }

    /* renamed from: ۣۢۤ۟, reason: not valid java name and contains not printable characters */
    public static String m5861(Object obj) {
        if (C0027.m5017() > 0) {
            return ((com.github.catvod.spider.merge.I.c) obj).d();
        }
        return null;
    }

    /* renamed from: ۣۣۢۥ, reason: not valid java name and contains not printable characters */
    public static String m5862(Object obj) {
        if (C0038.m6471() > 0) {
            return com.github.catvod.spider.merge.g0.g.s((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۦۤۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.O.a m5863(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((M) obj).i;
        }
        return null;
    }

    /* renamed from: ۤ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.P0.h m5864() {
        if (C0032.m5686() < 0) {
            return n.x;
        }
        return null;
    }

    /* renamed from: ۤ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static Object m5865(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((HBQG) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۣۤۤ, reason: not valid java name and contains not printable characters */
    public static String m5866(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((e) obj).f;
        }
        return null;
    }

    /* renamed from: ۣۤۤۦ, reason: not valid java name and contains not printable characters */
    public static void m5867(Object obj) {
        if (C0053.m8389() > 0) {
            com.github.catvod.spider.merge.g1.g.a((String) obj);
        }
    }

    /* renamed from: ۤۤۤۥ, reason: not valid java name and contains not printable characters */
    public static IntBuffer m5868(Object obj, int i) {
        if (C0064.m9659() < 0) {
            return ((IntBuffer) obj).put(i);
        }
        return null;
    }

    /* renamed from: ۤۥۤۢ, reason: not valid java name and contains not printable characters */
    public static CountDownLatch m5869(Object obj) {
        if (C0004.m1557() < 0) {
            return ((i) obj).g;
        }
        return null;
    }

    /* renamed from: ۤۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m5870(Object obj) {
        if (C0038.m6471() > 0) {
            return ((com.github.catvod.spider.merge.F0.P) obj).d;
        }
        return false;
    }

    /* renamed from: ۥ۠ۡۤ, reason: contains not printable characters */
    public static String m5871(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((InetAddress) obj).getHostName();
        }
        return null;
    }

    /* renamed from: ۥۡۦۡ, reason: contains not printable characters */
    public static int m5872() {
        return (-299) ^ C0043.f745;
    }

    /* renamed from: ۥۣۡۨ, reason: contains not printable characters */
    public static List m5873(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((com.github.catvod.spider.merge.I.a) obj).a();
        }
        return null;
    }

    /* renamed from: ۥۣۤۢ, reason: contains not printable characters */
    public static String m5874(Object obj) {
        if (C0051.m8216() < 0) {
            return ((com.github.catvod.spider.merge.F.d) obj).a();
        }
        return null;
    }

    /* renamed from: ۥۦۤ, reason: contains not printable characters */
    public static AlertDialog.Builder m5875(Object obj, Object obj2) {
        if (C0004.m1557() <= 0) {
            return C0008.m2020((AlertDialog.Builder) obj, (DialogInterfaceOnDismissListenerC0243d) obj2);
        }
        return null;
    }

    /* renamed from: ۥۧۤ۠, reason: contains not printable characters */
    public static String m5876(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((com.github.catvod.spider.merge.Y0.b) obj).toString();
        }
        return null;
    }

    /* renamed from: ۥۨ۟ۡ, reason: contains not printable characters */
    public static Queue m5877(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((com.github.catvod.spider.merge.g1.d) obj).f;
        }
        return null;
    }

    /* renamed from: ۦ۟ۥ۟, reason: contains not printable characters */
    public static boolean m5878(Object obj) {
        if (C0007.m1886() > 0) {
            return ((F) obj).c();
        }
        return false;
    }

    /* renamed from: ۦ۠ۢۧ, reason: contains not printable characters */
    public static String m5879() {
        if (C0008.m1975() >= 0) {
            return "(";
        }
        return null;
    }

    /* renamed from: ۦۣۤۧ, reason: contains not printable characters */
    public static m m5880(Object obj, Object obj2) {
        if (m5872() >= 0) {
            return ((Local) obj).a((File) obj2);
        }
        return null;
    }

    /* renamed from: ۦۤۤۢ, reason: contains not printable characters */
    public static ConcurrentHashMap m5881(Object obj) {
        if (C0048.m7971() > 0) {
            return ((com.github.catvod.spider.merge.Z.c) obj).b;
        }
        return null;
    }

    /* renamed from: ۦۥۤۦ, reason: contains not printable characters */
    public static String m5882(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0015.m3433() > 0) {
            return ((HBtiantian) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۦۦ۟۟, reason: contains not printable characters */
    public static int m5883(Object obj) {
        if (C0021.m4379() > 0) {
            return ((s) obj).m;
        }
        return 0;
    }

    /* renamed from: ۦۧۡۨ, reason: contains not printable characters */
    public static String m5884() {
        if (C0025.m4797() >= 0) {
            return "vod_pic";
        }
        return null;
    }

    /* renamed from: ۧ۟ۤۡ, reason: not valid java name and contains not printable characters */
    public static int m5885(Object obj) {
        if (C0010.m2320() < 0) {
            return ((C0277g) obj).c;
        }
        return 0;
    }

    /* renamed from: ۣۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m5886(String str) {
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

    /* renamed from: ۧۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static i0 m5887(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((h0) obj).i;
        }
        return null;
    }

    /* renamed from: ۧۢۤ۟, reason: not valid java name and contains not printable characters */
    public static LinearLayout m5888(Object obj, Object obj2, Object obj3, int i) {
        if (C0001.m1164() < 0) {
            return ((com.github.catvod.spider.merge.W.h) obj).b((String) obj2, (SeekBar) obj3, i);
        }
        return null;
    }

    /* renamed from: ۣۧۥۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5889(Object obj) {
        if (C0027.m5017() > 0) {
            return ((HBrren) obj).f;
        }
        return null;
    }

    /* renamed from: ۧۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient m5890(Object obj) {
        if (C0060.m9355() > 0) {
            return ((com.github.catvod.spider.merge.Z.c) obj).a;
        }
        return null;
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.H0.e[] m5891() {
        if (C0054.m8557() < 0) {
            return com.github.catvod.spider.merge.H0.e.c;
        }
        return null;
    }

    /* renamed from: ۨۡۦۨ, reason: not valid java name and contains not printable characters */
    public static Pipe.SinkChannel m5892(Object obj) {
        if (C0010.m2320() < 0) {
            return ((Pipe) obj).sink();
        }
        return null;
    }

    /* renamed from: ۨۢۨۥ, reason: not valid java name and contains not printable characters */
    public static EditText m5893(Object obj) {
        if (C0003.m1463() <= 0) {
            return ((com.github.catvod.spider.merge.a0.O) obj).d;
        }
        return null;
    }

    /* renamed from: ۨۤ, reason: not valid java name and contains not printable characters */
    public static int m5894(Object obj) {
        if (C0052.m8320() > 0) {
            return ((com.github.catvod.spider.merge.a0.P) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۨۤ۟, reason: not valid java name and contains not printable characters */
    public static String m5895() {
        if (C0043.m7332() > 0) {
            return "j";
        }
        return null;
    }

    /* renamed from: ۨۨۨۥ, reason: not valid java name and contains not printable characters */
    public static void m5896(Object obj) throws IOException {
        if (C0011.m2755() >= 0) {
            ((DataOutputStream) obj).flush();
        }
    }

    /* renamed from: ۡۦ, reason: not valid java name and contains not printable characters */
    public static String m5852(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}