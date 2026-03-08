package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiSouthEastCircle: ImageVector
    get() {
        if (_SiSouthEastCircle != null) {
            return _SiSouthEastCircle!!
        }
        _SiSouthEastCircle = ImageVector.Builder(
            name = "Regular.SiSouthEastCircle",
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
                moveToRelative(8f, 8f)
                lineToRelative(8f, 8f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(-5f)
                moveToRelative(0f, 5f)
                horizontalLineToRelative(-5f)
                moveToRelative(11f, -4f)
                curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.523f, 2f, 12f)
                reflectiveCurveTo(6.477f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            }
        }.build()

        return _SiSouthEastCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SiSouthEastCircle: ImageVector? = null
