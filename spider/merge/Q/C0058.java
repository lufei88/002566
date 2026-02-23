package com.github.catvod.spider.merge.q;

import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.util.AtomicFile;
import android.util.Range;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import com.github.catvod.spider.AppYsV2;
import com.github.catvod.spider.Baidu;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Cupfox;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.HBgetappapi;
import com.github.catvod.spider.HBheiHu;
import com.github.catvod.spider.HBmoou;
import com.github.catvod.spider.HBtiantianv3;
import com.github.catvod.spider.Local;
import com.github.catvod.spider.Mogg;
import com.github.catvod.spider.P123;
import com.github.catvod.spider.Test;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E0.k;
import com.github.catvod.spider.merge.F0.AbstractC0152i;
import com.github.catvod.spider.merge.F0.AbstractC0160q;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.C0159p;
import com.github.catvod.spider.merge.F0.C0166x;
import com.github.catvod.spider.merge.F0.H;
import com.github.catvod.spider.merge.F0.c0;
import com.github.catvod.spider.merge.F0.d0;
import com.github.catvod.spider.merge.F0.l0;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.j;
import com.github.catvod.spider.merge.P0.s;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.U.n;
import com.github.catvod.spider.merge.U0.D;
import com.github.catvod.spider.merge.U0.E;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V.c;
import com.github.catvod.spider.merge.W.C;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.f;
import com.github.catvod.spider.merge.W.w;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.RunnableC0249j;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d0.d;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.e;
import com.github.catvod.spider.merge.h0.C0335o;
import com.github.catvod.spider.merge.h0.RunnableC0322b;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q0.g;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.p;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.c0.r;
import com.github.catvod.spider.p000mergexbpq.d0.C0067a;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.j.o;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.nio.IntBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import org.json.JSONArray;

/* renamed from: com.github.catvod.spider.merge.q.۟ۡۢۤۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0058 {

    /* renamed from: ۠ۤۦۥ, reason: not valid java name and contains not printable characters */
    public static int f846 = -521;

    /* renamed from: ۟۟۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static List m9049(Object obj) {
        if (C0041.m6823() < 0) {
            return ((com.github.catvod.spider.merge.J.b) obj).b();
        }
        return null;
    }

    /* renamed from: ۣۣ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m9050() {
        if (C0008.m1975() > 0) {
            return ".*e(\\d)).*";
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static String m9051(String str) {
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

    /* renamed from: ۟۟ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Object m9052(Object obj, Object obj2, Object obj3) {
        if (C0020.m4210() <= 0) {
            return ((TreeMap) obj).put(obj2, obj3);
        }
        return null;
    }

    /* renamed from: ۟۟ۧۡۦ, reason: not valid java name and contains not printable characters */
    public static int m9053(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((C0166x) obj).i;
        }
        return 0;
    }

    /* renamed from: ۣ۟۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static String[][] m9054() {
        if (C0031.m5628() >= 0) {
            return FishHxq.d;
        }
        return null;
    }

    /* renamed from: ۣ۟۠۠۠, reason: not valid java name and contains not printable characters */
    public static void m9055(Object obj) {
        if (m9131() < 0) {
            ((A) obj).t();
        }
    }

    /* renamed from: ۣ۟۠۠۟, reason: not valid java name and contains not printable characters */
    public static String m9056(Object obj) {
        if (C0021.m4379() >= 0) {
            return c.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۟۠ۥ۟۠, reason: not valid java name and contains not printable characters */
    public static List m9057(Object obj) {
        if (C0046.m7701() >= 0) {
            return ((m) obj).f;
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static void m9058(Object obj, Object obj2) {
        if (C0049.m8038() <= 0) {
            ((C0254o) obj).n((String) obj2);
        }
    }

    /* renamed from: ۟۠ۧۤۥ, reason: not valid java name and contains not printable characters */
    public static Enumeration m9059(Object obj, Object obj2) {
        if (C0062.m9429() > 0) {
            return ((ClassLoader) obj).getResources((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Class m9060(Object obj) {
        if (C0059.m9257() < 0) {
            return ((com.github.catvod.spider.merge.w0.c) obj).a();
        }
        return null;
    }

    /* renamed from: ۟ۡۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m9061(Object obj, Object obj2) {
        if (C0007.m1886() > 0) {
            p.g((p) obj, (com.github.catvod.spider.p000mergexbpq.d.c) obj2);
        }
    }

    /* renamed from: ۣ۟ۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m9062(Object obj, Object obj2, int i) {
        if (C0017.m3633() < 0) {
            ((w) obj).f((ImageButton) obj2, i);
        }
    }

    /* renamed from: ۣ۟ۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m9063(Object obj) {
        if (C0027.m5017() > 0) {
            return ((com.github.catvod.spider.merge.I.c) obj).a();
        }
        return null;
    }

    /* renamed from: ۟ۡۥۤۦ, reason: not valid java name and contains not printable characters */
    public static Comparable m9064(Object obj) {
        if (C0062.m9429() > 0) {
            return ((Range) obj).getUpper();
        }
        return null;
    }

    /* renamed from: ۟ۡۧۧ۠, reason: not valid java name and contains not printable characters */
    public static String m9065(Object obj) {
        if (C0040.m6582() > 0) {
            return ((com.github.catvod.spider.merge.M.b) obj).c();
        }
        return null;
    }

    /* renamed from: ۟ۢ۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static l m9066(Object obj) {
        if (C0020.m4210() < 0) {
            return ((l) obj).f0();
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static String m9067() {
        if (C0020.m4210() <= 0) {
            return "'";
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۥۤ, reason: not valid java name and contains not printable characters */
    public static long m9068(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((g) obj).nextLong();
        }
        return 0L;
    }

    /* renamed from: ۣ۟ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static String m9069(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((StringBuffer) obj).toString();
        }
        return null;
    }

    /* renamed from: ۟ۢۤۥۧ, reason: not valid java name and contains not printable characters */
    public static String m9070() {
        if (C0056.m8886() < 0) {
            return "萬與醜專業叢東絲丟兩嚴喪個爿豐臨為麗舉麼義烏樂喬習鄉書買亂爭於虧雲亙亞產畝親褻嚲億僅從侖倉儀們價眾優夥會傴傘偉傳傷倀倫傖偽佇體餘傭僉俠侶僥偵側僑儈儕儂俁儔儼倆儷儉債傾傯僂僨償儻儐儲儺兒兌兗黨蘭關興茲養獸囅內岡冊寫軍農塚馮衝決況凍淨淒涼淩減湊凜幾鳳鳧憑凱擊氹鑿芻劃劉則剛創刪別剗剄劊劌剴劑剮劍剝劇勸辦務勱動勵勁勞勢勳猛勩勻匭匱區醫華協單賣盧鹵臥衛卻巹廠廳歷厲壓厭厙廁廂厴廈廚廄廝縣參靉靆雙發變敘疊葉號歎嘰籲後嚇呂嗎唚噸聽啟吳嘸囈嘔嚦唄員咼嗆嗚詠哢嚨嚀噝吒噅鹹呱響啞噠嘵嗶噦嘩噲嚌噥喲嘜嗊嘮啢嗩唕喚呼嘖嗇囀齧囉嘽嘯噴嘍嚳囁嗬噯噓嚶囑嚕劈囂謔團園囪圍圇國圖圓聖壙場阪壞塊堅壇壢壩塢墳墜壟壟壚壘墾坰堊墊埡墶壋塏堖塒塤堝墊垵塹墮壪牆壯聲殼壺壼處備復夠頭誇夾奪奩奐奮獎奧妝婦媽嫵嫗媯姍婁婭嬈嬌孌娛媧嫻嫿嬰嬋嬸媼嬡嬪嬙嬤孫學孿寧寶實寵審憲宮寬賓寢對尋導壽將爾塵堯尷屍盡層屭屜屆屬屢屨嶼歲豈嶇崗峴嶴嵐島嶺崠巋嶨嶧峽嶢嶠崢巒嶗崍嶮嶄嶸嶔崳嶁脊巔鞏巰幣帥師幃帳簾幟帶幀幫幬幘幗冪襆幹並廣莊慶廬廡庫應廟龐廢廎廩開異棄張彌弳彎彈強歸當錄彠彥徹徑徠禦憶懺憂愾懷態慫憮慪悵愴憐總懟懌戀懇惡慟懨愷惻惱惲悅愨懸慳憫驚懼慘懲憊愜慚憚慣湣慍憤憒願懾憖怵懣懶懍戇戔戲戧戰戩戶紮撲扡執擴捫掃揚擾撫拋摶摳掄搶護報擔擬攏揀擁攔擰撥擇掛摯攣掗撾撻挾撓擋撟掙擠揮撏撈損撿換搗據撚擄摑擲撣摻摜摣攬撳攙擱摟攪攜攝攄擺搖擯攤攖撐攆擷擼攛擻攢敵斂數齋斕斗斬斷無舊時曠暘曇晝曨顯晉曬曉曄暈暉暫曖劄術樸機殺雜權條來楊榪傑極構樅樞棗櫪梘棖槍楓梟櫃檸檉梔柵標棧櫛櫳棟櫨櫟欄樹棲樣欒棬椏橈楨檔榿橋樺檜槳樁夢檮棶檢欞槨櫝槧欏橢樓欖櫬櫚櫸檟檻檳櫧橫檣櫻櫫櫥櫓櫞簷檁歡歟歐殲歿殤殘殞殮殫殯毆毀轂畢斃氈毿氌氣氫氬氳彙漢汙湯洶遝溝沒灃漚瀝淪滄渢溈滬濔濘淚澩瀧瀘濼瀉潑澤涇潔灑窪浹淺漿澆湞溮濁測澮濟瀏滻渾滸濃潯濜塗湧濤澇淶漣潿渦溳渙滌潤澗漲澀澱淵淥漬瀆漸澠漁瀋滲溫遊灣濕潰濺漵漊潷滾滯灩灄滿瀅濾濫灤濱灘澦瀠瀟瀲濰潛瀦瀾瀨瀕灝滅燈靈災燦煬爐燉煒熗點煉熾爍爛烴燭煙煩燒燁燴燙燼熱煥燜燾煆糊溜愛爺牘犛牽犧犢強狀獷獁猶狽麅獮獰獨狹獅獪猙獄猻獫獵獼玀豬貓蝟獻獺璣璵瑒瑪瑋環現瑲璽瑉玨琺瓏璫琿璡璉瑣瓊瑤璦璿瓔瓚甕甌電畫暢佘疇癤療瘧癘瘍鬁瘡瘋皰屙癰痙癢瘂癆瘓癇癡癉瘮瘞瘺癟癱癮癭癩癬癲臒皚皺皸盞鹽監蓋盜盤瞘眥矓著睜睞瞼瞞矚矯磯礬礦碭碼磚硨硯碸礪礱礫礎硜矽碩硤磽磑礄確鹼礙磧磣堿镟滾禮禕禰禎禱禍稟祿禪離禿稈種積稱穢穠穭稅穌穩穡窮竊竅窯竄窩窺竇窶豎競篤筍筆筧箋籠籩築篳篩簹箏籌簽簡籙簀篋籜籮簞簫簣簍籃籬籪籟糴類秈糶糲粵糞糧糝餱緊縶糸糾紆紅紂纖紇約級紈纊紀紉緯紜紘純紕紗綱納紝縱綸紛紙紋紡紵紖紐紓線紺絏紱練組紳細織終縐絆紼絀紹繹經紿綁絨結絝繞絰絎繪給絢絳絡絕絞統綆綃絹繡綌綏絛繼綈績緒綾緓續綺緋綽緔緄繩維綿綬繃綢綯綹綣綜綻綰綠綴緇緙緗緘緬纜緹緲緝縕繢緦綞緞緶線緱縋緩締縷編緡緣縉縛縟縝縫縗縞纏縭縊縑繽縹縵縲纓縮繆繅纈繚繕繒韁繾繰繯繳纘罌網羅罰罷羆羈羥羨翹翽翬耮耬聳恥聶聾職聹聯聵聰肅腸膚膁腎腫脹脅膽勝朧腖臚脛膠脈膾髒臍腦膿臠腳脫腡臉臘醃膕齶膩靦膃騰臏臢輿艤艦艙艫艱豔艸藝節羋薌蕪蘆蓯葦藶莧萇蒼苧蘇檾蘋莖蘢蔦塋煢繭荊薦薘莢蕘蓽蕎薈薺蕩榮葷滎犖熒蕁藎蓀蔭蕒葒葤藥蒞蓧萊蓮蒔萵薟獲蕕瑩鶯蓴蘀蘿螢營縈蕭薩蔥蕆蕢蔣蔞藍薊蘺蕷鎣驀薔蘞藺藹蘄蘊藪槁蘚虜慮虛蟲虯蟣雖蝦蠆蝕蟻螞蠶蠔蜆蠱蠣蟶蠻蟄蛺蟯螄蠐蛻蝸蠟蠅蟈蟬蠍螻蠑螿蟎蠨釁銜補襯袞襖嫋褘襪襲襏裝襠褌褳襝褲襇褸襤繈襴見觀覎規覓視覘覽覺覬覡覿覥覦覯覲覷觴觸觶讋譽謄訁計訂訃認譏訐訌討讓訕訖訓議訊記訒講諱謳詎訝訥許訛論訩訟諷設訪訣證詁訶評詛識詗詐訴診詆謅詞詘詔詖譯詒誆誄試詿詩詰詼誠誅詵話誕詬詮詭詢詣諍該詳詫諢詡譸誡誣語誚誤誥誘誨誑說誦誒請諸諏諾讀諑誹課諉諛誰諗調諂諒諄誶談誼謀諶諜謊諫諧謔謁謂諤諭諼讒諮諳諺諦謎諞諝謨讜謖謝謠謗諡謙謐謹謾謫譾謬譚譖譙讕譜譎讞譴譫讖穀豶貝貞負貟貢財責賢敗賬貨質販貪貧貶購貯貫貳賤賁貰貼貴貺貸貿費賀貽賊贄賈賄貲賃賂贓資賅贐賕賑賚賒賦賭齎贖賞賜贔賙賡賠賧賴賵贅賻賺賽賾贗讚贇贈贍贏贛赬趙趕趨趲躉躍蹌蹠躒踐躂蹺蹕躚躋踴躊蹤躓躑躡蹣躕躥躪躦軀車軋軌軒軑軔轉軛輪軟轟軲軻轤軸軹軼軤軫轢軺輕軾載輊轎輈輇輅較輒輔輛輦輩輝輥輞輬輟輜輳輻輯轀輸轡轅轄輾轆轍轔辭辯辮邊遼達遷過邁運還這進遠違連遲邇逕跡適選遜遞邐邏遺遙鄧鄺鄔郵鄒鄴鄰鬱郤郟鄶鄭鄆酈鄖鄲醞醱醬釅釃釀釋里钜鑒鑾鏨釓釔針釘釗釙釕釷釺釧釤鈒釩釣鍆釹鍚釵鈃鈣鈈鈦鈍鈔鍾鈉鋇鋼鈑鈐鑰欽鈞鎢鉤鈧鈁鈥鈄鈕鈀鈺錢鉦鉗鈷缽鈳鉕鈽鈸鉞鑽鉬鉭鉀鈿鈾鐵鉑鈴鑠鉛鉚鈰鉉鉈鉍鈹鐸鉶銬銠鉺銪鋏鋣鐃銍鐺銅鋁銱銦鎧鍘銖銑鋌銩銛鏵銓鉿銚鉻銘錚銫鉸銥鏟銃鐋銨銀銣鑄鐒鋪鋙錸鋱鏈鏗銷鎖鋰鋥鋤鍋鋯鋨鏽銼鋝鋒鋅鋶鐦鐧銳銻鋃鋟鋦錒錆鍺錯錨錡錁錕錩錫錮鑼錘錐錦鍁錈錇錟錠鍵鋸錳錙鍥鍈鍇鏘鍶鍔鍤鍬鍾鍛鎪鍠鍰鎄鍍鎂鏤鎡鏌鎮鎛鎘鑷鐫鎳鎿鎦鎬鎊鎰鎔鏢鏜鏍鏰鏞鏡鏑鏃鏇鏐鐔钁鐐鏷鑥鐓鑭鐠鑹鏹鐙鑊鐳鐶鐲鐮鐿鑔鑣鑞鑲長門閂閃閆閈閉問闖閏闈閑閎間閔閌悶閘鬧閨聞闥閩閭闓閥閣閡閫鬮閱閬闍閾閹閶鬩閿閽閻閼闡闌闃闠闊闋闔闐闒闕闞闤隊陽陰陣階際陸隴陳陘陝隉隕險隨隱隸雋難雛讎靂霧霽黴靄靚靜靨韃鞽韉韝韋韌韍韓韙韞韜韻頁頂頃頇項順須頊頑顧頓頎頒頌頏預顱領頗頸頡頰頲頜潁熲頦頤頻頮頹頷頴穎顆題顒顎顓顏額顳顢顛顙顥纇顫顬顰顴風颺颭颮颯颶颸颼颻飀飄飆飆飛饗饜飣饑飥餳飩餼飪飫飭飯飲餞飾飽飼飿飴餌饒餉餄餎餃餏餅餑餖餓餘餒餕餜餛餡館餷饋餶餿饞饁饃餺餾饈饉饅饊饌饢馬馭馱馴馳驅馹駁驢駔駛駟駙駒騶駐駝駑駕驛駘驍罵駰驕驊駱駭駢驫驪騁驗騂駸駿騏騎騍騅騌驌驂騙騭騤騷騖驁騮騫騸驃騾驄驏驟驥驦驤髏髖髕鬢魘魎魚魛魢魷魨魯魴魺鮁鮃鯰鱸鮋鮓鮒鮊鮑鱟鮍鮐鮭鮚鮳鮪鮞鮦鰂鮜鱠鱭鮫鮮鮺鯗鱘鯁鱺鰱鰹鯉鰣鰷鯀鯊鯇鮶鯽鯒鯖鯪鯕鯫鯡鯤鯧鯝鯢鯰鯛鯨鯵鯴鯔鱝鰈鰏鱨鯷鰮鰃鰓鱷鰍鰒鰉鰁鱂鯿鰠鼇鰭鰨鰥鰩鰟鰜鰳鰾鱈鱉鰻鰵鱅鰼鱖鱔鱗鱒鱯鱤鱧鱣鳥鳩雞鳶鳴鳲鷗鴉鶬鴇鴆鴣鶇鸕鴨鴞鴦鴒鴟鴝鴛鴬鴕鷥鷙鴯鴰鵂鴴鵃鴿鸞鴻鵐鵓鸝鵑鵠鵝鵒鷳鵜鵡鵲鶓鵪鶤鵯鵬鵮鶉鶊鵷鷫鶘鶡鶚鶻鶿鶥鶩鷊鷂鶲鶹鶺鷁鶼鶴鷖鸚鷓鷚鷯鷦鷲鷸鷺鸇鷹鸌鸏鸛鸘鹺麥麩黃黌黶黷黲黽黿鼂鼉鞀鼴齇齊齏齒齔齕齗齟齡齙齠齜齦齬齪齲齷龍龔龕龜誌制谘範鬆冇嚐嘗鬨準鐘彆閒乾儘臟拚作";
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۤۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m9071(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((AtomicFile) obj).readFully();
        }
        return null;
    }

    /* renamed from: ۟ۢۥۥۦ, reason: not valid java name and contains not printable characters */
    public static void m9072(Object obj) {
        if (C0035.m6140() <= 0) {
            ((C0288g) obj).a();
        }
    }

    /* renamed from: ۟ۢۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m9073(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((AbstractMap) obj).size();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۢۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9074(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((com.github.catvod.spider.merge.D.b) obj).i;
        }
        return false;
    }

    /* renamed from: ۟ۢۨۡۧ, reason: not valid java name and contains not printable characters */
    public static String m9075(Object obj, Object obj2) {
        if (C0046.m7701() > 0) {
            return ((Baidu) obj).detailContentVodPlayUrl((List) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۟, reason: not valid java name and contains not printable characters */
    public static int m9076(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((TextView) obj).getMinLines();
        }
        return 0;
    }

    /* renamed from: ۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9077(Object obj) {
        if (C0032.m5686() < 0) {
            return ((Collection) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ۣ۟ۡۥۥ, reason: not valid java name and contains not printable characters */
    public static String m9078() {
        if (C0056.m8886() <= 0) {
            return "手机";
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۠۠, reason: not valid java name and contains not printable characters */
    public static List m9079(Object obj) {
        if (C0022.m4497() > 0) {
            return Collections.singletonList(obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۡۧ, reason: not valid java name and contains not printable characters */
    public static long m9080(Object obj, long j) {
        if (C0050.m8121() <= 0) {
            return ((BufferedInputStream) obj).skip(j);
        }
        return 0L;
    }

    /* renamed from: ۣۣۣ۟ۤ, reason: not valid java name and contains not printable characters */
    public static Pattern m9081() {
        if (C0063.m9589() < 0) {
            return AppYsV2.d;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static void m9082(Object obj) {
        if (C0007.m1886() >= 0) {
            C0335o.e((Button) obj);
        }
    }

    /* renamed from: ۣ۟ۤۤۢ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m9083(Object obj) {
        if (C0040.m6582() > 0) {
            return ((TextView) obj).getTextColors();
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static SimpleDateFormat m9084(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((Local) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۤ۠, reason: not valid java name and contains not printable characters */
    public static void m9085(Object obj, Object obj2) {
        if (C0003.m1463() <= 0) {
            ((com.github.catvod.spider.merge.E.m) obj).d((String) obj2);
        }
    }

    /* renamed from: ۟ۤۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static C0159p m9086(Object obj) {
        if (C0034.m6048() < 0) {
            return ((AbstractC0160q) obj).i;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static c0 m9087() {
        if (C0062.m9429() > 0) {
            return d0.a;
        }
        return null;
    }

    /* renamed from: ۟ۤۢۥۢ, reason: not valid java name and contains not printable characters */
    public static void m9088(Object obj, int i, Object obj2, Object obj3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (C0024.m4693() <= 0) {
            ((Cipher) obj).init(i, (Key) obj2, (AlgorithmParameterSpec) obj3);
        }
    }

    /* renamed from: ۟ۤۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m9089() {
        if (C0032.m5686() <= 0) {
            return "列表分类";
        }
        return null;
    }

    /* renamed from: ۟ۤۤۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m9090(Object obj) {
        if (C0014.m3353() < 0) {
            return ((C) obj).e;
        }
        return false;
    }

    /* renamed from: ۟ۤۥ۟۠, reason: not valid java name and contains not printable characters */
    public static HashMap m9091() {
        if (C0037.m6350() <= 0) {
            return com.github.catvod.spider.merge.M0.a.a;
        }
        return null;
    }

    /* renamed from: ۟ۤۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Pattern m9092() {
        if (C0036.m6252() > 0) {
            return d.t;
        }
        return null;
    }

    /* renamed from: ۟ۤۦۦ۟, reason: not valid java name and contains not printable characters */
    public static String m9093(Object obj) {
        if (C0006.m1726() < 0) {
            return ((HBheiHu) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۤۦۧۦ, reason: not valid java name and contains not printable characters */
    public static String m9094(Object obj, Object obj2) {
        if (C0006.m1726() < 0) {
            return ((r) obj).c((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۨۦ, reason: not valid java name and contains not printable characters */
    public static int m9095(Object obj) {
        if (C0021.m4379() > 0) {
            return ((m) obj).f();
        }
        return 0;
    }

    /* renamed from: ۟ۤۨۦۥ, reason: not valid java name and contains not printable characters */
    public static Pattern m9096(Object obj) {
        if (C0035.m6140() < 0) {
            return ((Mogg) obj).i;
        }
        return null;
    }

    /* renamed from: ۟ۥ۟۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m9097(Object obj) {
        if (C0057.m9017() > 0) {
            return ((k) obj).l;
        }
        return 0;
    }

    /* renamed from: ۟ۥ۠۟ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9098(Object obj, Object obj2) {
        if (C0042.m7147() < 0) {
            return ((HashMap) obj).containsKey(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۥۣۤۡ, reason: not valid java name and contains not printable characters */
    public static String m9099() {
        if (C0002.m1242() > 0) {
            return "codeUrl";
        }
        return null;
    }

    /* renamed from: ۟ۥۥۦ۟, reason: not valid java name and contains not printable characters */
    public static String m9100() {
        if (C0024.m4693() <= 0) {
            return "url=&";
        }
        return null;
    }

    /* renamed from: ۟ۥۨۥۨ, reason: not valid java name and contains not printable characters */
    public static Package m9101(Object obj) {
        if (C0046.m7701() > 0) {
            return ((Class) obj).getPackage();
        }
        return null;
    }

    /* renamed from: ۟ۦۣ۠ۥ, reason: not valid java name and contains not printable characters */
    public static IntBuffer m9102(Object obj) {
        if (C0035.m6140() < 0) {
            return ((com.github.catvod.spider.merge.E0.b) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۦۤ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m9103(Object obj, Object obj2) {
        if (m9131() < 0) {
            return obj.equals(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۦۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static int m9104(Object obj) {
        if (C0039.m6529() < 0) {
            return ((H) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۦۦۤۥ, reason: not valid java name and contains not printable characters */
    public static String m9105(Object obj) {
        if (C0030.m5375() > 0) {
            return e.z((File) obj);
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9107(Object obj) {
        if (C0047.m7837() > 0) {
            return ((C0148e) obj).g;
        }
        return false;
    }

    /* renamed from: ۟ۧۢۡۡ, reason: not valid java name and contains not printable characters */
    public static String m9108(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((RunnableC0249j) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۧۤ۟۠, reason: not valid java name and contains not printable characters */
    public static void m9109(Object obj, Object obj2) {
        if (C0036.m6252() >= 0) {
            ((com.github.catvod.spider.merge.E.m) obj).o((String) obj2);
        }
    }

    /* renamed from: ۟ۧۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m9110(Object obj) {
        if (m9131() <= 0) {
            return ((HBmoou) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۧۥۥۥ, reason: not valid java name and contains not printable characters */
    public static E m9111(Object obj, Object obj2) {
        if (C0025.m4797() > 0) {
            return E.a((String) obj, (D) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۦۤۥ, reason: not valid java name and contains not printable characters */
    public static void m9112(Object obj, Object obj2, int i) {
        if (C0039.m6529() < 0) {
            ((s) obj).b((StringBuilder) obj2, i);
        }
    }

    /* renamed from: ۣۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m9113(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((RunnableC0322b) obj).c;
        }
        return null;
    }

    /* renamed from: ۠ۥۦۡ, reason: not valid java name and contains not printable characters */
    public static String m9114() {
        if (C0043.m7332() >= 0) {
            return "\n      </div></a> </div>";
        }
        return null;
    }

    /* renamed from: ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static String m9115(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((com.github.catvod.spider.merge.I.c) obj).g();
        }
        return null;
    }

    /* renamed from: ۡ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static String m9116() {
        if (C0026.m4977() <= 0) {
            return "手动嗅探";
        }
        return null;
    }

    /* renamed from: ۡ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static String m9117(Object obj) {
        if (C0034.m6048() < 0) {
            return ((C0233B) obj).a;
        }
        return null;
    }

    /* renamed from: ۡۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static String m9118(Object obj, Object obj2, Object obj3) {
        if (C0048.m7971() >= 0) {
            return com.github.catvod.spider.p000mergexbpq.h.b.c((String) obj, (Map) obj2, (Map) obj3);
        }
        return null;
    }

    /* renamed from: ۡۡۨۢ, reason: not valid java name and contains not printable characters */
    public static j m9119(Object obj) {
        if (C0005.m1599() < 0) {
            return ((com.github.catvod.spider.merge.P0.k) obj).a;
        }
        return null;
    }

    /* renamed from: ۡۢۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m9120(Object obj, Object obj2) {
        if (C0042.m7147() <= 0) {
            return ((Predicate) obj).test(obj2);
        }
        return false;
    }

    /* renamed from: ۡۢۨ۟, reason: not valid java name and contains not printable characters */
    public static String m9121() {
        if (C0016.m3596() < 0) {
            return "encrypt()错误-->";
        }
        return null;
    }

    /* renamed from: ۣۡۧ۠, reason: not valid java name and contains not printable characters */
    public static void m9122(Object obj, Object obj2) {
        if (C0037.m6350() < 0) {
            ((Executor) obj).execute((Runnable) obj2);
        }
    }

    /* renamed from: ۡۤۦ۠, reason: not valid java name and contains not printable characters */
    public static WeakReference m9123(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((m) obj).e;
        }
        return null;
    }

    /* renamed from: ۡۥۡ۠, reason: not valid java name and contains not printable characters */
    public static String m9124(double d) {
        if (C0011.m2755() >= 0) {
            return o.c(d);
        }
        return null;
    }

    /* renamed from: ۡۦۡۧ, reason: not valid java name and contains not printable characters */
    public static n m9125() {
        if (C0011.m2755() > 0) {
            return com.github.catvod.spider.merge.U.l.a;
        }
        return null;
    }

    /* renamed from: ۡۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m9126(Object obj) {
        if (C0046.m7701() > 0) {
            return ((W) obj).l;
        }
        return null;
    }

    /* renamed from: ۢۢۡۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9127(Object obj, Object obj2) {
        if (C0033.m5872() > 0) {
            return ((String) obj).contains((CharSequence) obj2);
        }
        return false;
    }

    /* renamed from: ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static String m9128(Object obj) {
        if (C0009.m2047() > 0) {
            return ((com.github.catvod.spider.merge.N0.b) obj).m;
        }
        return null;
    }

    /* renamed from: ۢۤۧۤ, reason: not valid java name and contains not printable characters */
    public static String m9129(Object obj, Object obj2) {
        if (C0000.m1116() < 0) {
            return ((P123) obj).detailContentVodPlayUrl((List) obj2);
        }
        return null;
    }

    /* renamed from: ۢۥ۠۟, reason: not valid java name and contains not printable characters */
    public static boolean m9130(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((Config) obj).a;
        }
        return false;
    }

    /* renamed from: ۢۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static int m9131() {
        return 904 ^ C0033.f631;
    }

    /* renamed from: ۢۦۧ, reason: not valid java name and contains not printable characters */
    public static String m9132(Object obj, Object obj2, Object obj3) {
        if (C0038.m6471() >= 0) {
            return ((SharedPreferences) obj).getString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣۢۧ۟, reason: not valid java name and contains not printable characters */
    public static String m9133(Object obj) {
        if (C0008.m1975() > 0) {
            return ((HBgetappapi) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static String m9134(Object obj) {
        if (C0035.m6140() <= 0) {
            return com.github.catvod.spider.merge.Z0.n.a((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۡ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m9135(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((AccessibilityNodeInfo) obj).getTextSelectionStart();
        }
        return 0;
    }

    /* renamed from: ۣۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m9136() {
        if (C0041.m6823() <= 0) {
            return com.github.catvod.spider.merge.K0.a.j;
        }
        return null;
    }

    /* renamed from: ۤۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m9137(Object obj, boolean z) {
        if (C0063.m9589() < 0) {
            ((com.github.catvod.spider.merge.V0.p) obj).h(z);
        }
    }

    /* renamed from: ۣۤۤۨ, reason: not valid java name and contains not printable characters */
    public static String m9138(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.e) obj).a();
        }
        return null;
    }

    /* renamed from: ۤۤۦۤ, reason: not valid java name and contains not printable characters */
    public static String m9139(Object obj) {
        if (C0047.m7837() > 0) {
            return ((Test) obj).a;
        }
        return null;
    }

    /* renamed from: ۤۥۤ۟, reason: not valid java name and contains not printable characters */
    public static OutputStream m9140(Object obj) {
        if (C0046.m7701() >= 0) {
            return ((com.github.catvod.spider.merge.l0.e) obj).b;
        }
        return null;
    }

    /* renamed from: ۤۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m9141(Object obj, long j) {
        if (C0053.m8389() > 0) {
            return ((StringBuilder) obj).append(j);
        }
        return null;
    }

    /* renamed from: ۤۧۥۧ, reason: not valid java name and contains not printable characters */
    public static Set m9142(Object obj) {
        if (C0027.m5017() > 0) {
            return ((Map) obj).entrySet();
        }
        return null;
    }

    /* renamed from: ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static void m9143(Object obj, boolean z) {
        if (C0008.m1975() >= 0) {
            ((AccessibilityNodeInfo) obj).setImportantForAccessibility(z);
        }
    }

    /* renamed from: ۤۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static float[] m9144() {
        if (C0007.m1886() >= 0) {
            return com.github.catvod.spider.merge.A.a.c;
        }
        return null;
    }

    /* renamed from: ۥ۠ۦۢ, reason: contains not printable characters */
    public static String m9145(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0007.m1886() >= 0) {
            return com.github.catvod.spider.merge.f1.b.e((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۥۤۤۥ, reason: contains not printable characters */
    public static void m9146(Object obj, Object obj2) {
        if (C0030.m5375() >= 0) {
            ((AbstractC0152i) obj).a((l0) obj2);
        }
    }

    /* renamed from: ۥۤۥۧ, reason: contains not printable characters */
    public static int m9147(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۥۤۧ۟, reason: contains not printable characters */
    public static int m9148(Object obj) {
        if (C0013.m3167() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.P.r) obj).size();
        }
        return 0;
    }

    /* renamed from: ۥۦۤۨ, reason: contains not printable characters */
    public static ArrayList m9149(Object obj, int i) {
        if (C0050.m8121() <= 0) {
            return FishHxq.n((JSONArray) obj, i);
        }
        return null;
    }

    /* renamed from: ۦ۠ۤۧ, reason: contains not printable characters */
    public static String m9150(Object obj) {
        if (C0002.m1242() > 0) {
            return ((HBtiantianv3) obj).b;
        }
        return null;
    }

    /* renamed from: ۦۣۣۡ, reason: contains not printable characters */
    public static CheckBox m9151(Object obj) {
        if (C0000.m1116() < 0) {
            return ((f) obj).b;
        }
        return null;
    }

    /* renamed from: ۦۡۦ۠, reason: contains not printable characters */
    public static void m9152(Object obj, Object obj2) {
        if (C0045.m7538() <= 0) {
            ((com.github.catvod.spider.merge.E.m) obj).e((String) obj2);
        }
    }

    /* renamed from: ۦۡۨۥ, reason: contains not printable characters */
    public static byte[] m9153(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((com.github.catvod.spider.merge.K0.a) obj).h;
        }
        return null;
    }

    /* renamed from: ۦۢۨۧ, reason: contains not printable characters */
    public static String m9154() {
        if (C0044.m7508() <= 0) {
            return "{cateId}";
        }
        return null;
    }

    /* renamed from: ۦۧۢۦ, reason: contains not printable characters */
    public static boolean m9155(char c) {
        if (C0051.m8216() <= 0) {
            return Character.isLowSurrogate(c);
        }
        return false;
    }

    /* renamed from: ۣۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m9156(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((com.github.catvod.spider.merge.F.k) obj).a();
        }
        return null;
    }

    /* renamed from: ۧۢۢۤ, reason: not valid java name and contains not printable characters */
    public static Thread m9157(Object obj) {
        if (C0047.m7837() > 0) {
            return ((com.github.catvod.spider.merge.d0.f) obj).a;
        }
        return null;
    }

    /* renamed from: ۧۦۤۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m9158(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((M) obj).c;
        }
        return null;
    }

    /* renamed from: ۧۧۡۡ, reason: not valid java name and contains not printable characters */
    public static void m9159(Object obj, Object obj2) {
        if (C0040.m6582() > 0) {
            ((com.github.catvod.spider.merge.E.m) obj).h((String) obj2);
        }
    }

    /* renamed from: ۨۢۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m9160(Object obj, long j) {
        if (C0056.m8886() < 0) {
            return ((File) obj).setLastModified(j);
        }
        return false;
    }

    /* renamed from: ۣۨۤۨ, reason: not valid java name and contains not printable characters */
    public static String m9161(Object obj, Object obj2) {
        if (C0036.m6252() >= 0) {
            return ((C0067a) obj).p((char[]) obj2);
        }
        return null;
    }

    /* renamed from: ۨۧۢۨ, reason: not valid java name and contains not printable characters */
    public static String m9162(Object obj) {
        if (C0063.m9589() < 0) {
            return Cupfox.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۨۨۤۡ, reason: not valid java name and contains not printable characters */
    public static boolean m9163(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((E) obj).c;
        }
        return false;
    }

    /* renamed from: ۨۨۥ۠, reason: not valid java name and contains not printable characters */
    public static String m9164() {
        if (C0002.m1242() >= 0) {
            return "动画";
        }
        return null;
    }

    /* renamed from: ۟ۦۨۢۤ, reason: not valid java name and contains not printable characters */
    public static String m9106(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}