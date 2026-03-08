package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiPhoneAddCall: ImageVector
    get() {
        if (_SiPhoneAddCall != null) {
            return _SiPhoneAddCall!!
        }
        _SiPhoneAddCall = ImageVector.Builder(
            name = "Regular.SiPhoneAddCall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 7f)
                horizontalLineToRelative(-6f)
                moveToRelative(3f, -3f)
                verticalLineToRelative(6f)
                moveToRelative(-9.82f, 0.27f)
                lineToRelative(6.504f, 6.46f)
                curveToRelative(0.697f, -0.807f, 5.11f, -5.538f, 7.316f, 0.924f)
                curveToRelative(0f, 0f, -0.232f, 3.346f, -4.994f, 3.346f)
                curveToRelative(-3.367f, 0f, -6.851f, -4.038f, -9.29f, -6.346f)
                curveTo(4.626f, 12.692f, 3f, 10.154f, 3f, 7.846f)
                curveTo(3f, 3.116f, 6.252f, 3f, 6.252f, 3f)
                curveToRelative(7.432f, 2.538f, 0.929f, 7.27f, 0.929f, 7.27f)
            }
        }.build()

        return _SiPhoneAddCall!!
    }

@Suppress("ObjectPropertyName")
private var _SiPhoneAddCall: ImageVector? = null
