package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiUpTwoHeaded: ImageVector
    get() {
        if (_SiUpTwoHeaded != null) {
            return _SiUpTwoHeaded!!
        }
        _SiUpTwoHeaded = ImageVector.Builder(
            name = "Filled.SiUpTwoHeaded",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 20f)
                verticalLineToRelative(-8.586f)
                lineToRelative(-2.293f, 2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.414f, -1.414f)
                lineTo(11f, 8.586f)
                verticalLineTo(6.414f)
                lineTo(8.707f, 8.707f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.414f, -1.414f)
                lineToRelative(4f, -4f)
                lineToRelative(0.076f, -0.068f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.338f, 0.068f)
                lineToRelative(4f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.414f, 1.414f)
                lineTo(13f, 6.414f)
                verticalLineToRelative(2.172f)
                lineToRelative(3.707f, 3.707f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.414f, 1.414f)
                lineTo(13f, 11.414f)
                verticalLineTo(20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.build()

        return _SiUpTwoHeaded!!
    }

@Suppress("ObjectPropertyName")
private var _SiUpTwoHeaded: ImageVector? = null
