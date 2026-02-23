package com.github.catvod.spider.p000mergexbpq.i;

import android.graphics.Canvas;
import android.graphics.Path;
import android.text.StaticLayout;
import android.util.Range;
import android.util.SparseLongArray;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.CookieManager;
import android.widget.LinearLayout;
import androidx.core.view.MenuProvider;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.HBNT4;
import com.github.catvod.spider.HBdcApi;
import com.github.catvod.spider.HBfling;
import com.github.catvod.spider.HBmoou;
import com.github.catvod.spider.HBqwKan;
import com.github.catvod.spider.HBv1Class;
import com.github.catvod.spider.HkTv;
import com.github.catvod.spider.KuaKeBa;
import com.github.catvod.spider.MYzhiqiu;
import com.github.catvod.spider.Mogg;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.W55Movie;
import com.github.catvod.spider.YunPanBa;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.D.f;
import com.github.catvod.spider.merge.E.h;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0144a;
import com.github.catvod.spider.merge.F0.C0145b;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.M0.d;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.r;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.U.i;
import com.github.catvod.spider.merge.U0.B;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.C0190i;
import com.github.catvod.spider.merge.U0.G;
import com.github.catvod.spider.merge.U0.K;
import com.github.catvod.spider.merge.U0.P;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.n;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.s;
import com.github.catvod.spider.merge.X.a;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.RunnableC0235D;
import com.github.catvod.spider.merge.a0.S;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d.C0266a;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0271a;
import com.github.catvod.spider.merge.e.C0278h;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.g0.e;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0315D;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.h0.N;
import com.github.catvod.spider.merge.h0.x;
import com.github.catvod.spider.merge.h0.z;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.i1.c;
import com.github.catvod.spider.merge.l0.j;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.r0.InterfaceC0364a;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.v.C0375a;
import com.github.catvod.spider.merge.w.C0400d;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.v;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.h.b;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge-xbpq.i.ۣ۟ۢ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0012 {

    /* renamed from: ۟۠ۥۡۡ, reason: not valid java name and contains not printable characters */
    public static int f351 = 34;

    /* renamed from: ۟۟ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m2947(Object obj, int i) {
        if (C0058.m9131() <= 0) {
            return S.d((List) obj, i);
        }
        return null;
    }

    /* renamed from: ۟۟ۡۤ۠, reason: not valid java name and contains not printable characters */
    public static Path.Op m2948() {
        if (C0037.m6350() < 0) {
            return Path.Op.XOR;
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static int m2949() {
        if (C0050.m8121() < 0) {
            return d.a;
        }
        return 0;
    }

    /* renamed from: ۟۟ۤۦۧ, reason: not valid java name and contains not printable characters */
    public static String m2950(Object obj, Object obj2, Object obj3) {
        if (C0034.m6048() <= 0) {
            return a.c((String) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟۟ۤۦۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m2951(Object obj) {
        if (C0014.m3353() < 0) {
            return ((j) obj).f;
        }
        return null;
    }

    /* renamed from: ۟۠۠ۤ۟, reason: not valid java name and contains not printable characters */
    public static int m2952(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۟۠ۢۢۥ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m2953(Object obj, int i, int i2, int i3, int i4) {
        if (C0044.m7508() < 0) {
            return ((WindowInsets) obj).inset(i, i2, i3, i4);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static Hashtable m2954(Object obj) {
        if (C0028.m5152() < 0) {
            return ((c) obj).c;
        }
        return null;
    }

    /* renamed from: ۟۠ۥ۟۠, reason: not valid java name and contains not printable characters */
    public static l m2955(Object obj) {
        if (C0043.m7332() > 0) {
            return ((l) obj).i0();
        }
        return null;
    }

    /* renamed from: ۟۠ۨۨۨ, reason: not valid java name and contains not printable characters */
    public static AtomicBoolean m2956(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((i) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۡۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m2957() {
        if (C0027.m5017() > 0) {
            return HkTv.d;
        }
        return null;
    }

    /* renamed from: ۟ۡۥۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2958(Object obj, Object obj2) {
        if (C0005.m1599() < 0) {
            return ((C0145b) obj).a((C0145b) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۢ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static Iterator m2959(Object obj) {
        if (C0052.m8320() >= 0) {
            return ((C0266a) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۢۤ, reason: not valid java name and contains not printable characters */
    public static String m2960(Object obj, Object obj2) {
        if (C0009.m2047() > 0) {
            return ((com.github.catvod.spider.merge.V.a) obj).detailContent((List) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢۥۣۣ, reason: not valid java name and contains not printable characters */
    public static String m2961(Object obj) {
        if (C0049.m8038() < 0) {
            return ((HBmoou) obj).i;
        }
        return null;
    }

    /* renamed from: ۟ۢۥۧۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2962(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((Iterator) obj).hasNext();
        }
        return false;
    }

    /* renamed from: ۣ۟۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m2963(Object obj, int i, int i2, int i3, int i4) {
        if (C0045.m7538() <= 0) {
            ((ViewGroup.MarginLayoutParams) obj).setMargins(i, i2, i3, i4);
        }
    }

    /* renamed from: ۣۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m2964() {
        if (C0064.m9659() <= 0) {
            return "/proxy?do=seachdanmu&go=senddanmu&username=${encodeURIComponent(username)}&message=${encodeURIComponent(message)}`;\n\n      fetch(url)\n        .then(res => res.text())\n        .then(data => {\n          showMessage(data || '弹幕发送成功！', 'success');\n          document.getElementById('messageInput').value = '';\n          // 发送后将焦点返回文本框\n          document.getElementById('messageInput').focus();\n        })\n        .catch(err => {\n          showMessage('发送失败: ' + err.message, 'failure');\n        });\n    }\n\n    // ========================\n    // 快捷操作\n    // ========================\n    function sendSearchRequest() {\n      fetch('";
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static String m2965() {
        if (C0033.m5872() >= 0) {
            return W55Movie.d;
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۧۤ, reason: not valid java name and contains not printable characters */
    public static String m2966() {
        if (C0041.m6823() < 0) {
            return "r1";
        }
        return null;
    }

    /* renamed from: ۟ۤۤۦۡ, reason: not valid java name and contains not printable characters */
    public static LinearLayout m2967(Object obj) {
        if (C0024.m4693() < 0) {
            return ((C0340u) obj).j;
        }
        return null;
    }

    /* renamed from: ۟ۥ۠۠, reason: not valid java name and contains not printable characters */
    public static int m2968(Object obj) {
        if (C0049.m8038() <= 0) {
            return Arrays.hashCode((Object[]) obj);
        }
        return 0;
    }

    /* renamed from: ۟ۥۢۡۥ, reason: not valid java name and contains not printable characters */
    public static void m2969(Object obj, Object obj2) {
        if (C0040.m6582() >= 0) {
            ((PrintStream) obj).println((String) obj2);
        }
    }

    /* renamed from: ۟ۥۤۤ۟, reason: not valid java name and contains not printable characters */
    public static boolean m2970(Object obj) {
        if (C0002.m1242() >= 0) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ۟ۥۥۢۢ, reason: not valid java name and contains not printable characters */
    public static long m2971(Object obj, int i) {
        if (C0027.m5017() >= 0) {
            return ((SparseLongArray) obj).valueAt(i);
        }
        return 0L;
    }

    /* renamed from: ۟ۥۥۦ۟, reason: not valid java name and contains not printable characters */
    public static List m2972(Object obj, int i, int i2) {
        if (C0050.m8121() <= 0) {
            return ((List) obj).subList(i, i2);
        }
        return null;
    }

    /* renamed from: ۟ۥۧۧۤ, reason: not valid java name and contains not printable characters */
    public static void m2974(Object obj) {
        if (C0020.m4210() <= 0) {
            e.w((File) obj);
        }
    }

    /* renamed from: ۟ۥۨۦۤ, reason: not valid java name and contains not printable characters */
    public static String m2975(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0059.m9257() < 0) {
            return b.d((String) obj, (Map) obj2, (Map) obj3, (Map) obj4);
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static Pattern m2976(Object obj) {
        if (C0007.m1886() > 0) {
            return ((HBNT4) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۦۡۨۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m2977(Object obj) {
        if (C0041.m6823() < 0) {
            return YunPanBa.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۢۦۡ, reason: not valid java name and contains not printable characters */
    public static String m2978() {
        if (C0048.m7971() > 0) {
            return com.github.catvod.spider.merge.a.c.a;
        }
        return null;
    }

    /* renamed from: ۟ۦۦۢۢ, reason: not valid java name and contains not printable characters */
    public static String m2979(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0056.m8886() <= 0) {
            return ((HBfling) obj).searchContent((String) obj2, (String) obj3, z);
        }
        return null;
    }

    /* renamed from: ۟ۦۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static C0271a m2980(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((C0278h) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۧ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static PublicKey m2981(Object obj, Object obj2) {
        if (C0025.m4797() > 0) {
            return ((KeyFactory) obj).generatePublic((KeySpec) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۡۤۡ, reason: not valid java name and contains not printable characters */
    public static int m2982(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((x) obj).e;
        }
        return 0;
    }

    /* renamed from: ۟ۧۢۧۧ, reason: not valid java name and contains not printable characters */
    public static Process m2983() {
        if (C0008.m1975() >= 0) {
            return s.e;
        }
        return null;
    }

    /* renamed from: ۟ۧۢۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m2984(Object obj, Object obj2) {
        if (C0021.m4379() > 0) {
            return ((Canvas) obj).clipPath((Path) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۧۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.e1.b m2985(Object obj) {
        if (C0021.m4379() > 0) {
            return ((com.github.catvod.spider.merge.g1.d) obj).h();
        }
        return null;
    }

    /* renamed from: ۟ۧۧ۟, reason: not valid java name and contains not printable characters */
    public static String m2986(Object obj) {
        if (C0022.m4497() > 0) {
            return ((com.github.catvod.spider.merge.F.i) obj).c();
        }
        return null;
    }

    /* renamed from: ۟ۨۡ۠, reason: not valid java name and contains not printable characters */
    public static String m2987() {
        if (C0033.m5872() > 0) {
            return "fetchPost";
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static void m2988(Object obj, int i) {
        if (C0010.m2320() < 0) {
            ((ViewGroup) obj).setDescendantFocusability(i);
        }
    }

    /* renamed from: ۣ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static C0144a m2989() {
        if (C0037.m6350() < 0) {
            return A.o;
        }
        return null;
    }

    /* renamed from: ۠۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static v m2990(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.R.b) obj).d;
        }
        return null;
    }

    /* renamed from: ۠۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static IvParameterSpec m2991() {
        if (C0049.m8038() < 0) {
            return MYzhiqiu.e;
        }
        return null;
    }

    /* renamed from: ۠ۡۡ۠, reason: not valid java name and contains not printable characters */
    public static void m2992(Object obj) {
        if (C0063.m9589() < 0) {
            ((CookieManager) obj).removeSessionCookie();
        }
    }

    /* renamed from: ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2993(Object obj, Object obj2) {
        if (C0054.m8557() <= 0) {
            return ((Class) obj).isInstance(obj2);
        }
        return false;
    }

    /* renamed from: ۣ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m2994(Object obj) {
        if (m3024() >= 0) {
            return ((C0233B) obj).r;
        }
        return null;
    }

    /* renamed from: ۠ۦۡۢ, reason: not valid java name and contains not printable characters */
    public static Object m2995(Object obj, Object obj2) {
        if (C0049.m8038() <= 0) {
            return ((f) obj).s((Serializable) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m2996(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((N) obj).a;
        }
        return 0;
    }

    /* renamed from: ۠ۧۡۡ, reason: not valid java name and contains not printable characters */
    public static String m2997() {
        if (C0060.m9355() >= 0) {
            return "   </div></div>";
        }
        return null;
    }

    /* renamed from: ۠ۧۦۧ, reason: not valid java name and contains not printable characters */
    public static C0190i m2998() {
        if (C0035.m6140() <= 0) {
            return B.p;
        }
        return null;
    }

    /* renamed from: ۡ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static String m2999(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((NG.VtInfo) obj).c;
        }
        return null;
    }

    /* renamed from: ۡۡۥۦ, reason: not valid java name and contains not printable characters */
    public static String m3000(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((com.github.catvod.spider.merge.O.c) obj).b();
        }
        return null;
    }

    /* renamed from: ۡۦۢۦ, reason: not valid java name and contains not printable characters */
    public static Charset m3001() {
        if (C0004.m1557() < 0) {
            return StandardCharsets.UTF_8;
        }
        return null;
    }

    /* renamed from: ۡۦۨۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m3002(Object obj, long j) {
        if (C0024.m4693() < 0) {
            return ((com.github.catvod.spider.merge.d0.d) obj).d(j);
        }
        return null;
    }

    /* renamed from: ۡۧۢۧ, reason: not valid java name and contains not printable characters */
    public static String m3003(Object obj) {
        if (C0048.m7971() > 0) {
            return ((com.github.catvod.spider.merge.P0.x) obj).d;
        }
        return null;
    }

    /* renamed from: ۡۨۡۤ, reason: not valid java name and contains not printable characters */
    public static S m3004() {
        if (C0001.m1164() <= 0) {
            return z.a;
        }
        return null;
    }

    /* renamed from: ۡۨۤۤ, reason: not valid java name and contains not printable characters */
    public static G m3005(Object obj) {
        if (C0013.m3167() > 0) {
            return ((P) obj).l;
        }
        return null;
    }

    /* renamed from: ۣۢۡۥ, reason: not valid java name and contains not printable characters */
    public static String m3006() {
        if (C0022.m4497() >= 0) {
            return "起始页";
        }
        return null;
    }

    /* renamed from: ۢۡۤ, reason: not valid java name and contains not printable characters */
    public static float m3007(Object obj) {
        if (C0046.m7701() > 0) {
            return ((C0315D) obj).j;
        }
        return 0.0f;
    }

    /* renamed from: ۢۦۧۤ, reason: not valid java name and contains not printable characters */
    public static void m3008(Object obj, Object obj2, int i) {
        if (C0026.m4977() < 0) {
            ((r) obj).b((StringBuilder) obj2, i);
        }
    }

    /* renamed from: ۢۧۢۤ, reason: not valid java name and contains not printable characters */
    public static void m3009(Object obj, Object obj2) {
        if (C0021.m4379() > 0) {
            ((InterfaceC0364a) obj).resumeWith(obj2);
        }
    }

    /* renamed from: ۢۧۢۧ, reason: not valid java name and contains not printable characters */
    public static String m3010(Object obj) {
        if (C0044.m7508() <= 0) {
            return com.github.catvod.spider.merge.d0.b.c((String) obj);
        }
        return null;
    }

    /* renamed from: ۢۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3011(Object obj, Object obj2) {
        if (C0063.m9589() <= 0) {
            return ((C0148e) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۣ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m3012(Object obj, boolean z) {
        if (C0001.m1164() <= 0) {
            ((AccessibilityNodeInfo) obj).setCanOpenPopup(z);
        }
    }

    /* renamed from: ۣۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m3013(Object obj, Object obj2) {
        if (C0055.m8740() >= 0) {
            ((h) obj).d((String) obj2);
        }
    }

    /* renamed from: ۣۢۤ۟, reason: not valid java name and contains not printable characters */
    public static Range m3014(Object obj, Object obj2) {
        if (C0062.m9429() >= 0) {
            return ((Range) obj).intersect((Range) obj2);
        }
        return null;
    }

    /* renamed from: ۣۢۤۡ, reason: not valid java name and contains not printable characters */
    public static String m3015() {
        if (C0006.m1726() <= 0) {
            return "电视";
        }
        return null;
    }

    /* renamed from: ۣۦ۠۟, reason: not valid java name and contains not printable characters */
    public static StringBuilder m3016(Object obj, Object obj2) {
        if (C0033.m5872() >= 0) {
            return com.github.catvod.spider.merge.B0.a.q((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۦۣۨ, reason: not valid java name and contains not printable characters */
    public static InputStream m3017(Object obj) {
        if (C0013.m3167() > 0) {
            return ((com.github.catvod.spider.merge.l0.a) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۧۦ۠, reason: not valid java name and contains not printable characters */
    public static byte[] m3018(Object obj, Object obj2) {
        if (C0019.m4065() < 0) {
            return ((String) obj).getBytes((Charset) obj2);
        }
        return null;
    }

    /* renamed from: ۣۨۡۥ, reason: not valid java name and contains not printable characters */
    public static String m3019() {
        if (C0043.m7332() >= 0) {
            return "R";
        }
        return null;
    }

    /* renamed from: ۣۣۨ۟, reason: not valid java name and contains not printable characters */
    public static String m3020() {
        if (C0005.m1599() < 0) {
            return "\\&+";
        }
        return null;
    }

    /* renamed from: ۤ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3021(Object obj, Object obj2, Object obj3) {
        if (C0060.m9355() >= 0) {
            return ((n) obj).a((m) obj2, (m) obj3);
        }
        return false;
    }

    /* renamed from: ۤۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static StaticLayout.Builder m3022(Object obj, int i) {
        if (C0064.m9659() < 0) {
            return ((StaticLayout.Builder) obj).setBreakStrategy(i);
        }
        return null;
    }

    /* renamed from: ۤۢۢۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3023(Object obj) {
        if (C0051.m8216() <= 0) {
            return KuaKeBa.b((com.github.catvod.spider.merge.T0.h) obj);
        }
        return null;
    }

    /* renamed from: ۤۥۦۢ, reason: not valid java name and contains not printable characters */
    public static int m3024() {
        return (-70) ^ C0020.f460;
    }

    /* renamed from: ۤۧۨۦ, reason: not valid java name and contains not printable characters */
    public static String m3025(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((com.github.catvod.spider.merge.O.b) obj).a();
        }
        return null;
    }

    /* renamed from: ۥ۠ۢۦ, reason: contains not printable characters */
    public static void m3026(Object obj, Object obj2) {
        if (C0017.m3633() <= 0) {
            ((com.github.catvod.spider.merge.K.a) obj).b((com.github.catvod.spider.merge.K.b) obj2);
        }
    }

    /* renamed from: ۥۣ۠۠, reason: contains not printable characters */
    public static String m3027() {
        if (C0046.m7701() > 0) {
            return "横图";
        }
        return null;
    }

    /* renamed from: ۥۤ۠ۦ, reason: contains not printable characters */
    public static void m3028(Object obj, Object obj2) {
        if (C0049.m8038() <= 0) {
            ((BitSet) obj).or((BitSet) obj2);
        }
    }

    /* renamed from: ۥۥۤۥ, reason: contains not printable characters */
    public static String m3029(String str) {
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

    /* renamed from: ۥۦۢۤ, reason: contains not printable characters */
    public static boolean m3030(char c) {
        if (C0045.m7538() < 0) {
            return Character.isHighSurrogate(c);
        }
        return false;
    }

    /* renamed from: ۥۦۢۨ, reason: contains not printable characters */
    public static Object m3031(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((com.github.catvod.spider.merge.U.n) obj).d;
        }
        return null;
    }

    /* renamed from: ۥۣۧۢ, reason: contains not printable characters */
    public static void m3032(Object obj, Object obj2) {
        if (C0032.m5686() < 0) {
            ((com.github.catvod.spider.merge.L.a) obj).b((com.github.catvod.spider.merge.L.c) obj2);
        }
    }

    /* renamed from: ۦۡۧ, reason: contains not printable characters */
    public static void m3033(boolean z) {
        if (C0059.m9257() <= 0) {
            com.github.catvod.spider.p000mergexbpq.N.a.e(z);
        }
    }

    /* renamed from: ۦۢۢ۟, reason: contains not printable characters */
    public static K m3034(Object obj) {
        if (C0020.m4210() < 0) {
            return ((C0176b) obj).t;
        }
        return null;
    }

    /* renamed from: ۦۣۤ۟, reason: contains not printable characters */
    public static String m3035(Object obj) {
        if (C0058.m9131() < 0) {
            return ((HBqwKan) obj).b;
        }
        return null;
    }

    /* renamed from: ۦۣۥ۟, reason: contains not printable characters */
    public static MenuProvider m3036(Object obj) {
        if (C0038.m6471() > 0) {
            return ((C0400d) obj).c;
        }
        return null;
    }

    /* renamed from: ۦۤۢۥ, reason: contains not printable characters */
    public static String m3037(Object obj, Object obj2, Object obj3, boolean z, Object obj4) {
        if (C0035.m6140() <= 0) {
            return ((Mogg) obj).categoryContent((String) obj2, (String) obj3, z, (HashMap) obj4);
        }
        return null;
    }

    /* renamed from: ۧ۟ۦ۠, reason: not valid java name and contains not printable characters */
    public static String m3038(Object obj) {
        if (C0017.m3633() < 0) {
            return f.y((String) obj);
        }
        return null;
    }

    /* renamed from: ۧ۠ۡۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3039(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((com.github.catvod.spider.merge.l0.c) obj).b;
        }
        return null;
    }

    /* renamed from: ۧۢۥۧ, reason: not valid java name and contains not printable characters */
    public static String m3040() {
        if (C0042.m7147() < 0) {
            return "/proxy?do=seachdanmu&go=fastsaech\" class=\"control-btn search-btn\">\n                    <div class=\"btn-icon\">⚡</div>\n                    <div class=\"btn-text\">快速搜索</div>\n                </a>\n                <a href=\"javascript:void(0)\" onclick=\"sendBackgroundRequest()\" class=\"control-btn push-btn\">\n                    <div class=\"btn-icon\">📱</div>\n                    <div class=\"btn-text\">扫码推送</div>\n                </a>\n            </div>\n        </div>\n\n        <!-- 弹幕发送卡片 -->\n        <div class=\"danmaku-card\" style=\"background: rgba(255, 255, 255, 0.95); backdrop-filter: blur(20px); border-radius: 12px; padding: 15px; box-shadow: 0 6px 24px rgba(52, 152, 219, 0.1), 0 3px 12px rgba(0, 0, 0, 0.04); border: 1.5px solid rgba(52, 152, 219, 0.1); position: relative; z-index: 1;\">\n            <h3 style=\"margin: 0 0 15px 0; text-align: center;\">💬 弹幕发送</h3>\n            <div class=\"input-container collapsed\" id=\"inputContainer\" style=\"background: none; border: none; padding: 0;\">\n                <button class=\"toggle-input\" id=\"toggleInputBtn\" style=\"width: 100%; margin-bottom: 10px;\">💬 点此发送弹幕</button>\n                <div class=\"collapsible-content\">\n                    <div class=\"message-input\">\n                        <textarea id=\"message\" placeholder=\"请输入要发送的内容...\" tabindex = \"-1\" ></textarea>\n                    </div>\n                    <div class=\"input-row\">\n                        <div class=\"user-input\">\n                            <label for=\"username\">昵称:</label>\n                            <input type=\"text\" value=\"\" id=\"username\" placeholder=\"请输入昵称\" value = \"";
        }
        return null;
    }

    /* renamed from: ۣۧۢۤ, reason: not valid java name and contains not printable characters */
    public static Object m3041(Object obj) {
        if (C0056.m8886() < 0) {
            return ((C0375a) obj).c;
        }
        return null;
    }

    /* renamed from: ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static String m3042(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((com.github.catvod.spider.merge.U.m) obj).a;
        }
        return null;
    }

    /* renamed from: ۧۦ۠ۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m3043(Object obj) {
        if (C0024.m4693() <= 0) {
            return FishHxq.g((JSONObject) obj);
        }
        return null;
    }

    /* renamed from: ۧۦۤۨ, reason: not valid java name and contains not printable characters */
    public static int m3044(Object obj) {
        if (C0027.m5017() > 0) {
            return ((C0145b) obj).b;
        }
        return 0;
    }

    /* renamed from: ۣۧۧۦ, reason: not valid java name and contains not printable characters */
    public static List m3045(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((com.github.catvod.spider.merge.F.j) obj).b();
        }
        return null;
    }

    /* renamed from: ۧۨ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m3046() {
        if (C0057.m9017() >= 0) {
            return "新";
        }
        return null;
    }

    /* renamed from: ۨ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m3047() {
        if (C0023.m4566() <= 0) {
            return "跳转解析";
        }
        return null;
    }

    /* renamed from: ۨ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static C0246g m3048(Object obj) {
        if (m3024() >= 0) {
            return ((RunnableC0235D) obj).b;
        }
        return null;
    }

    /* renamed from: ۨۤۢۢ, reason: not valid java name and contains not printable characters */
    public static HashMap m3049() {
        if (C0026.m4977() < 0) {
            return HBv1Class.a();
        }
        return null;
    }

    /* renamed from: ۨۥۡ۠, reason: not valid java name and contains not printable characters */
    public static HashMap m3050() {
        if (C0008.m1975() > 0) {
            return HBdcApi.a();
        }
        return null;
    }

    /* renamed from: ۨۥۧ۟, reason: not valid java name and contains not printable characters */
    public static int m3051(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.Q.a) obj).e;
        }
        return 0;
    }

    /* renamed from: ۟ۥۦۤۥ, reason: not valid java name and contains not printable characters */
    public static String m2973(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}