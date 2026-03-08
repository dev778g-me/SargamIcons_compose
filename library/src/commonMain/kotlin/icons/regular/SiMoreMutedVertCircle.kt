package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiMoreMutedVertCircle: ImageVector
    get() {
        if (_SiMoreMutedVertCircle != null) {
            return _SiMoreMutedVertCircle!!
        }
        _SiMoreMutedVertCircle = ImageVector.Builder(
            name = "Regular.SiMoreMutedVertCircle",
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
                moveTo(11.95f, 12.05f)
                horizontalLineToRelative(0.1f)
                moveToRelative(-0.1f, 4f)
                horizontalLineToRelative(0.1f)
                moveToRelative(-0.1f, -8f)
                horizontalLineToRelative(0.1f)
                moveTo(22f, 12f)
                curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.523f, 2f, 12f)
                reflectiveCurveTo(6.477f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            }
        }.build()

        return _SiMoreMutedVertCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SiMoreMutedVertCircle: ImageVector? = null
