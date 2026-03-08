package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiMail: ImageVector
    get() {
        if (_SiMail != null) {
            return _SiMail!!
        }
        _SiMail = ImageVector.Builder(
            name = "Regular.SiMail",
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
                moveToRelative(5f, 7.06f)
                lineToRelative(6.87f, 5.89f)
                curveToRelative(0.07f, 0.06f, 0.19f, 0.06f, 0.26f, 0f)
                lineTo(19f, 7.06f)
                moveTo(3.2f, 4f)
                horizontalLineToRelative(17.6f)
                curveToRelative(0.66f, 0f, 1.2f, 0.54f, 1.2f, 1.2f)
                verticalLineToRelative(12.4f)
                curveToRelative(0f, 1.32f, -1.08f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(4.4f)
                curveTo(3.08f, 20f, 2f, 18.92f, 2f, 17.6f)
                verticalLineTo(5.2f)
                curveTo(2f, 4.54f, 2.54f, 4f, 3.2f, 4f)
            }
        }.build()

        return _SiMail!!
    }

@Suppress("ObjectPropertyName")
private var _SiMail: ImageVector? = null
