package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiCopyrightAlt: ImageVector
    get() {
        if (_SiCopyrightAlt != null) {
            return _SiCopyrightAlt!!
        }
        _SiCopyrightAlt = ImageVector.Builder(
            name = "Regular.SiCopyrightAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.23f, 13.697f)
                curveTo(14.974f, 15.095f, 13.767f, 16f, 12.142f, 16f)
                curveToRelative(-2.076f, 0f, -3.373f, -1.535f, -3.373f, -3.992f)
                verticalLineToRelative(-0.01f)
                curveTo(8.77f, 9.534f, 10.062f, 8f, 12.137f, 8f)
                curveToRelative(1.61f, 0f, 2.865f, 1.011f, 3.092f, 2.478f)
                moveTo(22f, 12f)
                curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.477f, 2f, 12f)
                reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
                close()
            }
        }.build()

        return _SiCopyrightAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiCopyrightAlt: ImageVector? = null
