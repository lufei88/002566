package com.github.catvod.spider.merge.K0;

import android.app.Activity;
import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.util.Predicate;
import com.github.catvod.spider.AppZzun;
import com.github.catvod.spider.Baidu;
import com.github.catvod.spider.HB4kav;
import com.github.catvod.spider.HBDmSou;
import com.github.catvod.spider.HBNT4;
import com.github.catvod.spider.HBlive;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.Notice;
import com.github.catvod.spider.XBPQ;
import com.github.catvod.spider.XBPQc;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E0.v;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0166x;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.H0.f;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.y;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.g;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.q;
import com.github.catvod.spider.merge.W.t;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.X0.o;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.Z0.k;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0271a;
import com.github.catvod.spider.merge.f.C0290a;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.h0.Q;
import com.github.catvod.spider.merge.h0.RunnableC0321a;
import com.github.catvod.spider.merge.h0.S;
import com.github.catvod.spider.merge.h0.x;
import com.github.catvod.spider.merge.i.C0343c;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.AbstractC0376b;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.y0.InterfaceC0416b;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.j;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.h;
import com.github.catvod.spider.p000mergexbpq.d0.E;
import com.github.catvod.spider.p000mergexbpq.d0.F;
import com.github.catvod.spider.p000mergexbpq.d0.P;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.j.m;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import org.json.JSONObject;
import org.slf4j.impl.StaticLoggerBinder;

/* renamed from: com.github.catvod.spider.merge.K0.۠ۧۦۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0022 {

    /* renamed from: ۟ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static int f465 = 873;

    /* renamed from: ۟۟۟۠ۡ, reason: not valid java name and contains not printable characters */
    public static Object m4394(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((j) obj).d;
        }
        return null;
    }

    /* renamed from: ۟۟۠ۨۥ, reason: not valid java name and contains not printable characters */
    public static HashMap m4395() {
        if (C0043.m7332() >= 0) {
            return t.k;
        }
        return null;
    }

    /* renamed from: ۟۟ۡۢۦ, reason: not valid java name and contains not printable characters */
    public static int m4396(Object obj) {
        if (C0024.m4693() < 0) {
            return ((Notification.Action) obj).icon;
        }
        return 0;
    }

    /* renamed from: ۟۟ۥۣ۟, reason: not valid java name and contains not printable characters */
    public static String m4397(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).P;
        }
        return null;
    }

    /* renamed from: ۟۟ۥۦۨ, reason: not valid java name and contains not printable characters */
    public static void m4398(Object obj, Object obj2) {
        if (C0030.m5375() >= 0) {
            ((AccessibilityNodeInfo) obj).setAvailableExtraData((List) obj2);
        }
    }

    /* renamed from: ۟۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static String m4399(Object obj) {
        if (C0043.m7332() > 0) {
            return ((File) obj).getAbsolutePath();
        }
        return null;
    }

    /* renamed from: ۟۟ۧۡ۠, reason: not valid java name and contains not printable characters */
    public static String m4400(Object obj, boolean z) {
        if (C0024.m4693() <= 0) {
            return ((Notice) obj).homeContent(z);
        }
        return null;
    }

    /* renamed from: ۣ۟۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m4401() {
        if (C0032.m5686() < 0) {
            return " <div class=\"episode\" data-url=\"http://";
        }
        return null;
    }

    /* renamed from: ۟۠ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static void m4402(Object obj) {
        if (C0002.m1242() > 0) {
            ((com.github.catvod.spider.merge.d0.d) obj).a();
        }
    }

    /* renamed from: ۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0416b m4404(Object obj) {
        if (C0063.m9589() < 0) {
            return ((com.github.catvod.spider.merge.w0.b) obj).getReflected();
        }
        return null;
    }

    /* renamed from: ۟۠ۥ۠۟, reason: not valid java name and contains not printable characters */
    public static Q m4405(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((S) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۠ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static int m4406(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((C0271a) obj).d();
        }
        return 0;
    }

    /* renamed from: ۟۠ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m4407(int i) {
        if (C0013.m3167() >= 0) {
            return ByteBuffer.allocate(i);
        }
        return null;
    }

    /* renamed from: ۟۠ۦۤۥ, reason: not valid java name and contains not printable characters */
    public static void m4408(Object obj) {
        if (C0013.m3167() > 0) {
            ((A) obj).m();
        }
    }

    /* renamed from: ۟۠ۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m4409() {
        if (C0036.m6252() >= 0) {
            return "fenlei";
        }
        return null;
    }

    /* renamed from: ۟ۡ۠۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m4410() {
        if (C0045.m7538() <= 0) {
            return "\n            </div>\n        </div>";
        }
        return null;
    }

    /* renamed from: ۟ۡۡۤۡ, reason: not valid java name and contains not printable characters */
    public static String m4411() {
        if (C0054.m8557() < 0) {
            return "调试->跳转播放链接出错：";
        }
        return null;
    }

    /* renamed from: ۟ۡۢۢۤ, reason: not valid java name and contains not printable characters */
    public static String m4412(Object obj) {
        if (C0042.m7147() <= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).T;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static String m4413(Object obj) {
        if (C0005.m1599() <= 0) {
            return com.github.catvod.spider.merge.Z0.d.a((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۡۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m4414() {
        if (C0034.m6048() < 0) {
            return "\"";
        }
        return null;
    }

    /* renamed from: ۟ۡۧۧ۠, reason: not valid java name and contains not printable characters */
    public static String m4415(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((XBPQc) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4416(Object obj, Object obj2) {
        if (C0027.m5017() >= 0) {
            return ((JSONObject) obj).getBoolean((String) obj2);
        }
        return false;
    }

    /* renamed from: ۣ۟ۢۥ۠, reason: not valid java name and contains not printable characters */
    public static String m4417(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0064.m9659() <= 0) {
            return ((Baidu) obj).playerContent((String) obj2, (String) obj3, (List) obj4);
        }
        return null;
    }

    /* renamed from: ۟ۢۥۦۧ, reason: not valid java name and contains not printable characters */
    public static void m4418(Object obj, Object obj2) {
        if (C0040.m6582() >= 0) {
            ((Drawable) obj).getOutline((Outline) obj2);
        }
    }

    /* renamed from: ۟ۢۦۤ۟, reason: not valid java name and contains not printable characters */
    public static void m4419(Object obj) {
        if (C0021.m4379() >= 0) {
            ((C0340u) obj).c();
        }
    }

    /* renamed from: ۣ۟ۢۧ۟, reason: not valid java name and contains not printable characters */
    public static Socket m4420(Object obj, Object obj2, int i) {
        if (C0018.m3956() > 0) {
            return ((SocketFactory) obj).createSocket((InetAddress) obj2, i);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static void m4421(Object obj, Object obj2) {
        if (C0004.m1557() <= 0) {
            ((ImageView) obj).setImageBitmap((Bitmap) obj2);
        }
    }

    /* renamed from: ۣۣ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static Uri m4422(Object obj) {
        if (C0041.m6823() < 0) {
            return Uri.parse((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۨۡ, reason: not valid java name and contains not printable characters */
    public static String m4423(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((Notice) obj).d;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۨۡ, reason: not valid java name and contains not printable characters */
    public static int m4424(Object obj) {
        if (C0046.m7701() > 0) {
            return ((Rect) obj).width();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.V.a m4425(Object obj) {
        if (C0043.m7332() > 0) {
            return ((HBDmSou) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static KeyFactory m4426(Object obj) {
        if (C0018.m3956() >= 0) {
            return KeyFactory.getInstance((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۤۥۣۢ, reason: not valid java name and contains not printable characters */
    public static String m4427(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0029.m5282() > 0) {
            return ((XBPQ) obj).getToken((String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۟ۤۧۨۦ, reason: not valid java name and contains not printable characters */
    public static int m4428(Object obj, Object obj2) {
        if (C0046.m7701() >= 0) {
            return ((C0166x) obj).h((com.github.catvod.spider.merge.E0.c) obj2);
        }
        return 0;
    }

    /* renamed from: ۟ۥ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m4429(Object obj) {
        if (C0007.m1886() >= 0) {
            return m.d((String) obj);
        }
        return false;
    }

    /* renamed from: ۟ۥۡۧۨ, reason: not valid java name and contains not printable characters */
    public static String m4430(Object obj, Object obj2, Object obj3) {
        if (C0035.m6140() < 0) {
            return ((HBNT4) obj).c((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۥۢۨۢ, reason: not valid java name and contains not printable characters */
    public static int m4431(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((C0166x) obj).g;
        }
        return 0;
    }

    /* renamed from: ۟ۥۤ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m4432(Object obj, Object obj2) {
        if (C0009.m2047() >= 0) {
            ((com.github.catvod.spider.merge.E.m) obj).p((String) obj2);
        }
    }

    /* renamed from: ۟ۥۤۤ, reason: not valid java name and contains not printable characters */
    public static Object m4433(Object obj) {
        if (C0029.m5282() > 0) {
            return ((C0246g) obj).j;
        }
        return null;
    }

    /* renamed from: ۟ۥۥ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m4434(Object obj) {
        if (C0031.m5628() > 0) {
            return ((F) obj).i();
        }
        return null;
    }

    /* renamed from: ۟ۥۦۨۤ, reason: not valid java name and contains not printable characters */
    public static String m4435(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).u;
        }
        return null;
    }

    /* renamed from: ۟ۥۧۧۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4436(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((f) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static void m4437(Object obj, Object obj2) {
        if (C0017.m3633() < 0) {
            ((Calendar) obj).setTime((Date) obj2);
        }
    }

    /* renamed from: ۟ۦۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m4438(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((BufferedReader) obj).readLine();
        }
        return null;
    }

    /* renamed from: ۟ۦۡۡۥ, reason: not valid java name and contains not printable characters */
    public static String m4439(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0026.m4977() <= 0) {
            return ((HB4kav) obj).searchContent((String) obj2, (String) obj3, z);
        }
        return null;
    }

    /* renamed from: ۟ۦۤۥ۠, reason: not valid java name and contains not printable characters */
    public static ConcurrentHashMap m4440(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((com.github.catvod.spider.merge.d0.d) obj).p;
        }
        return null;
    }

    /* renamed from: ۟ۦۤۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m4441(Object obj) {
        if (C0061.m9359() < 0) {
            return ((C0259u) obj).g;
        }
        return false;
    }

    /* renamed from: ۟ۦۦۣۡ, reason: not valid java name and contains not printable characters */
    public static String m4442() {
        if (m4497() >= 0) {
            return "筛选字母名称";
        }
        return null;
    }

    /* renamed from: ۟ۦۦۦ, reason: not valid java name and contains not printable characters */
    public static int m4443(Object obj, int i) {
        if (C0041.m6823() < 0) {
            return ((com.github.catvod.spider.merge.E0.f) obj).e(i);
        }
        return 0;
    }

    /* renamed from: ۟ۦۨۡ۟, reason: not valid java name and contains not printable characters */
    public static String m4444(Object obj) {
        if (C0044.m7508() < 0) {
            return k.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۨۡۡ, reason: not valid java name and contains not printable characters */
    public static Byte m4445(byte b) {
        if (C0024.m4693() <= 0) {
            return Byte.valueOf(b);
        }
        return null;
    }

    /* renamed from: ۟ۦۨۨ۟, reason: not valid java name and contains not printable characters */
    public static String m4446(Object obj) {
        if (C0042.m7147() <= 0) {
            return ((C0343c) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m4447() {
        if (C0064.m9659() < 0) {
            return "h2";
        }
        return null;
    }

    /* renamed from: ۟ۧۤۥۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.a0.S m4448(Object obj) {
        if (C0000.m1116() < 0) {
            return ((RunnableC0321a) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۧۦۤۡ, reason: not valid java name and contains not printable characters */
    public static String m4449(Object obj) {
        if (C0015.m3433() > 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).J;
        }
        return null;
    }

    /* renamed from: ۟ۨۤۦ, reason: not valid java name and contains not printable characters */
    public static String[] m4450(Object obj) {
        if (C0019.m4065() < 0) {
            return ((com.github.catvod.spider.merge.T0.c) obj).b;
        }
        return null;
    }

    /* renamed from: ۠۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static String m4451() {
        if (C0037.m6350() <= 0) {
            return ".*e\\d.*";
        }
        return null;
    }

    /* renamed from: ۣ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static Throwable m4452(Object obj) {
        if (C0039.m6529() < 0) {
            return ((C0290a) obj).a;
        }
        return null;
    }

    /* renamed from: ۠ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Activity m4453() {
        if (C0037.m6350() < 0) {
            return Init.getActivity();
        }
        return null;
    }

    /* renamed from: ۡ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static List m4454(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((NG.Rst) obj).f;
        }
        return null;
    }

    /* renamed from: ۡ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static String m4455() {
        if (C0038.m6471() >= 0) {
            return com.github.catvod.spider.merge.Z0.j.b();
        }
        return null;
    }

    /* renamed from: ۡۢۨۧ, reason: not valid java name and contains not printable characters */
    public static y m4456() {
        if (C0029.m5282() >= 0) {
            return y.b;
        }
        return null;
    }

    /* renamed from: ۣۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static E m4457(Object obj) {
        if (m4497() >= 0) {
            return ((h) obj).u0();
        }
        return null;
    }

    /* renamed from: ۣۡۤ۟, reason: not valid java name and contains not printable characters */
    public static int m4458(Object obj, int i) {
        if (C0021.m4379() >= 0) {
            return ((Calendar) obj).getLeastMaximum(i);
        }
        return 0;
    }

    /* renamed from: ۡۦۧۥ, reason: not valid java name and contains not printable characters */
    public static String m4459(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0032.m5686() <= 0) {
            return ((M) obj).u((String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۣۡۨۡ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4460(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((W) obj).e;
        }
        return null;
    }

    /* renamed from: ۢۦۡۡ, reason: not valid java name and contains not printable characters */
    public static int m4461(Object obj) {
        if (C0040.m6582() > 0) {
            return ((com.github.catvod.spider.merge.E0.d) obj).a;
        }
        return 0;
    }

    /* renamed from: ۢۧۧۨ, reason: not valid java name and contains not printable characters */
    public static void m4462(Object obj) {
        if (C0035.m6140() <= 0) {
            ((C0259u) obj).g();
        }
    }

    /* renamed from: ۢۨ۠۟, reason: not valid java name and contains not printable characters */
    public static EditText m4463(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((x) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static int m4464(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۣۣۨۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m4465() {
        if (C0018.m3956() >= 0) {
            return C0254o.h();
        }
        return null;
    }

    /* renamed from: ۣۦ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m4466(Object obj, Object obj2, Object obj3) {
        if (C0050.m8121() < 0) {
            return AbstractC0376b.f((Predicate) obj, (Predicate) obj2, obj3);
        }
        return false;
    }

    /* renamed from: ۣۦ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m4467(Object obj) {
        if (C0054.m8557() < 0) {
            return ((C0246g) obj).k();
        }
        return null;
    }

    /* renamed from: ۣۧۥۦ, reason: not valid java name and contains not printable characters */
    public static String m4468() {
        if (C0052.m8320() > 0) {
            return "webViewDialog验证后post错误-->";
        }
        return null;
    }

    /* renamed from: ۣۧۦۨ, reason: not valid java name and contains not printable characters */
    public static Object m4469(Object obj, Object obj2) {
        if (C0021.m4379() >= 0) {
            return ((o) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۤۡۥۢ, reason: not valid java name and contains not printable characters */
    public static String m4470() {
        if (C0046.m7701() >= 0) {
            return ".*\\[(.*?)\\].*";
        }
        return null;
    }

    /* renamed from: ۤۥۢ, reason: not valid java name and contains not printable characters */
    public static Throwable m4471(Object obj) {
        if (C0008.m1975() > 0) {
            return ((Throwable) obj).getCause();
        }
        return null;
    }

    /* renamed from: ۤۧۥۥ, reason: not valid java name and contains not printable characters */
    public static int m4472(Object obj) {
        if (C0061.m9359() <= 0) {
            return ((Bitmap) obj).getHeight();
        }
        return 0;
    }

    /* renamed from: ۥ۟ۡۧ, reason: contains not printable characters */
    public static void m4473(Object obj, Object obj2) {
        if (C0027.m5017() > 0) {
            ((Parcel) obj).enforceInterface((String) obj2);
        }
    }

    /* renamed from: ۥ۟ۤۥ, reason: contains not printable characters */
    public static void m4474(Object obj, boolean z) {
        if (C0002.m1242() > 0) {
            ((View) obj).setSoundEffectsEnabled(z);
        }
    }

    /* renamed from: ۥۣۡۤ, reason: contains not printable characters */
    public static String m4475(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((com.github.catvod.spider.merge.L.b) obj).a();
        }
        return null;
    }

    /* renamed from: ۥۢۧۥ, reason: contains not printable characters */
    public static void m4476(Object obj) {
        if (C0027.m5017() > 0) {
            ((ByteArrayOutputStream) obj).reset();
        }
    }

    /* renamed from: ۥۣۤۥ, reason: contains not printable characters */
    public static Pattern m4477() {
        if (C0015.m3433() >= 0) {
            return AppZzun.e;
        }
        return null;
    }

    /* renamed from: ۥۤۤ, reason: contains not printable characters */
    public static void m4478(Object obj) {
        if (C0007.m1886() > 0) {
            com.github.catvod.spider.merge.f1.b.i(obj);
        }
    }

    /* renamed from: ۥۤۦۨ, reason: contains not printable characters */
    public static void m4479(Object obj) {
        if (C0002.m1242() >= 0) {
            ((List) obj).clear();
        }
    }

    /* renamed from: ۥۥۡۨ, reason: contains not printable characters */
    public static boolean m4480(Object obj) {
        if (C0046.m7701() > 0) {
            return ((P) obj).h();
        }
        return false;
    }

    /* renamed from: ۥۦۥۤ, reason: contains not printable characters */
    public static FrameLayout m4481(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((t) obj).b;
        }
        return null;
    }

    /* renamed from: ۦ۠ۡۦ, reason: contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.d.f m4482(Object obj) {
        if (C0028.m5152() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.f) obj).a();
        }
        return null;
    }

    /* renamed from: ۦۡۦ۟, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.V.a m4483(Object obj) {
        if (C0048.m7971() > 0) {
            return ((HBDmSou) obj).g;
        }
        return null;
    }

    /* renamed from: ۦۣۦ, reason: contains not printable characters */
    public static void m4484(Object obj) {
        if (C0054.m8557() <= 0) {
            ((com.github.catvod.spider.merge.E0.o) obj).c();
        }
    }

    /* renamed from: ۦۤۦۡ, reason: contains not printable characters */
    public static String m4485() {
        if (m4497() >= 0) {
            return "filterdata";
        }
        return null;
    }

    /* renamed from: ۦۥۣ۠, reason: contains not printable characters */
    public static String m4486(Object obj) {
        if (C0007.m1886() > 0) {
            return ((StaticLoggerBinder) obj).getLoggerFactoryClassStr();
        }
        return null;
    }

    /* renamed from: ۦۥۥ۟, reason: contains not printable characters */
    public static String[] m4487(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((v) obj).c;
        }
        return null;
    }

    /* renamed from: ۦۣۧ۟, reason: contains not printable characters */
    public static WeakReference m4488(Object obj) {
        if (C0019.m4065() < 0) {
            return ((q) obj).a;
        }
        return null;
    }

    /* renamed from: ۦۨ۟ۡ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.q0.c m4489() {
        if (C0030.m5375() >= 0) {
            return com.github.catvod.spider.merge.q0.c.a;
        }
        return null;
    }

    /* renamed from: ۧۡۢۥ, reason: not valid java name and contains not printable characters */
    public static String m4490(String str) {
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

    /* renamed from: ۧۦۣۡ, reason: not valid java name and contains not printable characters */
    public static int m4491() {
        if (C0006.m1726() < 0) {
            return com.github.catvod.spider.merge.M0.c.a();
        }
        return 0;
    }

    /* renamed from: ۨ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static Parcelable m4492(Object obj, Object obj2) {
        if (C0046.m7701() >= 0) {
            return ((Parcel) obj).readParcelable((ClassLoader) obj2);
        }
        return null;
    }

    /* renamed from: ۨۡۧۦ, reason: not valid java name and contains not printable characters */
    public static void m4493(Object obj, Object obj2) {
        if (C0045.m7538() <= 0) {
            ((M) obj).v((String) obj2);
        }
    }

    /* renamed from: ۨۢۡ, reason: not valid java name and contains not printable characters */
    public static String m4494() {
        if (C0036.m6252() >= 0) {
            return "调试->webViewDialog睡眠错：";
        }
        return null;
    }

    /* renamed from: ۣۨ۟۟, reason: not valid java name and contains not printable characters */
    public static String m4495(Object obj) {
        if (C0003.m1463() < 0) {
            return ((HBlive) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۣۣۨ, reason: not valid java name and contains not printable characters */
    public static void m4496(Object obj, Object obj2, int i, Object obj3) {
        if (C0014.m3353() < 0) {
            ((r) obj).q((Appendable) obj2, i, (g) obj3);
        }
    }

    /* renamed from: ۨۥۥۣ, reason: not valid java name and contains not printable characters */
    public static int m4497() {
        return (-187) ^ C0035.f685;
    }

    /* renamed from: ۨۧۤ۟, reason: not valid java name and contains not printable characters */
    public static String m4498() {
        if (C0017.m3633() <= 0) {
            return "排序";
        }
        return null;
    }

    /* renamed from: ۨۧۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4499(Object obj, Object obj2, int i, Object obj3) {
        if (C0041.m6823() < 0) {
            return ((View.OnKeyListener) obj).onKey((View) obj2, i, (KeyEvent) obj3);
        }
        return false;
    }

    /* renamed from: ۣ۟۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static String m4403(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}