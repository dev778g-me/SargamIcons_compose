package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiRupee: ImageVector
    get() {
        if (_SiRupee != null) {
            return _SiRupee!!
        }
        _SiRupee = ImageVector.Builder(
            name = "Duotone.SiRupee",
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
                moveTo(7f, 4f)
                horizontalLineToRelative(3.75f)
                curveToRelative(1.393f, 0f, 2.728f, 0.474f, 3.713f, 1.318f)
                reflectiveCurveTo(16f, 7.307f, 16f, 8.5f)
                reflectiveCurveToRelative(-0.553f, 2.338f, -1.537f, 3.182f)
                curveToRelative(-0.985f, 0.844f, -2.32f, 1.318f, -3.712f, 1.318f)
                horizontalLineTo(7f)
                lineToRelative(8.2f, 7f)
                moveTo(7f, 8.5f)
                horizontalLineToRelative(11f)
                moveTo(11f, 4f)
                horizontalLineToRelative(7f)
            }
        }.build()

        return _SiRupee!!
    }

@Suppress("ObjectPropertyName")
private var _SiRupee: ImageVector? = null
