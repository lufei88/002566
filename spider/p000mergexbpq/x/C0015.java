package com.github.catvod.spider.p000mergexbpq.x;

import android.app.Activity;
import android.app.Application;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ShortcutInfo;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.os.Handler;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import androidx.core.util.Predicate;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.HBcmsV1;
import com.github.catvod.spider.HBlive;
import com.github.catvod.spider.HBtiantianv3;
import com.github.catvod.spider.Ikanbot;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.Star;
import com.github.catvod.spider.TvDy;
import com.github.catvod.spider.WebDAV;
import com.github.catvod.spider.merge.B.g;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.E0.o;
import com.github.catvod.spider.merge.F.c;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0166x;
import com.github.catvod.spider.merge.F0.d0;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.G0.d;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.K0.a;
import com.github.catvod.spider.merge.K0.b;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.U.n;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.U0.M;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.p;
import com.github.catvod.spider.merge.W.C;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.h;
import com.github.catvod.spider.merge.W.q;
import com.github.catvod.spider.merge.W.t;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.a0.L;
import com.github.catvod.spider.merge.a0.RunnableC0255p;
import com.github.catvod.spider.merge.a0.S;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e0.RunnableC0282a;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f.C0292c;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f0.C0302e;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0307b;
import com.github.catvod.spider.merge.g0.C0306a;
import com.github.catvod.spider.merge.g1.e;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0315D;
import com.github.catvod.spider.merge.h0.RunnableC0316E;
import com.github.catvod.spider.merge.l0.j;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.AbstractC0376b;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.w;
import com.github.catvod.spider.p000mergexbpq.P.y;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.f;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.l;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.j.k;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import javax.crypto.Mac;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge-xbpq.x.۟ۦ۠۟ۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0015 {

    /* renamed from: ۟ۦۡۦۣ, reason: not valid java name and contains not printable characters */
    public static int f367 = 717;

    /* renamed from: ۟۟۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static String m3406() {
        if (C0027.m5017() >= 0) {
            return "1";
        }
        return null;
    }

    /* renamed from: ۟۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static String m3407(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((L) obj).c;
        }
        return null;
    }

    /* renamed from: ۟۟ۢۢۥ, reason: not valid java name and contains not printable characters */
    public static LinkedBlockingQueue m3408(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((e) obj).c;
        }
        return null;
    }

    /* renamed from: ۟۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static String m3409() {
        if (C0019.m4065() < 0) {
            return "<button class=\"episode-btn focusable\" data-url=\"http://";
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static MessageDigest m3410(Object obj) {
        if (C0043.m7332() >= 0) {
            return MessageDigest.getInstance((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static boolean m3411(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((Matcher) obj).matches();
        }
        return false;
    }

    /* renamed from: ۟۟ۨ۠ۥ, reason: not valid java name and contains not printable characters */
    public static void m3412(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0035.m6140() < 0) {
            ((Path) obj).addRoundRect((RectF) obj2, (float[]) obj3, (Path.Direction) obj4);
        }
    }

    /* renamed from: ۟۠۟۟, reason: not valid java name and contains not printable characters */
    public static void m3413(Object obj, boolean z) {
        if (C0020.m4210() <= 0) {
            ((p) obj).d(z);
        }
    }

    /* renamed from: ۟۠۟ۡ۠, reason: not valid java name and contains not printable characters */
    public static void m3414(Object obj) {
        if (C0006.m1726() <= 0) {
            ((CookieSyncManager) obj).sync();
        }
    }

    /* renamed from: ۟۠ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static g m3415() {
        if (C0051.m8216() < 0) {
            return g.ON_CREATE;
        }
        return null;
    }

    /* renamed from: ۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static S m3416(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((RunnableC0316E) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۡ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static Class m3417(Object obj, Object obj2) {
        if (C0057.m9017() > 0) {
            return ((ClassLoader) obj).loadClass((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۡۤۥ, reason: not valid java name and contains not printable characters */
    public static void m3418(Object obj) {
        if (C0063.m9589() <= 0) {
            ((C0315D) obj).b();
        }
    }

    /* renamed from: ۣ۟ۡۢ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.g m3419() {
        if (C0056.m8886() < 0) {
            return com.github.catvod.spider.merge.E0.g.a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static String m3420(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((URL) obj).getFile();
        }
        return null;
    }

    /* renamed from: ۟ۡۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m3421(Object obj) {
        if (C0018.m3956() > 0) {
            return ((b) obj).g;
        }
        return 0;
    }

    /* renamed from: ۟ۡۥۨۦ, reason: not valid java name and contains not printable characters */
    public static o m3422(Object obj) {
        if (C0011.m2755() > 0) {
            return ((com.github.catvod.spider.merge.F0.L) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۡۦۡ۟, reason: not valid java name and contains not printable characters */
    public static String m3423() {
        if (C0057.m9017() > 0) {
            return "\" tabindex=\"0\" type=\"text\">\n                </div>\n                <div class=\"btn-group\">\n                    <button class=\"btn btn-primary focusable\" tabindex=\"0\" type=\"submit\">🚀 发送弹幕</button>\n                    <button class=\"btn btn-secondary focusable\" onclick=\"clearForm()\" tabindex=\"0\" type=\"button\">🗑️ 清空</button>\n                </div>\n            </form>\n            <div class=\"message\" id=\"messageDiv\"></div>\n        `;\n        \n        // 绑定表单提交事件\n        const form = danmuPanel.querySelector('#danmuForm');\n        form.addEventListener('submit', handleDanmuSubmit);\n        \n        return danmuPanel;\n    }\n\n    // 设置事件监听器\n    function setupEventListeners() {\n        // 其他事件监听器可以在这里设置\n    }\n\n    // 处理弹幕提交\n    function handleDanmuSubmit(e) {\n        e.preventDefault();\n\n        const message = document.getElementById('message').value.trim();\n        const username = document.getElementById('username').value.trim();\n\n        if (!message || !username) {\n            showMessage('请填写完整信息', 'error');\n            return;\n        }\n\n        const url = `";
        }
        return null;
    }

    /* renamed from: ۟ۢۡۡ۠, reason: not valid java name and contains not printable characters */
    public static String m3424(String str) {
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

    /* renamed from: ۟ۢۡۤۥ, reason: not valid java name and contains not printable characters */
    public static String m3425() {
        if (C0058.m9131() <= 0) {
            return "热门.*";
        }
        return null;
    }

    /* renamed from: ۟ۢۡۦۧ, reason: not valid java name and contains not printable characters */
    public static m m3426(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((NG.It) obj).toVod();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static void m3427(Object obj, Object obj2, Object obj3, int i, int i2, Object obj4, Object obj5) {
        if (C0058.m9131() <= 0) {
            ((y) obj).b((w) obj2, (com.github.catvod.spider.p000mergexbpq.R.b) obj3, i, i2, (BitSet) obj4, (f) obj5);
        }
    }

    /* renamed from: ۟ۢۦۣۨ, reason: not valid java name and contains not printable characters */
    public static PrintStream m3428(Object obj, Object obj2, Object obj3) {
        if (C0002.m1242() > 0) {
            return ((PrintStream) obj).printf((String) obj2, (Object[]) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۨۡ, reason: not valid java name and contains not printable characters */
    public static int m3429(Object obj) {
        if (C0038.m6471() > 0) {
            return ((RunnableC0282a) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۢۨۤ۠, reason: not valid java name and contains not printable characters */
    public static Context m3430(Object obj) {
        if (C0046.m7701() >= 0) {
            return ((View) obj).getContext();
        }
        return null;
    }

    /* renamed from: ۟ۢۨۧۥ, reason: not valid java name and contains not printable characters */
    public static void m3431(Object obj, Object obj2) {
        if (C0027.m5017() >= 0) {
            ((c) obj).f((com.github.catvod.spider.merge.F.p) obj2);
        }
    }

    /* renamed from: ۣ۟۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static void m3432(Object obj) {
        if (C0026.m4977() <= 0) {
            ((h) obj).d();
        }
    }

    /* renamed from: ۣ۟۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static int m3433() {
        return 416 ^ C0059.f855;
    }

    /* renamed from: ۣ۟ۢۨۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3434(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((com.github.catvod.spider.merge.e1.b) obj).a();
        }
        return false;
    }

    /* renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m3435(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0013.m3167() >= 0) {
            return ((HBtiantianv3) obj).searchContent((String) obj2, z, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣۣۣ۟۠, reason: not valid java name and contains not printable characters */
    public static boolean m3436(Object obj) {
        if (m3433() > 0) {
            return com.github.catvod.spider.merge.g0.g.n((String) obj);
        }
        return false;
    }

    /* renamed from: ۣ۟ۥۣ۠, reason: not valid java name and contains not printable characters */
    public static C0306a m3437(Object obj, Object obj2) {
        if (C0021.m4379() > 0) {
            return AbstractC0307b.a((Application) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۨ۟, reason: not valid java name and contains not printable characters */
    public static void m3438(Object obj) {
        if (C0005.m1599() <= 0) {
            ((S) obj).a();
        }
    }

    /* renamed from: ۟ۤ۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static Class[] m3439(Object obj) {
        if (C0058.m9131() < 0) {
            return ((Method) obj).getParameterTypes();
        }
        return null;
    }

    /* renamed from: ۟ۤ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m3440(Object obj) {
        if (C0042.m7147() < 0) {
            return ((FrameLayout.LayoutParams) obj).leftMargin;
        }
        return 0;
    }

    /* renamed from: ۟ۤ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m3441(Object obj) {
        if (C0056.m8886() < 0) {
            return Bili.c((com.github.catvod.spider.merge.I.c) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m3442(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((Star) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۥۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m3443(Object obj, Object obj2, Object obj3) {
        if (C0048.m7971() > 0) {
            return com.github.catvod.spider.p000mergexbpq.k.g.h((String) obj, (Map) obj2, (Map) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۥۡۦۦ, reason: not valid java name and contains not printable characters */
    public static WindowInsets m3444(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((WindowInsets.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۟ۥۢۥ, reason: not valid java name and contains not printable characters */
    public static ClipData m3445(Object obj, Object obj2) {
        if (C0060.m9355() > 0) {
            return ClipData.newPlainText((CharSequence) obj, (CharSequence) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۣۧۧ, reason: not valid java name and contains not printable characters */
    public static String m3446(Object obj, Object obj2, Object obj3) {
        if (C0005.m1599() < 0) {
            return ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۥۣۨۢ, reason: not valid java name and contains not printable characters */
    public static d0 m3447(Object obj) {
        if (C0024.m4693() < 0) {
            return ((com.github.catvod.spider.merge.G0.c) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۥۨۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3448(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((com.github.catvod.spider.merge.D.f) obj).k;
        }
        return false;
    }

    /* renamed from: ۟ۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static HashMap m3449(Object obj, Object obj2) {
        if (C0042.m7147() < 0) {
            return com.github.catvod.spider.merge.W.p.e((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m3450(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((ShortcutInfo) obj).isImmutable();
        }
        return false;
    }

    /* renamed from: ۟ۦۢۢ, reason: not valid java name and contains not printable characters */
    public static String m3451() {
        if (C0006.m1726() <= 0) {
            return k.i;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۨۥ, reason: not valid java name and contains not printable characters */
    public static String m3452(Object obj, Object obj2, Object obj3) {
        if (C0042.m7147() < 0) {
            return com.github.catvod.spider.merge.Z0.k.a((String) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۦۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m3453() {
        if (C0003.m1463() < 0) {
            return "/";
        }
        return null;
    }

    /* renamed from: ۟ۦۦۢ۟, reason: not valid java name and contains not printable characters */
    public static void m3454(Object obj, Object obj2) throws InvalidKeyException {
        if (C0057.m9017() >= 0) {
            ((Mac) obj).init((Key) obj2);
        }
    }

    /* renamed from: ۟ۦۧۨ, reason: not valid java name and contains not printable characters */
    public static String m3455(Object obj) {
        if (C0058.m9131() < 0) {
            return HBlive.a((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۧۤۦۢ, reason: not valid java name and contains not printable characters */
    public static Handler m3456(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((C) obj).f;
        }
        return null;
    }

    /* renamed from: ۟ۧۥۦ, reason: not valid java name and contains not printable characters */
    public static void m3457(Object obj, Object obj2) {
        if (C0063.m9589() < 0) {
            ((Activity) obj).startActivity((Intent) obj2);
        }
    }

    /* renamed from: ۟ۧۧۤۡ, reason: not valid java name and contains not printable characters */
    public static String m3458() {
        if (C0014.m3353() <= 0) {
            return ".*\\((.*?)\\).*";
        }
        return null;
    }

    /* renamed from: ۟ۨۢۤ, reason: not valid java name and contains not printable characters */
    public static void m3459(Object obj, int i, Object obj2) {
        if (C0034.m6048() < 0) {
            C0166x.b((d) obj, i, (d) obj2);
        }
    }

    /* renamed from: ۣ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static Activity m3460(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((t) obj).c();
        }
        return null;
    }

    /* renamed from: ۠۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m3461(Object obj, Object obj2) {
        if (C0026.m4977() <= 0) {
            return ((C0174a) obj).q((String) obj2);
        }
        return false;
    }

    /* renamed from: ۠ۡۥۥ, reason: not valid java name and contains not printable characters */
    public static int m3462(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۠ۢۧۢ, reason: not valid java name and contains not printable characters */
    public static boolean m3463(Object obj, Object obj2, Object obj3) {
        if (C0020.m4210() < 0) {
            return AbstractC0376b.d((Predicate) obj, (Predicate) obj2, obj3);
        }
        return false;
    }

    /* renamed from: ۣ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m3464(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0061.m9359() <= 0) {
            return ((HBcmsV1) obj).searchContent((String) obj2, (String) obj3, z);
        }
        return null;
    }

    /* renamed from: ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static String m3465(Object obj) {
        if (C0017.m3633() <= 0) {
            return FishHxq.h((JSONObject) obj);
        }
        return null;
    }

    /* renamed from: ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m3466() {
        if (C0009.m2047() >= 0) {
            return "电影";
        }
        return null;
    }

    /* renamed from: ۠ۦۡ۟, reason: not valid java name and contains not printable characters */
    public static C0292c m3467() {
        if (C0052.m8320() > 0) {
            return C0292c.d;
        }
        return null;
    }

    /* renamed from: ۠ۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m3468(Object obj, Object obj2) {
        if (C0037.m6350() <= 0) {
            return com.github.catvod.spider.merge.E.g.r((ArrayList) obj, (LinkedHashMap) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۨۦۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m3469() {
        if (C0026.m4977() < 0) {
            return com.github.catvod.spider.merge.e1.d.a();
        }
        return null;
    }

    /* renamed from: ۡۤۡۤ, reason: not valid java name and contains not printable characters */
    public static String m3470() {
        if (C0001.m1164() <= 0) {
            return "验证";
        }
        return null;
    }

    /* renamed from: ۡۥۥ, reason: not valid java name and contains not printable characters */
    public static Object m3471(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((NG.Rst) obj).g;
        }
        return null;
    }

    /* renamed from: ۡۦۣۨ, reason: not valid java name and contains not printable characters */
    public static Float m3472(float f) {
        if (C0006.m1726() <= 0) {
            return Float.valueOf(f);
        }
        return null;
    }

    /* renamed from: ۢۡۤۡ, reason: not valid java name and contains not printable characters */
    public static void m3473(Object obj, Object obj2, int i, Object obj3) {
        if (C0007.m1886() >= 0) {
            ((a) obj).c((byte[]) obj2, i, (b) obj3);
        }
    }

    /* renamed from: ۣۣۢۡ, reason: not valid java name and contains not printable characters */
    public static String m3474() {
        if (C0016.m3596() <= 0) {
            return "榜";
        }
        return null;
    }

    /* renamed from: ۢۤۧۨ, reason: not valid java name and contains not printable characters */
    public static Method m3475(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((com.github.catvod.spider.merge.B.b) obj).b;
        }
        return null;
    }

    /* renamed from: ۢۥۦۦ, reason: not valid java name and contains not printable characters */
    public static String m3476() {
        if (C0033.m5872() >= 0) {
            return C0035.m6073();
        }
        return null;
    }

    /* renamed from: ۢۦۡۤ, reason: not valid java name and contains not printable characters */
    public static j m3477(Object obj, Object obj2) {
        if (C0005.m1599() < 0) {
            return ((com.github.catvod.spider.merge.l0.m) obj).e((com.github.catvod.spider.merge.l0.e) obj2);
        }
        return null;
    }

    /* renamed from: ۢۧۢۥ, reason: not valid java name and contains not printable characters */
    public static List m3478(Object obj, Object obj2, Object obj3) {
        if (C0006.m1726() <= 0) {
            return WebDAV.a((com.github.catvod.spider.merge.Q.a) obj, (String) obj2, (List) obj3);
        }
        return null;
    }

    /* renamed from: ۣۧ۠۠, reason: not valid java name and contains not printable characters */
    public static HashMap m3479() {
        if (C0000.m1116() < 0) {
            return q.k;
        }
        return null;
    }

    /* renamed from: ۣۨۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.b.p m3480(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((l) obj).c;
        }
        return null;
    }

    /* renamed from: ۣۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m3481(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((com.github.catvod.spider.merge.L.b) obj).d;
        }
        return null;
    }

    /* renamed from: ۤۥۥ۟, reason: not valid java name and contains not printable characters */
    public static String m3482() {
        if (C0021.m4379() > 0) {
            return com.github.catvod.spider.merge.R0.b.a;
        }
        return null;
    }

    /* renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static ShapeDrawable m3483(Object obj, int i, int i2) {
        if (C0017.m3633() < 0) {
            return C0302e.c((Context) obj, i, i2);
        }
        return null;
    }

    /* renamed from: ۥ۠ۢۡ, reason: contains not printable characters */
    public static void m3485(Object obj, int i, int i2, int i3) {
        if (C0012.m3024() >= 0) {
            Arrays.fill((int[]) obj, i, i2, i3);
        }
    }

    /* renamed from: ۥ۠ۨۨ, reason: contains not printable characters */
    public static void m3486(Object obj, Object obj2) {
        if (m3433() > 0) {
            ((AtomicReference) obj).set(obj2);
        }
    }

    /* renamed from: ۥۡۤۦ, reason: contains not printable characters */
    public static void m3487(Object obj, int i) {
        if (C0064.m9659() < 0) {
            ((ParsePosition) obj).setIndex(i);
        }
    }

    /* renamed from: ۥۣ۠ۢ, reason: contains not printable characters */
    public static TimeUnit m3488() {
        if (C0048.m7971() >= 0) {
            return TimeUnit.MINUTES;
        }
        return null;
    }

    /* renamed from: ۥۤۢۡ, reason: contains not printable characters */
    public static int m3489(Object obj, Object obj2, int i) {
        if (C0057.m9017() >= 0) {
            return ((SharedPreferences) obj).getInt((String) obj2, i);
        }
        return 0;
    }

    /* renamed from: ۥۤۤۤ, reason: contains not printable characters */
    public static String m3490(Object obj) {
        if (C0022.m4497() > 0) {
            return ((W) obj).k;
        }
        return null;
    }

    /* renamed from: ۥۥ۠ۢ, reason: contains not printable characters */
    public static int m3491(Object obj) {
        if (C0056.m8886() < 0) {
            return ((View) obj).getPaddingLeft();
        }
        return 0;
    }

    /* renamed from: ۦ۟ۢۥ, reason: contains not printable characters */
    public static String m3492(Object obj) {
        if (C0004.m1557() < 0) {
            return ((M) obj).e;
        }
        return null;
    }

    /* renamed from: ۦ۠۟, reason: contains not printable characters */
    public static C0302e m3493(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((com.github.catvod.spider.merge.l0.m) obj).d;
        }
        return null;
    }

    /* renamed from: ۦۡۥۡ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.F.a m3494(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((com.github.catvod.spider.merge.F.a) obj).a();
        }
        return null;
    }

    /* renamed from: ۦۡۧ, reason: contains not printable characters */
    public static Charset m3495() {
        if (C0052.m8320() > 0) {
            return com.github.catvod.spider.p000mergexbpq.j.m.b;
        }
        return null;
    }

    /* renamed from: ۦۢۥ۠, reason: contains not printable characters */
    public static int m3496(Object obj) {
        if (C0043.m7332() > 0) {
            return ((RunnableC0255p) obj).a;
        }
        return 0;
    }

    /* renamed from: ۦۤۢۥ, reason: contains not printable characters */
    public static int m3497(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((com.github.catvod.spider.merge.T.a) obj).a;
        }
        return 0;
    }

    /* renamed from: ۦۣۤۨ, reason: contains not printable characters */
    public static String m3498(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((c) obj).toString();
        }
        return null;
    }

    /* renamed from: ۦۧۤ, reason: contains not printable characters */
    public static void m3499(Object obj, Object obj2) {
        if (C0013.m3167() >= 0) {
            ((AccessibilityNodeInfo) obj).setLabeledBy((View) obj2);
        }
    }

    /* renamed from: ۧۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static List m3500(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((com.github.catvod.spider.merge.I.b) obj).a();
        }
        return null;
    }

    /* renamed from: ۧۦۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m3501() {
        if (C0038.m6471() >= 0) {
            return Ikanbot.a();
        }
        return null;
    }

    /* renamed from: ۧۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m3502(Object obj, boolean z) {
        if (C0023.m4566() < 0) {
            ((WebSettings) obj).setJavaScriptCanOpenWindowsAutomatically(z);
        }
    }

    /* renamed from: ۣۨ۟۠, reason: not valid java name and contains not printable characters */
    public static void m3503(Object obj, int i) {
        if (C0026.m4977() <= 0) {
            ((WindowInsetsController) obj).show(i);
        }
    }

    /* renamed from: ۣۨۡۡ, reason: not valid java name and contains not printable characters */
    public static int m3504(Object obj) {
        if (C0014.m3353() < 0) {
            return ((com.github.catvod.spider.merge.l0.e) obj).d;
        }
        return 0;
    }

    /* renamed from: ۨۡۤۢ, reason: not valid java name and contains not printable characters */
    public static long m3505(Object obj) {
        if (C0042.m7147() <= 0) {
            return ((com.github.catvod.spider.merge.G.c) obj).d();
        }
        return 0L;
    }

    /* renamed from: ۨۡۥۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.F.j m3506(Object obj, Object obj2, Object obj3) {
        if (C0039.m6529() <= 0) {
            return ((C0246g) obj).l((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۨۢۥ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3507(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((C0259u) obj).b;
        }
        return false;
    }

    /* renamed from: ۣۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static HashMap m3508() {
        if (C0029.m5282() >= 0) {
            return TvDy.a();
        }
        return null;
    }

    /* renamed from: ۣۨۡۢ, reason: not valid java name and contains not printable characters */
    public static void m3509(Object obj) {
        if (C0061.m9359() < 0) {
            ((com.github.catvod.spider.merge.l0.e) obj).c();
        }
    }

    /* renamed from: ۣۨۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m3510(Object obj) {
        if (C0041.m6823() < 0) {
            return ((AccessibilityNodeInfo) obj).isHeading();
        }
        return false;
    }

    /* renamed from: ۨۥ, reason: not valid java name and contains not printable characters */
    public static Serializable m3511(Object obj) {
        if (C0039.m6529() < 0) {
            return ((n) obj).e;
        }
        return null;
    }

    /* renamed from: ۥ۟ۧ۠, reason: contains not printable characters */
    public static String m3484(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}