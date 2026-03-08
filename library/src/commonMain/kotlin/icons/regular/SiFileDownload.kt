package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiFileDownload: ImageVector
    get() {
        if (_SiFileDownload != null) {
            return _SiFileDownload!!
        }
        _SiFileDownload = ImageVector.Builder(
            name = "Regular.SiFileDownload",
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
                moveToRelative(8f, 12f)
                lineToRelative(4f, 4f)
                moveToRelative(0f, 0f)
                lineToRelative(4f, -4f)
                moveToRelative(-4f, 4f)
                verticalLineTo(4f)
                moveToRelative(7f, 13f)
                verticalLineToRelative(0.6f)
                curveToRelative(0f, 1.33f, -1.07f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(7.4f)
                curveTo(6.07f, 20f, 5f, 18.93f, 5f, 17.6f)
                verticalLineTo(17f)
            }
        }.build()

        return _SiFileDownload!!
    }

@Suppress("ObjectPropertyName")
private var _SiFileDownload: ImageVector? = null
