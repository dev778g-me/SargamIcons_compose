package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiCrop: ImageVector
    get() {
        if (_SiCrop != null) {
            return _SiCrop!!
        }
        _SiCrop = ImageVector.Builder(
            name = "Duotone.SiCrop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(6f, 6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(12f)
                verticalLineTo(6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(16f)
                moveToRelative(4f, -4f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
            }
        }.build()

        return _SiCrop!!
    }

@Suppress("ObjectPropertyName")
private var _SiCrop: ImageVector? = null
