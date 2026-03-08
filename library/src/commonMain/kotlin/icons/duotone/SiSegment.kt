package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiSegment: ImageVector
    get() {
        if (_SiSegment != null) {
            return _SiSegment!!
        }
        _SiSegment = ImageVector.Builder(
            name = "Duotone.SiSegment",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(12f, 12f)
                horizontalLineToRelative(8f)
                moveTo(4f, 8f)
                horizontalLineToRelative(16f)
                moveToRelative(-8f, 8f)
                horizontalLineToRelative(8f)
            }
        }.build()

        return _SiSegment!!
    }

@Suppress("ObjectPropertyName")
private var _SiSegment: ImageVector? = null
